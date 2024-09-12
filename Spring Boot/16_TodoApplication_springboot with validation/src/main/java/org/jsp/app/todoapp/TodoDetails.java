package org.jsp.app.todoapp;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class TodoDetails {
	
	
	public TodoDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TodoDetails(int id, String username, String description, LocalDate taretDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.taretDate = taretDate;
		this.done = done;
	}


	private int id;
	private String username;
	
	//@Size(min=10,message = "enter atleast 10 characters")
	private String description;
	private LocalDate taretDate;
	private boolean done;


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
	public LocalDate getTaretDate() {
		return taretDate;
	}
	public void setTaretDate(LocalDate taretDate) {
		this.taretDate = taretDate;
	}
	public boolean getDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	@Override
	public String toString() {
		return "TodoDetails [id=" + id + ", username=" + username + ", description=" + description + ", taretDate="
				+ taretDate + ", done=" + done + "]";
	}
}
