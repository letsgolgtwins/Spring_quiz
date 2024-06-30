package com.quiz.retry.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson06.domain.BookMarkRetry;

@Mapper
public interface BookMarkMapperRetry {

	// db에 insert
	public int insertBookMarkList(BookMarkRetry bookMarkRetry);
	
	// db에서 select
	public List<BookMarkRetry> selectBookMarkList(BookMarkRetry bookMarkRetry);
	
	// db에서 중복확인 - count 방식
	//public boolean checkBookMarkById(String url);

	// db에서 중복확인 - url 방식
	// i: url / o: List
	public List<BookMarkRetry> selectBookMarkListByUrl(String url);
	
}
