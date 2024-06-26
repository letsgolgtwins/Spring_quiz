package com.quiz.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.BO.BookMarkBO;
import com.quiz.lesson06.domain.BookMark;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {

	@Autowired
	private BookMarkBO bookMarkBO;
	
	// 즐겨찾기 추가하기 페이지
	// http://localhost:8080/lesson06/quiz01
	@GetMapping("/quiz01")
	public String addBookmark() {
		return "lesson06/addBookmark";
	}
	
	// ajax 통신에 데이터 전송
	// /lesson06/add-bookmark
	@ResponseBody
	@PostMapping("/add-bookmark")
	public String addBookMark(
			@RequestParam("name") String name,
			@RequestParam("url") String url /*, Model model*/) {
		
		// insert
		bookMarkBO.addBookMark(name, url);

		// 응답값. 추후 사용
		return "성공ㅋㅋ";
	}
	
	// http://localhost:8080/lesson06/after-add-bookmark
	@GetMapping("/after-add-bookmark")
	public String afterAddBookMark(Model model) {

		// select
		List<BookMark> bookmarks = bookMarkBO.getBookMark();
		
		// model에 담기
		model.addAttribute("result", bookmarks);
		
		// 최종 화면
		return "lesson06/afterBookmark";
	}
}
