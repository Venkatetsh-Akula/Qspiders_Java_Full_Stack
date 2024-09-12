package org.jsp.app.todojpa;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoComponent{
	
	public TodoComponent() {
		super();
	}
	
	public TodoComponent(int id, String username, String description, LocalDate targetdate, boolean state) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetdate = targetdate;
		this.state = state;
	}
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate targetdate;
	private boolean state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "TodoComponent [id=" + id + ", username=" + username + ", description=" + description + ", targetdate="
				+ targetdate + ", state=" + state + "]";
	}
	
}
