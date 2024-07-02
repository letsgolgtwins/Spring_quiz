package com.quiz.lesson07.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.Repository.CompanyRepository;
import com.quiz.lesson07.entity.CompanyEntity;

@Service
public class CompanyBO {

	@Autowired
	private CompanyRepository companyRepository;
	
	// lesson07 quiz01(1)
	// i: 4개의 파라미터 / o: CompanyEntity(Id도 채워져 있는)
	public CompanyEntity addCompanyEntity(String name, String busniess, String scale, int headcount) {
		CompanyEntity company = CompanyEntity.builder()
				.name(name)
				.busniess(busniess)
				.scale(scale)
				.headcount(headcount)
				.build();
		
		return companyRepository.save(company);
	}
	
	// lesson07 quiz01(2)
	public CompanyEntity addCompanyEntity2(String name, String busniess, String scale, int headcount) {
		CompanyEntity company2 = CompanyEntity.builder()
				.name(name)
				.busniess(busniess)
				.scale(scale)
				.headcount(headcount)
				.build();
		
		return companyRepository.save(company2);
	}
}
