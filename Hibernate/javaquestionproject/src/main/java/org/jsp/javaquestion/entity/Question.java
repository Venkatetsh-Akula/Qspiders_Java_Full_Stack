package org.jsp.javaquestion.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qno;
	private String que;
	@OneToMany
	private List<Answer> a;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<Answer> getA() {
		return a;
	}
	public void setA(List<Answer> a) {
		this.a = a;
	}
	
	
}
