package com.quiz.retry.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson02.Service.StoreServiceRetry2;
import com.quiz.retry.lesson02.domain.StoreRetry2;

@RequestMapping("/retry/lesson02/quiz01/")
@RestController
public class Lesson02Quiz01RestControllerRetry2 {

	@Autowired
	private StoreServiceRetry2 storeServiceRetry2;
	
	// http://localhost:8080/retry/lesson02/quiz01/2nd
	@GetMapping("/2nd")
	public List<StoreRetry2> quiz01() {
		return storeServiceRetry2.getStore();
	}
	
}
