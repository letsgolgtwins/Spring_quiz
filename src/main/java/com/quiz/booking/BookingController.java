package com.quiz.booking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.booking.BO.BookingBO;
import com.quiz.booking.domain.Booking;

@RequestMapping("/booking")
@Controller
public class BookingController {

	@Autowired
	private BookingBO bookingBO;
	
	// 1. 예약 목록 - 화면 뿌리고& db에서 select
	// http://localhost:8080/booking/booking-list-view
	@GetMapping("/booking-list-view")
	public String bookingListView(Model model) {
		// db에서 select
		List<Booking> bookingList = bookingBO.getBookingList();
	
		// model에 담기
		model.addAttribute("bookingList", bookingList);
		
		return "booking/bookingList";
	}
	
	// 1. 삭제하기 
	// /booking/delete-bookingList
	@ResponseBody
	@DeleteMapping("/delete-bookingList")
	public Map<String, Object> deleteBookingList(
			@RequestParam("id") int id) {
		
		// delete from DB
		int count = bookingBO.deleteBookingById(id);
		
		// 응답 JSON
		// {"code":200, "message":"성공"}
		Map<String, Object> deleteResult = new HashMap<>();
		if (count > 0) { // 삭제 성공인셈
			deleteResult.put("code", 200);
			deleteResult.put("successMessage", "성공");			
		} else { 
			deleteResult.put("code", 500);
			deleteResult.put("errorMessage", "삭제할 항목 없음.");			
		}
		
		return deleteResult;
		
	}
	

	// 2. 예약하기 페이지 - 예약목록 화면의 메뉴의 링크로 들어가야 하니 getmapping
	// http://localhost:8080/booking/make-booking-view
	@GetMapping("/make-booking-view")
	public String makeBookingView() {
		return "booking/makeBooking";
	}
	
	// 2. AJAX로 예약하기 db에 insert
	// /booking/add-booking
	@ResponseBody
	@PostMapping("/add-booking")
	public Map<String, Object> addBooking(Booking booking) {
		// db에 insert
		bookingBO.addBooking(booking);
		
		// 응답 JSON {"code":200, "message":"성공"}
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("message", "성공");
		
		return result;
	}
	
	
}
