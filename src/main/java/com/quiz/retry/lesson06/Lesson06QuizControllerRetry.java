package com.quiz.retry.lesson06;

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

import com.quiz.retry.lesson06.Service.BookmarkServiceRetry;
import com.quiz.retry.lesson06.domain.BookmarkRetry;

@RequestMapping("/retry/lesson06/")
@Controller
public class Lesson06QuizControllerRetry {

	@Autowired
	private BookmarkServiceRetry bookmarkServiceRetry;
	
	// quiz01 즐겨찾기 추가하기 화면 이동 
	// http://localhost:8080/retry/lesson06/add-bookmark-view
	@GetMapping("/add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmarkRetry";
	}
	
	// quiz01 db에 insert
	// /retry/lesson06/add-bookmark
	@ResponseBody
	@PostMapping("/add-bookmark")
	public Map<String, Object> addBookmark(
			@RequestParam("name") String name,
			@RequestParam("url") String url) {
		
		// db에 insert
		bookmarkServiceRetry.addBookmark(name, url);
		
		// 응답 JSON
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("message", "insert성공");
		
		return result;
	}
	
	// quiz01 결과 페이지 이동
	// http://localhost:8080/retry/lesson06/bookmarkList-view
	@GetMapping("/bookmarkList-view")
	public String bookmarkListView(Model model) {
		// db에서 select 
		List<BookmarkRetry> bookmarkList = bookmarkServiceRetry.getBookmarkList();
		
		// model에 담기
		model.addAttribute("bookmarkInfo", bookmarkList);
		
		return "lesson06/afterBookmarkRetry";
	}
	
	// quiz02 중복확인 - select List로 
	// /retry/lesson06/check-bookmark
	@ResponseBody
	@PostMapping("/check-bookmark")
	public Map<String, Object> checkBookmark(
			@RequestParam("url") String url) {
		// db에서 List select (그리고 화면에 데이터를 뿌리는 게 아니기 때문에 model은 필요없음)
		List<BookmarkRetry> bookmarkList = bookmarkServiceRetry.getBookmarkListByUrl(url);
		
		// 응답 JSON
		Map<String, Object> result2 = new HashMap<>();
		if (bookmarkList.isEmpty()) { // 중복 없음
			result2.put("code", 200);
			result2.put("message", "notDuplicate");
		} else { // 중복 있음
			result2.put("code", 500);
			result2.put("message", "isDuplicate");
		}
		
		return result2;
	}
}
