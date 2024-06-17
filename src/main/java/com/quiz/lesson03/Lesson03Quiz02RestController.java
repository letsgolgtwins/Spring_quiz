package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.BO.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz02")
@RestController
public class Lesson03Quiz02RestController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	// quiz02_1
	// http://localhost:8080/lesson03/quiz02/01
	@RequestMapping("/01")
	public String quiz02_1() {
		RealEstate realestate = new RealEstate();
		realestate.setRealtorId("3");
		realestate.setAddress("푸르지용 리버 303동 1104호");
		realestate.setArea(89);
		realestate.setType("매매");
		realestate.setPrice(100000);
		// rentPrice는 null 허용이기 때문에, 안넣어도 자동으로 null이 된다. 아니면 (null) 해줘도 되고.
		int count = realEstateBO.addRealEstate(realestate);
		return "입력 성공 : " + count;
	}
	
	// quiz02_2
	// http://localhost:8080/lesson03/quiz02/02?realtor_id=5
	@RequestMapping("/02")
	public String quiz02_2(@RequestParam("realtor_id") int realtorId) {
//		address
//		area
//		type
//		price
//		rentPrice
//		createdAt
//		updatedAt
		int rowCount = realEstateBO.addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		return "입력 성공 : " + rowCount;
	}
}
