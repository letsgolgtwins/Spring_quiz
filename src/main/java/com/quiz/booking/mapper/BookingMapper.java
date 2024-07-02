package com.quiz.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.booking.domain.Booking;

@Mapper
public interface BookingMapper {

	// db에서 select
	public List<Booking> selectBookingList();

	// db에 insert
	public void insertBooking(Booking booking);

	// db에서 delete
	public int deleteBookingById(int id);
	
	// db에서 select - 내 풀이
	public List<Booking> selectBookingByNameAndPhoneNumber(
			@Param("name") String name, 
			@Param("phoneNumber") String phoneNumber
			);
	
	// 선생님 모범답안 - i: name, phoneNumber/ o:List 
	public List<Booking> selectBookingListByNameAndPhoneNumber(
			@Param("name") String name, 
			@Param("phoneNumber") String phoneNumber
			);
	
}
