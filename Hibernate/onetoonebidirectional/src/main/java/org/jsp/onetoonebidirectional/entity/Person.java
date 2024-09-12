package org.jsp.onetoonebidirectional.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int perid;
	private String name;
	private String email;
	@OneToOne
	@JoinColumn  //i will help to maintain foregin key column in with no duplicate 
	private PanCard pan;
	public int getPerid() {
		return perid;
	}
	public void setPerid(int perid) {
		this.perid = perid;
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
	public PanCard getPan() {
		return pan;
	}
	public void setPan(PanCard pan) {
		this.pan = pan;
	}
}
