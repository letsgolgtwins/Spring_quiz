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
	
	// 선생님 풀이 
	// i: url / o: List<Bookmark>
	public List<BookMark> selectBookmarkListByUrl(String url);
	
	// 내 풀이
	// public boolean isDuplicateByUrl(String url);
	
	// delete
	public int deleteBookMarkListById(int id);
}
