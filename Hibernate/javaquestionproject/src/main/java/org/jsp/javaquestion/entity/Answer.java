package org.jsp.javaquestion.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ansno;
	private String answer;
	public int getAnsno() {
		return ansno;
	}
	public void setAnsno(int ansno) {
		this.ansno = ansno;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
