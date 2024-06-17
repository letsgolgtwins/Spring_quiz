package com.quiz.lesson03.domain;

import java.time.LocalDateTime;

public class RealEstate {

	// 필드
	private int id;
	private String realtorId;
	private String address;
	private int area;
	private String type;
	private int price;
	private Integer rentPrice; // null 허용
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// getter
	public int getId() {
		return id;
	}

	public String getRealtorId() {
		return realtorId;
	}

	public String getAddress() {
		return address;
	}

	public int getArea() {
		return area;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public Integer getRentPrice() {
		return rentPrice;
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

	public void setRealtorId(String realtorId) {
		this.realtorId = realtorId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRentPrice(Integer rentPrice) {
		this.rentPrice = rentPrice;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
