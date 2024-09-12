package org.jsp.adhar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonPan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int no;
	private String name;
	private String email;
	private long phone;
	@OneToOne
	private PAN p;
	
	
	public int getNo() {
		return no;
	}
//	public void setNo(int no) {
//		this.no = no;
//	}
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public PAN getP() {
		return p;
	}
	public void setP(PAN p) {
		this.p = p;
	}
}
