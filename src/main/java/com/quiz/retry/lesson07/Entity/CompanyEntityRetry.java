package com.quiz.retry.lesson07.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Getter
@Table(name = "company")
@Entity
public class CompanyEntityRetry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 필드
	private int id;
	private String name;
	private String busniess;
	private String scale;
	private int headcount;
	@Column(name = "createdAt")
	@CreationTimestamp
	private LocalDateTime createdAt;
	@Column(name = "updatedAt")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
