package com.quiz.lesson04.domain;

import java.time.LocalDateTime;

public class Seller {

	// 필드
	private int id;
	private String nickname;
	private String profileImageUrl; // null 허용
	private double temperature; 
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// getter
	public int getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public double getTemperature() {
		return temperature;
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

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
