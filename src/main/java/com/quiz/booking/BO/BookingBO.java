package com.quiz.booking.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.booking.domain.Booking;
import com.quiz.booking.mapper.BookingMapper;

@Service
public class BookingBO {

	@Autowired
	private BookingMapper bookingMapper;
	
	// db에서 여러행 select
	public List<Booking> getBookingList() {
		return bookingMapper.selectBookingList();
	}
	
	// db에 insert
	public void addBooking(Booking booking) {
		bookingMapper.insertBooking(booking);
	}
	
	// db에서 delete
	public int deleteBookingById(int id) {
		return bookingMapper.deleteBookingById(id);
	}
	
	// db에서 select - 내 풀이
	public List<Booking> getBookingByNameAndPhoneNumber(String name, String phoneNumber) {
		return bookingMapper.selectBookingByNameAndPhoneNumber(name, phoneNumber);
	}
	
	// 선생님 모범답안 - i: name, phoneNumber o: Booking(최신) or null
	public Booking getLatestBookingByNameAndPhoneNumber(String name, String phoneNumber) {
		List<Booking> bookingList = bookingMapper.selectBookingListByNameAndPhoneNumber(name, phoneNumber);
		// 근데, bookingList는 비어있을 수도 있다 
		// 없을 때: [] / 있을 때: [booking1, booking2, ...]
		if (bookingList.isEmpty()) { // 비어있으면 
			return null; // null을 리턴
		} else {
			return bookingList.get(bookingList.size() - 1); // 마지막 index번호의(최신) 값을 return 
		} // 삼항 연산자로도 풀어볼 것
	}
	
}
