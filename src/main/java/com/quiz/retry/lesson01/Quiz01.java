package com.quiz.retry.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/retry/lesson01/quiz01")
@Controller
public class Quiz01 {

	// http://localhost:8080/retry/lesson01/quiz01/1
	@ResponseBody
	@RequestMapping("/1")
	public String quiz01_1() {
		return "<h2>테스트 프로젝트 완성</h2> "
				+ "<h4>해당 프로젝트를 통해서 문제풀이를 진행합니다.</h4>";
	}
	
	// http://localhost:8080/retry/lesson01/quiz01/2
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Object> quiz01_2() {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("국어", 80);
		map1.put("수학", 90);
		map1.put("영어", 85);
		return map1; // return 값을 꼭 지칭해줘야 한다.
	}
}
