package com.quiz.retry.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson04.domain.Company;

@Mapper
public interface CompanyMapper {

	// db에 insert
	public void insertCompany(Company company);
	
	// db에서 select
	public Company selctCompanyById(int id);
}
