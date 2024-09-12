package org.jsp.javaquestion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.javaquestion.entity.Answer;
import org.jsp.javaquestion.entity.Question;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Answer ans1=new Answer();
		ans1.setAnswer("java is a high level language");
		Answer ans2=new Answer();
		ans2.setAnswer("java is a programming language");
		Answer ans3=new Answer();
		ans3.setAnswer("java is a human understandable language");
		List<Answer> li=new ArrayList();
		li.add(ans1);
		li.add(ans2);
		li.add(ans3);
		
		Question q=new Question();
		q.setQue("what is java");
		q.setA(li);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(ans1);
		em.persist(ans2);
		em.persist(ans3);
		em.persist(q);
		et.commit();
		em.close();
		emf.close();
		System.out.println("Done.........");
		
	}
}
