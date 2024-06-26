package com.quiz.retry.lesson05.domain;

import java.time.LocalDate;

public class MemberRetry {

	// 필드
	private String name;
	private String phoneNumber;
	private String email;
	private String nationality;
	private String introduce;
	private LocalDate birth;

	// getter
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getNationality() {
		return nationality;
	}

	public String getIntroduce() {
		return introduce;
	}

	public LocalDate getBirth() {
		return birth;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

}
