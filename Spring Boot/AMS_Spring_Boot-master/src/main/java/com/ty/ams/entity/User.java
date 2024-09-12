package com.ty.ams.entity;

import java.util.List;

import org.springframework.lang.NonNull;

import com.ty.ams.util.UserCategory;
import com.ty.ams.util.UserRole;
import com.ty.ams.util.UserStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(nullable = false, unique = true)
	@NonNull
	private String empId;
	private String name;
	private String email;
	private String password;
	@Column(nullable = false, unique = true)
	private long phone;
	@Enumerated(EnumType.STRING)
	private UserRole userRole;
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	@Enumerated(EnumType.STRING)
	private UserCategory userCategory;
	@OneToMany
	private List<TimeSheet> timeSheets;
	@OneToMany//(cascade = CascadeType.ALL)
	private List<Batch> batchs;
}
