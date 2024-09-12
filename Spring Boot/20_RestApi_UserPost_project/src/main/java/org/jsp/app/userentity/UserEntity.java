package org.jsp.app.userentity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


public class UserEntity {
	private Integer id;
	@Size(min=2, message="Name should have atleast two characters")
	private String name;
	@Past(message = "data should be past in back")
	private LocalDate birthDate;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(int id,String name,LocalDate birthDate) {
		super();
		this.id=id;
		this.name=name;
		this.birthDate=birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}
