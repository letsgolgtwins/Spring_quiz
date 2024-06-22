package com.quiz.retry.lesson04.domain;

import java.time.LocalDateTime;

public class Company {

	// 필드명
	private int id;
	private String name;
	private String busniess;
	private String scale;
	private int headcount;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// getter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBusniess() {
		return busniess;
	}

	public String getScale() {
		return scale;
	}

	public int getHeadcount() {
		return headcount;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setBusniess(String busniess) {
		this.busniess = busniess;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
