package com.quiz.retry.booking;

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

import com.quiz.retry.booking.Service.BookingServiceRetry;
import com.quiz.retry.booking.domain.BookingRetry;

@RequestMapping("/retry/booking")
@Controller
public class BookingControllerRetry {

	@Autowired
	private BookingServiceRetry bookingServiceRetry;
	
	// 1. 예약목록 페이지로 가는 getmapping + db에서 select 한 것들 화면에 뿌려줌
	// http://localhost:8080/retry/booking/booking-list-view
	@GetMapping("/booking-list-view")
	public String bookingListView(Model model) {
		// db에서 여러건 select
		List<BookingRetry> bookingList = bookingServiceRetry.getBookingList();
		
		// model에 담기
		model.addAttribute("bookingInfo", bookingList);

		return "bookingRetry/bookingList";
	}
	
	// 2. 예약하기 페이지 
	// http://localhost:8080/retry/booking/make-booking-view
	@GetMapping("/make-booking-view")
	public String makeBookingView() {
		return "bookingRetry/makeBooking";
	}
	
	// 1. AJAX로 삭제하기
	// /retry/booking/delete-booking
	@ResponseBody
	@DeleteMapping("/delete-booking")
	public Map<String, Object> deleteBooking(@RequestParam("id") int id) {
		// db에서 delete
		int rowCount = bookingServiceRetry.deleteBookingListById(id);
		
		// 응답 JSON
		Map<String, Object> deleteResult = new HashMap<>();
		if (rowCount > 0) { // 삭제 완료
			deleteResult.put("code", 200);
			deleteResult.put("yesMessage", "삭제성공");
		} else { // 삭제할 거 없음
			deleteResult.put("code", 500);
			deleteResult.put("errorMesage", "삭제실패");
		}
		
		return deleteResult;
	}
	
	// 2. AJAX로 예약하기
	// /retry/booking/add-booking
	@ResponseBody
	@PostMapping("/add-booking")
	public Map<String, Object> addBooking(BookingRetry bookingRetry) {
		// db에 insert
		int count = bookingServiceRetry.addBookingList(bookingRetry);
		
		// 응답 JSON
		Map<String, Object> insertResult = new HashMap<>();
		if (count > 0) { // insert 성공
			insertResult.put("code", 200);
			insertResult.put("message", "success");
		} else { // insert 실패
			insertResult.put("code", 500);
			insertResult.put("message", "error. 예약실패");
		}
		
		return insertResult;
	}
	
	// 3. 예약 조회 페이지로 일단 이동
	// http://localhost:8080/retry/booking/check-bookingList-view
	@GetMapping("/check-bookingList-view")
	public String checkBookingListView() {
		return "bookingRetry/checkBooking";
	}
	
	// 3. 예약 조회 기능
	// /retry/booking/check-bookingList
	@ResponseBody
	@PostMapping("/check-bookingList")
	public Map<String, Object> checkBookingList(
			@RequestParam("name") String name, 
			@RequestParam("phoneNumber") String phoneNumber) {
		
		// db에서 list select 
		List<BookingRetry> bookingListCheck = bookingServiceRetry.getBookingListByNameAndPhoneNumber(name, phoneNumber);
		
		// 응답 JSON
		Map<String, Object> checkResult = new HashMap<>();
		if (bookingListCheck == null) { // 존재하지 않음 = 예약 조회 X
			checkResult.put("code", 500);
			checkResult.put("notExist", "not_exist");
		} else { // 존재함 = 예약 조회 O
			checkResult.put("code", 200);
			checkResult.put("isExist", bookingListCheck);
		}
		return checkResult;
	}
}
