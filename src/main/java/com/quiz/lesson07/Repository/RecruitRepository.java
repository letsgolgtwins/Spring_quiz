package com.quiz.lesson07.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> {

	// lesson07 quiz02 JPQL 문법 문재
	// 1.
	public List<RecruitEntity> findAllById(int id); 
	// 2.
	public List<RecruitEntity> findAllByCompanyId(int companyId); 
	// 3. 
	public List<RecruitEntity> findByPositionAndType(String Job, String type); 
	// 4.
	public List<RecruitEntity> findByTypeOrSalaryGreaterThan(String type, int salary);
	// 5.
	public List<RecruitEntity> findTop3ByTypeOrderBySalaryDesc(String type); 
	// 6. 
	public List<RecruitEntity> findByRegionAndSalaryBetween(String region, int startSalary, int endSalary);  
}
