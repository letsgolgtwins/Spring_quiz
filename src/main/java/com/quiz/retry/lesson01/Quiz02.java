package com.quiz.retry.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/retry/lesson01/quiz02")
@RestController
public class Quiz02 {

	// http://localhost:8080/retry/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("rate", 15);
		map1.put("director", "봉준호");
		map1.put("time", 131);
		map1.put("title", "기생충");
		list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("rate", 0);
		map1.put("director", "로베르토 베니니");
		map1.put("time", 116);
		map1.put("title", "인생은 아름다워");
		list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("rate", 12);
		map1.put("director", "크리스토퍼 놀란");
		map1.put("time", 147);
		map1.put("title", "인셉션");
		list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("rate", 19);
		map1.put("director", "윤종빈");
		map1.put("time", 133);
		map1.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("rate", 15);
		map1.put("director", "프란시스 로렌스");
		map1.put("time", 137);
		map1.put("title", "헝거게임");
		list.add(map1);
		
		return list;
	}
	
	// http://localhost:8080/retry/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<Introduce> quiz02_2() {
		List<Introduce> list2 = new ArrayList<>();
		
		Introduce intro1 = new Introduce();
		intro1.setTitle("안녕하세요. 가입인사 드립니다.");
		intro1.setUser("marobiana");
		intro1.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		list2.add(intro1);
		
		Introduce intro2 = new Introduce();
		intro2.setTitle("헐 대박");
		intro2.setUser("bada");
		intro2.setContent("오늘 목요일이었어... 금요일인줄");
		list2.add(intro2);
		
		Introduce intro3 = new Introduce();
		intro3.setContent("오늘 데이트 한 이야기 해드릴게요.");
		intro3.setUser("dulumary");
		intro3.setContent("...");
		list2.add(intro3);
		
		return list2;
	}
	
	// http://localhost:8080/retry/lesson01/quiz02/3
	@RequestMapping("/3")
	public ResponseEntity<Introduce> quiz02_3() {
		Introduce intro = new Introduce();
		intro.setTitle("안녕하세요. 가입인사 드립니다.");
		intro.setUser("marobiana");
		intro.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");

		return new ResponseEntity<>(intro, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
