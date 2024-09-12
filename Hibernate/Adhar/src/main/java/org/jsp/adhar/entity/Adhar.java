package org.jsp.adhar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long no;
	private String city;
	private int pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
