package com.quiz.retry.lesson06.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson06.domain.BookmarkRetry;
import com.quiz.retry.lesson06.mapper.BookmarkMapperRetry;

@Service
public class BookmarkServiceRetry {

	@Autowired
	private BookmarkMapperRetry bookmarkMapperRetry;
	
	// quiz01 db에 insert
	public void addBookmark(String name, String url) {
		bookmarkMapperRetry.insertBookmark(name, url);
	}
	
	// quiz01 db에서 select
	public List<BookmarkRetry> getBookmarkList() {
		return bookmarkMapperRetry.selectBookmarkList();
	}
	
	// quiz02 db에서 select 
	public List<BookmarkRetry> getBookmarkListByUrl(String url) {
		return bookmarkMapperRetry.selectBookmarkListByUrl(url);
	}
	
}
