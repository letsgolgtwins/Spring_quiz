package com.quiz.retry.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.retry.lesson06.domain.BookmarkRetry;

@Mapper
public interface BookmarkMapperRetry {

	// quiz01 db애 insert
	public void insertBookmark(
			@Param("name") String name, 
			@Param("url") String url
			);
	
	// quiz01 db에서 select
	public List<BookmarkRetry> selectBookmarkList();
	
	// quiz02 db에서 select
	public List<BookmarkRetry> selectBookmarkListByUrl(String url);
}
