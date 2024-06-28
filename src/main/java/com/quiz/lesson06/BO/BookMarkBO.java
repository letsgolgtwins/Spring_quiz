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
	
	// 선생님 풀이
	public boolean isDuplicateByUrl(String url) {
		// 중복일 경우 - [bookmark1, bookmark2] 
		// 중복이 아닐 경우 - [] 비어있는 리스트
		List<BookMark> bookmarkList = bookMarkMapper.selectBookmarkListByUrl(url);
		return bookmarkList.isEmpty() ? false : true; // 삼항 연산자 (if문으로 해도됨)
	}
	
	// 내 풀이 boolean - i: url / o: boolean
	// public boolean isDuplicateByUrl(String url) {
	//	return bookMarkMapper.isDuplicateByUrl(url);
	// }
	
	// delete
	public int deleteBookMarkListById(int id) {
		return bookMarkMapper.deleteBookMarkListById(id);
	}
}
