package org.jsp.javaquestion.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.javaquestion.entity.Question;

public class UpadateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Question que=em.find(Question.class,2);
		que.setQue("what do you ment by java");
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(que);
		et.commit();
		em.close();
		emf.close();
	}
}
