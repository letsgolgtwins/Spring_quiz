package com.quiz.retry.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson02.Service.StoreServiceRetry;
import com.quiz.retry.lesson02.domain.StoreRetry;

@RestController
public class Lesson02Quiz01RestControllerRetry {

	@Autowired // DI
	private StoreServiceRetry storeServiceRetry;

	// http://localhost:8080/retry/lesson02/quiz01
	@RequestMapping("/retry/lesson02/quiz01")
	public List<StoreRetry> quiz01() {
		return storeServiceRetry.getStoreList();
	}
}
