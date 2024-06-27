package com.quiz.retry.lesson04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.retry.lesson04.Service.SellerServiceRetry2;
import com.quiz.retry.lesson04.domain.SellerRetry2;

@RequestMapping("/retry/lesson04/quiz01/2nd")
@Controller
public class Lesson04Quiz01ControllerRetry2 {

	@Autowired
	private SellerServiceRetry2 sellerServiceRetry2;

	// 1. 입력 form창으로 이동
	// http://localhost:8080/retry/lesson04/quiz01/2nd/add-seller-retry2
	@GetMapping("/add-seller-retry2")
	public String addSeller() {
		return "lesson04/addSellerRetry2";
	}

	// (2.문제 자체 변경) 가장 최근에 추가된 seller의 정보를 테이블의 형태로 출력
	// postM
	@PostMapping("/add-seller-retry2")
	public String addSellerRetry2(SellerRetry2 sellerRetry2, Model model) {
		// db에 insert
		sellerServiceRetry2.addSellerRetry2(sellerRetry2);

		// db에서 select
		List<SellerRetry2> sellerList = new ArrayList<>();
		sellerList = sellerServiceRetry2.getSellerRetry2();

		// model에 담기
		model.addAttribute("sellerInfo", sellerList);

		// seller 리스트 테이블 화면
		return "lesson04/afterAddSellerRetry2";
	}

	// 3. id를 파라미터로 받아서 그 id에 해당하는 seller 정보 뿌리기 (id 파라미터가 없는 경우와 있는 경우 모두 포함)
	// http://localhost:8080/retry/lesson04/quiz01/2nd/seller-info-view?id=
	@GetMapping("/seller-info-view")
	public String latestSellerView(@RequestParam("id") int id, Model model) {
		// db에 insert
		sellerServiceRetry2.addSellerRetry2();

		// db에서 select
		List<SellerRetry2> sellerList = new ArrayList<>();
		sellerList = sellerServiceRetry2.getSellerRetry2();

		// model에 담기
		model.addAttribute("sellerInfo", sellerList);

		// seller 리스트 테이블 화면
		return "lesson04/latestSellerRetry2";
	}

}
