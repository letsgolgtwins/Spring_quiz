package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {

	// 즐겨찾기 추가하기 페이지로 이동
	// http://localhost:8080/lesson06/quiz01
	@GetMapping("/quiz01")
	public String AddBookmark() {
		return "lesson06/addBookmark";
	}
}
