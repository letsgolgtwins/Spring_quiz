package com.quiz.retry.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz03 {

	// http://localhost:8080/retry/lesson01/quiz03
	@RequestMapping("/retry/lesson01/quiz03")
	public String quiz03() {
		return "lesson01/quiz03Retry";
	}
}
