package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson02.BO.StoreBO;
import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@RestController
public class Lesson02Quiz01StoreRestController {

	// @Autowired로 BO쪽의 '객체'를 가져오는 셈
	@Autowired
	public StoreBO storeBO; 
	
	// http://localhost:8080/lesson02/quiz01
	@RequestMapping("/lesson02/quiz01")
	public List<Store> quiz01() {
		List<Store> storeList = storeBO.getStoreList();
		return storeList;
	}
	
}
