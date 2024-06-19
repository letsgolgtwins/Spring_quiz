package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.BO.SellerBO;
import com.quiz.lesson04.domain.Seller;

@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {

	@Autowired
	private SellerBO sellerBO;
	
	// 1. seller 추가 - 입력 form
	// http://localhost:8080/lesson04/quiz01/add-seller-view
	@GetMapping("/add-seller-view") 
	public String addSellerView() { // 메소드 이름은 보통 위에 있는 링크를 카멜케이스로 만든다.
		// 가입 화면
		return "lesson04/addSeller";
	}
	
	// 1. seller 추가 - DB에 저장 후 입력 성공 문구 출력
	// http://localhost:8080/lesson04/quiz01/add-seller
	@PostMapping("/add-seller")
	public String addSeller( // 저장은 저장이고, 결과물은 html화면으로 출력할것.
			@RequestParam("nickname") String nickname,
			@RequestParam(value = "profileUrl", required = false) String profileUrl,
			@RequestParam(value = "temperature", defaultValue = "36.5") double temperature) {
		
		// DB에 insert
		sellerBO.addSeller(nickname, profileUrl, temperature);
		
		// 입력 성공 페이지
		return "lesson04/afterAddSeller";
	}
	
	
	
	// 2. seller 출력 - 가장 최근에 추가된 seller의 정보를 아래와 같은 형태로 출력 하세요.
	// http://localhost:8080/lesson04/quiz01/seller-info-view
	// 3. 2번문제의 메소드를 재사용해서 id를 parameter로 받아서 해당하는 seller 출력
	// http://localhost:8080/lesson04/quiz01/seller-info-view?id=3
	@GetMapping("/seller-info-view") // 브라우저로 치고 들어감
	public String LatestInfoView(@RequestParam(value = "id", required = false) Integer id // int id로 하면 null이 들어왔을때 에러가뜬다
			,Model model) {
		
		Seller seller = null;
		
		// 데이터 조회
		if (id == null) {
			seller = sellerBO.getSeller(); // 단건이므로 List가 아닌 Seller seller 형태로 저장함.			
		} else {
			seller = sellerBO.getSellerById(id);
		}
		
		// Model(주머니)에 데이터를 담아둔다
		model.addAttribute("result", seller);
		model.addAttribute("title", "판매자 정보");
		
		// view - HTML(주머니에서 데이터를 꺼내는 어린이) 출력 화면
		return "lesson04/latestSeller";
	}
}
