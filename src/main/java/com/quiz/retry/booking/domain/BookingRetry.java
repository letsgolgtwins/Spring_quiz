package com.quiz.retry.booking.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingRetry {

	// 필드
	private int id;
	private String name;
	private int headcount;
	private int day;
	private LocalDate date;
	private String phoneNumber;
	private String state;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// GETTER
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getHeadcount() {
		return headcount;
	}

	public int getDay() {
		return day;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getState() {
		return state;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	// SETTER
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
