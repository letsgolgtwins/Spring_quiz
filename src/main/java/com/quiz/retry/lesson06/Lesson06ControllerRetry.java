package com.quiz.retry.lesson06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.retry.lesson06.Service.BookMarkServiceRetry;
import com.quiz.retry.lesson06.domain.BookMarkRetry;

@RequestMapping("/retry/lesson06/quiz01")
@Controller
public class Lesson06ControllerRetry {

	@Autowired
	private BookMarkServiceRetry bookMarkServiceRetry;

	// 즐겨찾기 추가하기 페이지 이동
	// http://localhost:8080/retry/lesson06/quiz01/add-bookmark
	@GetMapping("/add-bookmark")
	public String addBookmark() {
		return "lesson06/addBookmarkRetry";
	}
	
	// AJAX 통신 db에 입력 데이터 넣는 과정
	// /retry/lesson06/quiz01/bookmarkList
	@ResponseBody
	@PostMapping("/bookmarkList")
	public Map<String, Object> bookMarkList(BookMarkRetry bookMarkRetry) {
		
		// db에 insert
		bookMarkServiceRetry.insertBookMarkList(bookMarkRetry);
		
		// 응답 JSON
		// {"code":200, "message":"성공~!"}
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("message", "성공~!");
		
		return result;
	}
	
	// AJAX 중복확인 - count 방식
	// /retry/lesson06/quiz01/check-duplicate-by-count
	@ResponseBody
	@PostMapping("/check-duplicate-by-count")
	public Map<String, Object> checkDuplicate(
			@RequestParam("url") String url) {
		
		// count=0=false=중복아님 / count!=0=true=중복
		boolean isDuplicate = bookMarkServiceRetry.selectBookMarkListByUrl(url);
		
		// 응답 JSON
		// {"code":200, "yesDuplicate":isDuplicate}
		Map<String, Object> result2 = new HashMap<>();
		result2.put("code", 200);
		result2.put("yesDuplicate", isDuplicate);
		
		return result2;
	}
	
	// 최종 화면 뿌려주기 select
	// http://localhost:8080/retry/lesson06/quiz01/final-bookmarkList
	@GetMapping("/final-bookmarkList")
	public String finalBookMarkList(BookMarkRetry bookMarkRetry, Model model) {
		// db에서 select 
		List<BookMarkRetry> bookmarkList = bookMarkServiceRetry.getBookMarkList(bookMarkRetry);
				
		// model에 담기
		model.addAttribute("bookMarkInfo", bookmarkList);

		// 최종 화면
		return "lesson06/afterBookmarkRetry";
	}
	
}
