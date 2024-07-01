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
	
	// db에서 count select
	public int getBookingByNameAndPhoneNumber(String name, String phoneNumber) {
		return bookingMapper.selectBookingByNameAndPhoneNumber(name, phoneNumber);
				
	}
}
