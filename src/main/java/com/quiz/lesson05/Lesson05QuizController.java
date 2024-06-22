package com.quiz.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05QuizController {

	// httP://localhost:8080/lesson05/quiz01
	@GetMapping("/quiz01")
	public String quiz01() {
		return "lesson05/quiz01";
	}

	// httP://localhost:8080/lesson05/quiz02
	@GetMapping("/quiz02")
	public String quiz02() {
		// quiz02_1
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");

		// quiz02_2
		List<Map<String, Object>> membership = new ArrayList<>();

		Map<String, Object> member1 = new HashMap<>();
		member1.put("name", "손오공");
		member1.put("phoneNumber", "010-1234-5678");
		member1.put("grade", "VIP");
		member1.put("point", 12040);
		membership.add(member1);

		Map<String, Object> member2 = new HashMap<>();
		member2.put("name", "저팔계");
		member2.put("phoneNumber", "010-4321-1234");
		member2.put("grade", "BASIC");
		member2.put("point", 3420);
		membership.add(member2);

		Map<String, Object> member3 = new HashMap<>();
		member3.put("name", "사오정");
		member3.put("phoneNumber", "010-8888-1111");
		member3.put("grade", "GOLD");
		member3.put("point", 1530);
		membership.add(member3);

		Map<String, Object> member4 = new HashMap<>();
		member4.put("name", "삼장");
		member4.put("phoneNumber", "010-0000-1234");
		member4.put("grade", "GOLD");
		member4.put("point", 8450);
		membership.add(member4);

		Map<String, Object> member5 = new HashMap<>();
		member5.put("name", "우마왕");
		member5.put("phoneNumber", "010-1111-2222");
		member5.put("grade", "BASIC");
		member5.put("point", 420);
		membership.add(member5);

		// 최종 화면
		return "lesson05/quiz02";
	}
}
