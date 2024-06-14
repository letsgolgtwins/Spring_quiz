package com.quiz.retry.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson02.domain.StoreRetry;

@Mapper
public interface StoreMapperRetry {

	// input: X (Service로 부터 요청 받음)
	// output: List<domain> 근데 인터페이스
	public List<StoreRetry> selectStoreListRetry();
}
