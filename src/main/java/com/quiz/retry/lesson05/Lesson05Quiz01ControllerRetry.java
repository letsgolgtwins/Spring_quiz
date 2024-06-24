package com.quiz.retry.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/retry/lesson05/quiz01")
@Controller
public class Lesson05Quiz01ControllerRetry {

	// http://localhost:8080/retry/lesson05/quiz01/01
	@GetMapping("/01")
	public String quiz01() {
		return "lesson05/quiz01Retry";
	}
}
