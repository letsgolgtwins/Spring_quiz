package com.quiz.lesson07.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> { // 제네릭은 엔티티이름, Primary key자료형

	// lesson07 quiz02 JPQL 문법 문재
	// 1.
	public RecruitEntity findById(int id); 
	// JPQL: Entity에 조회하는 개념 vs SQL: DB에 조회하는 개념
	// 2.
	public List<RecruitEntity> findAllByCompanyId(int companyId); 
	// 3. 
	public List<RecruitEntity> findByPositionAndType(String Job, String type); 
	// 4.
	public List<RecruitEntity> findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	// 5.
	public List<RecruitEntity> findTop3ByTypeOrderBySalaryDesc(String type); 
	// 6. 
	public List<RecruitEntity> findByRegionAndSalaryBetween(String region, int startSalary, int endSalary);  

	// 7. - native query 로 풀기
	@Query(value = "select * from `recruit` where `deadline` > :deadline and `salary` >= :salary and `type` = :type order by `salary` desc", nativeQuery = true)
	// 7. - Entity로 풀기
	// @Query(value = "select r from `recruit` r where r.deadline > :deadline and r.salary >= :salary and r.type = :type order by r.salary desc")
	public List<RecruitEntity> findByDeadlineAndSalaryAndType( 
			@Param("type") String type,
			@Param("deadline") String deadline, 
			@Param("salary") int salary
			); 
}
