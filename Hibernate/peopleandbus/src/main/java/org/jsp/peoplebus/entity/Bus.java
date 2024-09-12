package org.jsp.peoplebus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int busno;
	private String loc;
	private double price;
	private int serviceno;
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getServiceno() {
		return serviceno;
	}
	public void setServiceno(int serviceno) {
		this.serviceno = serviceno;
	}
}
