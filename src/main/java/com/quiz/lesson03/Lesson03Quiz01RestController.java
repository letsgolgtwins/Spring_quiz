package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.BO.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {

	@Autowired
	private RealEstateBO realEstateBO;

	// http://localhost:8080/lesson03/quiz01/01
	// http://localhost:8080/lesson03/quiz01/01?id=3	
	@RequestMapping("/01")
	public RealEstate quiz01_1(@RequestParam("id") int id) {
		return realEstateBO.getRealEstateById(id);
	}
	
	// http://localhost:8080/lesson03/quiz01/02
	// http://localhost:8080/lesson03/quiz01/02?rentPrice=100
	@RequestMapping("/02")
	public List<RealEstate> quiz01_2(@RequestParam(value = "rentPrice", defaultValue = "100") Integer rentPrice) {
		 return realEstateBO.getRealEstateByRentPrice(rentPrice);
	}
}
