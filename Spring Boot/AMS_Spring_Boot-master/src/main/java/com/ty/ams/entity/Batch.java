package com.ty.ams.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int batchId;
	private String batchCode;
	private String subjectName;
	@Enumerated(EnumType.STRING)
	private BatchStatus batchStatus;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate batchStartDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate batchEndDate;
	private LocalTime loginTime;
	private LocalTime logoutTime;
	private int totalDays;
	@Enumerated(EnumType.STRING)
	private BatchMode batchMode;
	private String instituteName;
	private String location;
	@ManyToOne
	private User user;

}
