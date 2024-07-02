package com.quiz.booking.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Booking {

	// 필드
	private int id;
	private String name;
	private int headcount;
	private int day;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	private String phoneNumber;
	private String state;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// 240702 loombok 설치에 따른 getter setter 모두 삭제

}
