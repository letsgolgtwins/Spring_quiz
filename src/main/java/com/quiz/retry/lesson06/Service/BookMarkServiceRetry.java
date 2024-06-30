package com.quiz.retry.lesson06.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson06.domain.BookMarkRetry;
import com.quiz.retry.lesson06.mapper.BookMarkMapperRetry;

@Service
public class BookMarkServiceRetry {

	@Autowired
	private BookMarkMapperRetry bookMarkMapperRetry;
	
	// db에 insert
	public int insertBookMarkList(BookMarkRetry bookMarkRetry) {
		return bookMarkMapperRetry.insertBookMarkList(bookMarkRetry);
	}
	
	// db에서 select
	public List<BookMarkRetry> getBookMarkList(BookMarkRetry bookMarkRetry) {
		return bookMarkMapperRetry.selectBookMarkList(bookMarkRetry);
	}
	
	// db에서 중복확인 - count 방식
	//public boolean checkBookMarkById(String url) {
	//	return bookMarkMapperRetry.checkBookMarkById(url);
	//}
	
	// db에서 중복확인 - url 방식
	public boolean selectBookMarkListByUrl(String url) {
		List<BookMarkRetry> bookMarkList = bookMarkMapperRetry.selectBookMarkListByUrl(url);
		if (bookMarkList.isEmpty()) {
			return false; // 비어있다 => 0개 => 중복X 
		} else {
			return true; // 비어있지 않다 => 0개 초과 => 중복O
		}
	}
}
