package com.quiz.retry.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.retry.booking.domain.BookingRetry;

@Mapper
public interface BookingMapperRetry {

	// db에서 여러건 select
	public List<BookingRetry> selectBookingList();
	
	// db에서 delete
	public int deleteBookingListById(int id);
	
	// db에 insert
	public int insertBookingList(BookingRetry bookingRetry);
	
	// 3. 예약확인 db에서 select
	public List<BookingRetry> selectBookingListByNameAndPhoneNumber(
			@Param("name") String name,
			@Param("phoneNumber") String phoneNumber
			);
}
