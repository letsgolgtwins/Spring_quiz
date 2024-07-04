package com.quiz.retry.lesson07.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson07.Entity.CompanyEntityRetry;
import com.quiz.retry.lesson07.Repository.CompanyRepositoryRetry;

@Service
public class CompanyBORetry {

	@Autowired
	private CompanyRepositoryRetry companyRepositoryRetry;
	
	// 1_1, 1_2. create
//	public CompanyEntityRetry addCompanyEntity(String name, String busniess, String scale, int headcount) {
//		CompanyEntityRetry companyEntityRetry = CompanyEntityRetry.builder()
//				.name(name)
//				.busniess(busniess)
//				.scale(scale)
//				.headcount(headcount)
//				.build();
//		
//		return companyRepositoryRetry.save(companyEntityRetry);
//	}
	
	// 1_1, 1_2. create 또다른 방법
	public CompanyEntityRetry addCompanyEntity(String name, String busniess, String scale, int headcount) {
		return companyRepositoryRetry.save(
				CompanyEntityRetry.builder()
				.name(name)
				.busniess(busniess)
				.scale(scale)
				.headcount(headcount)
				.build()
				);
	}
}
