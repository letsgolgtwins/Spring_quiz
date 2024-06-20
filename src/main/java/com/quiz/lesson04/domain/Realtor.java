package com.quiz.lesson04.domain;

import java.time.LocalDateTime;

public class Realtor {

	// 필드
	private int id;
	private String office;
	private String phoneNumber;
	private String address;
	private String grade;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// getter
	public int getId() {
		return id;
	}

	public String getOffice() {
		return office;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getGrade() {
		return grade;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
