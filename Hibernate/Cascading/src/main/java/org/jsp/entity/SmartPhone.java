package org.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SmartPhone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int smid;
	private String smname;
	private String smbrand;
	
	private double smprice;
	public int getSmid() {
		return smid;
	}
	public void setSmid(int smid) {
		this.smid = smid;
	}
	public String getSmname() {
		return smname;
	}
	public void setSmname(String smname) {
		this.smname = smname;
	}
	public String getSmbrand() {
		return smbrand;
	}
	public void setSmbrand(String smbrand) {
		this.smbrand = smbrand;
	}
	public double getSmprice() {
		return smprice;
	}
	public void setSmprice(double smprice) {
		this.smprice = smprice;
	}
	
}
