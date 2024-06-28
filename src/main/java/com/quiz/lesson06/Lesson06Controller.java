package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public Map<String, Object> /*String*/ addBookMark(
			@RequestParam("name") String name,
			@RequestParam("url") String url /*, Model model*/) {
		
		// insert
		bookMarkBO.addBookMark(name, url);

		// 응답값. 추후 사용
		/*return "성공ㅋㅋ"; */
				
		// 성공 여부에 대한 JSON
		// {"code":200, "result":"성공!"}
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공!");
		return result; // JSON String
	}
	
	// AJAX 에서 url 중복확인
	@ResponseBody
	@PostMapping("/check-duplicate")
	public Map<String, Object> checkDuplicate(
			@RequestParam("url") String url) {
		
		// boolean
		boolean isDuplicate = bookMarkBO.isDuplicateByUrl(url);
		
		// JSON
		Map<String, Object> result2 = new HashMap<>();
		result2.put("data", 200);
		result2.put("is_Duplication", isDuplicate);
			
		return result2;
	}
	
	// http://localhost:8080/lesson06/after-add-bookmark
	@GetMapping("/after-add-bookmark")
	public String afterAddBookMark(Model model) {

		// select
		List<BookMark> bookmarks = bookMarkBO.getBookMarkList();
		
		// model에 담기
		model.addAttribute("result", bookmarks);
		
		// 최종 화면
		return "lesson06/afterBookmark";
	}
	
	// 2. 삭제 AJAX 요청 - id로 삭제
	// http://localhost:8080/lesson06/delete-bookmark?id=46
	@ResponseBody
	@DeleteMapping("/delete-bookmark") 
	public Map<String, Object> deleteBookmark(
			@RequestParam("id") int id) { // id로 삭제하는 것이기 떄문에 
		
		// db에서 delete
		int rowCount = bookMarkBO.deleteBookMarkListById(id);
		
		// 응답 JSON
		Map<String, Object> result = new HashMap<>();
		if (rowCount > 0) { // 삭제 성공
			result.put("code", 200);
			result.put("result", "성공");			
		} else { // 삭제 실패
			result.put("code", 500);
			result.put("error_message", "삭제할 항목이 존재하지 않습니다.");
		}
		
		return result;
	}
	
}
