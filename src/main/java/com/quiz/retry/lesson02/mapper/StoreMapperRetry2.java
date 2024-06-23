package com.quiz.retry.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson02.domain.StoreRetry2;

@Mapper
public interface StoreMapperRetry2 {

	// input: X & output: List
	public List<StoreRetry2> selectStore();
}
