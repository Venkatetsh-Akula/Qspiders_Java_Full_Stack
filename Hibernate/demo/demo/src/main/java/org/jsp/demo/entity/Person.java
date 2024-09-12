package org.jsp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Person {
	@Id
	private String email;
	private String name;
	private long phone;
	private String password;
	private String role;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", name=" + name + ", phone=" + phone + ", password=" + password + ", role="
				+ role + "]";
	}
	
	

}
