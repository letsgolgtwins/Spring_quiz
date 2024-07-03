package com.quiz.retry.booking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.booking.domain.BookingRetry;
import com.quiz.retry.booking.mapper.BookingMapperRetry;

@Service
public class BookingServiceRetry {

	@Autowired
	private BookingMapperRetry bookingMapperRetry;
	
	// db에서 여러건 select
	public List<BookingRetry> getBookingList() {
		return bookingMapperRetry.selectBookingList();
	}
	
	// db에서 delete
	public int deleteBookingListById(int id) {
		return bookingMapperRetry.deleteBookingListById(id);
	}
	
	// db에 insert
	public int addBookingList(BookingRetry bookingRetry) {
		return bookingMapperRetry.insertBookingList(bookingRetry);
	}
}
