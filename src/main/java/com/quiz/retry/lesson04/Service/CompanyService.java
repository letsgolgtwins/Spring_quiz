package com.quiz.retry.lesson04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson04.domain.Company;
import com.quiz.retry.lesson04.mapper.CompanyMapper;

@Service
public class CompanyService {

	@Autowired
	private CompanyMapper companyMapper;
	
	// db에 insert
	public void addCompany(Company company) {
		companyMapper.insertCompany(company);
	}
	
	// db에서 select
	public Company getCompanyById(int id) {
		return companyMapper.selctCompanyById(id);
	}
}
