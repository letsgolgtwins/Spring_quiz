package com.quiz.baetalMinjok;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/baetalMinjok")
@Controller
public class BaetalMinjokController {

	// 1. 우리동네 가게 리스트 페이지
	// http://localhost:8080/baetalMinjok/store-list-view
	@GetMapping("/store-list-view")
	public String storeListView() {
		return "baetalMinjok/storeList";
	}

	// 2. 가게 리스트select
	// http://localhost:8080/baetalMinjok/store-list
	@PostMapping("/store-list")
	public List<BaetalMinjok> storeList(Model model) {
		
	}
}
