package com.quiz.weather_history.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class WeatherHistory {

	// 필드
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	private String weather;
	private double temperatures;
	private double precipitation;
	private String microDust;
	private double windSpeed;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getWeather() {
		return weather;
	}

	public double getTemperatures() {
		return temperatures;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public String getMicroDust() {
		return microDust;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public void setTemperatures(double temperatures) {
		this.temperatures = temperatures;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	public void setMicroDust(String microDust) {
		this.microDust = microDust;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
