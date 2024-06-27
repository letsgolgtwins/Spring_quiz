package com.quiz.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson06.domain.BookMark;

@Mapper
public interface BookMarkMapper {

	// insert
	public int insertBookMark(
			@Param("name") String name, 
			@Param("url") String url
			);
	
	// select
	public List<BookMark> selectBookMarkList();
	
	// boolean
	public boolean isDuplicateByUrl(String url);
}
