package org.jsp.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
	private int roll;
	private String name;
	private String role;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Person() {
		
	}
	
	@Override
	@RequestMapping("/res")
	public String toString() {
		return "name:"+this.name+" id:"+this.roll+" role"+role;
	}
	
}
