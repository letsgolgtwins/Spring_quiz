package com.quiz.lesson07.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> {

	// lesson07 quiz02 JPQL 문법 문재
	public List<RecruitEntity> findAllById(int id); // 1.
	
	public List<RecruitEntity> findAllByCompanyId(int companyId);
}
