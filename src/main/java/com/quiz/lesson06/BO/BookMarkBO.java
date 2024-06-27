package com.quiz.lesson06.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.BookMark;
import com.quiz.lesson06.mapper.BookMarkMapper;

@Service
public class BookMarkBO {

	@Autowired
	private BookMarkMapper bookMarkMapper;

	// insert
	public int addBookMark(String name, String url) {
		return bookMarkMapper.insertBookMark(name, url);
	}
	
	// select
	public List<BookMark> getBookMarkList() {
		return bookMarkMapper.selectBookMarkList();
	}
	
	// boolean 
	public boolean isDuplicateByUrl(String url) {
		return bookMarkMapper.isDuplicateByUrl(url);
	}
}
