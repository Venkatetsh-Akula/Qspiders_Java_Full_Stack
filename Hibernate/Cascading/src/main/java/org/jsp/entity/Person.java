package org.jsp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToMany(cascade = CascadeType.ALL)  //cascade will persist the another table while at the time of details in the list
	private List<SmartPhone> smartphone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<SmartPhone> getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(List<SmartPhone> smartphone) {
		this.smartphone = smartphone;
	}
	
}
