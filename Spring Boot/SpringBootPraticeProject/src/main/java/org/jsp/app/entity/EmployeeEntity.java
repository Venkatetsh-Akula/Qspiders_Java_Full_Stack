package org.jsp.app.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ename;
	private int deptno;
	private double sal;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int id, String ename, int deptno, double sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.deptno = deptno;
		this.sal = sal;
	}
	public EmployeeEntity(String ename, int deptno, double sal) {
		this.ename=ename;
		this.deptno=deptno;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", ename=" + ename + ", deptno=" + deptno + ", sal=" + sal + "]";
	}
	
}
