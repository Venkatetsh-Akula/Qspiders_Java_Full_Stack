package org.jsp.demo.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DepartmentCompositeKey implements Serializable {
	private int deptno;
	private long phone;
	public void setDeptno(int deptno) {
		this.deptno=deptno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setPhone(long phone) {
		this.phone=phone;
	}
	public long getPhone() {
		return phone;
	}
}
