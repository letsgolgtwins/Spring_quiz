package com.quiz.retry.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.retry.lesson04.Service.SellerServiceRetry;
import com.quiz.retry.lesson04.domain.SellerRetry;

@RequestMapping("/retry/lesson04/quiz01")
@Controller
public class Lesson04Quiz01ControllerRetry {
	
	@Autowired
	private SellerServiceRetry sellerServiceRetry;
	
	// http://localhost:8080/retry/lesson04/quiz01/add-seller-view
	@GetMapping("/add-seller-view")
	public String AddSellerView() {
		return "lesson04/addSellerRetry";
	}
	
	// http://localhost:8080/retry/lesson04/quiz01/add-seller
	@PostMapping("/add-seller")
	public String AddSeller(
			@RequestParam("nickname") String nickname,
			@RequestParam("profileImageUrl") String profileImageUrl,
			@RequestParam("temperature") double temperature) {
		
		// db에 저장 - 객체로 저장 vs 필드로 저장 둘 중 선택
		sellerServiceRetry.addSellerRetry(nickname, profileImageUrl, temperature);
		
		// 최종 화면으로 드개제~
		return "lesson04/afterAddSellerRetry";
	}
	
	// 가장 최근에 추가된 seller의 정보를 출력
	// http://localhost:8080/retry/lesson04/quiz01/seller-info-view
	// http://localhost:8080/retry/lesson04/quiz01/seller-info-view?id=3
	@GetMapping("/seller-info-view")
	public String SellerInfoView(
			@RequestParam(value = "id", required = false) Integer id, Model model) {
		
		SellerRetry sellerRe = null;
		
		if (id == null) {
			// 불러오기 - select 
			sellerRe = sellerServiceRetry.getSellerRetry();			
		} else {
			// 불러오기 - select by id parameter
			sellerRe = sellerServiceRetry.getSellerRetryById(id);
		}
		
		// model에서 꺼내기
		model.addAttribute("result", sellerRe);
		model.addAttribute("title", "최신 판매자 정보를 알려드리겠습니다.");
	
		// 최종 화면
		return "lesson04/latestSellerRetry";
	}
}
