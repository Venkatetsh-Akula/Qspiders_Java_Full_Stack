package org.jsp.adhar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PAN {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int no;
	private long accno;
	private String pcity;
	public int getNo() {
		return no;
	}
//	public void setNo(int no) {
//		this.no = no;
//	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
}
