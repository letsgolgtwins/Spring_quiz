package com.quiz.lesson07.BO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.Repository.CompanyRepository;
import com.quiz.lesson07.entity.CompanyEntity;

@Service
public class CompanyBO {

	@Autowired
	private CompanyRepository companyRepository;
	
	// lesson07 quiz01(create1)
	// i: 4개의 파라미터 / o: CompanyEntity(Id도 채워져 있는)
	public CompanyEntity addCompanyEntity(String name, String busniess, String scale, int headcount) {
		CompanyEntity company = CompanyEntity.builder()
				.name(name)
				.busniess(busniess)
				.scale(scale)
				.headcount(headcount)
				.build();
		// 얘가 select 도 하는 셈.
		return companyRepository.save(company); // select된 객체를 return 해서 돌려받겠다~
	}
	
	// lesson07 quiz01(create2) - 사실 이건 없어도 됐었다.
	public CompanyEntity addCompanyEntity2(String name, String busniess, String scale, int headcount) {
		// 이렇게 해도 된다.
		return companyRepository.save(
				CompanyEntity.builder()
				.name(name)
				.busniess(busniess)
				.scale(scale)
				.headcount(headcount)
				.build());
		// 만약 이게 이해가 안되면, 메소드에 대해 공부를 다시 할 것
	}
	
	// lesson07 quiz01(update)
	public CompanyEntity updateCompanyScaleAndHeadCountById(int id, String scale, int headcount) {
		CompanyEntity company = companyRepository.findById(id).orElse(null); // 있으면 있는 걸로 쓰겠다, 없으면 null로 하겠다~
		
		if (company != null) {
			company = company.toBuilder()
			.scale(scale)
			.headcount(headcount)
			.build(); // 뚜껑 닫기 & 위로 올라가서 객체에 다시 저장.
			
			// update and save
			company = companyRepository.save(company);
			
			// 선생님 풀이
//			company = companyRepository.save(company.toBuilder()
//				.scale(scale)
//				.headcount(headcount)
//				.build());
		}
		
		return company;
	}
	
	// lesson07 quiz01 delete
	public void deleteCompanyById(int id) {
		// orElse 말고 새로 배운 optional과 람다식을 이용해서 풀어볼 것.
		
		// Optional
		Optional<CompanyEntity> companyOptional = companyRepository.findById(id);
		
		// 람다식 (company니까 c -> 이걸가지고 삭제를 요청하는 것 delete로 (companyentity를 넘겨주겟다)
		companyOptional.ifPresent(c -> companyRepository.delete(c));
	}
}
