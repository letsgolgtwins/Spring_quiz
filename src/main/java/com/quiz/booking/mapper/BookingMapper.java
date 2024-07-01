package com.quiz.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.booking.domain.Booking;

@Mapper
public interface BookingMapper {

	// db에서 select
	public List<Booking> selectBookingList();

	// db에 insert
	public void insertBooking(Booking booking);

	// db에서 delete
	public int deleteBookingById(int id);
}
