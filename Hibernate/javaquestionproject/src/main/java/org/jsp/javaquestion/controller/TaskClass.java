package org.jsp.javaquestion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.javaquestion.entity.Answer;
import org.jsp.javaquestion.entity.Question;

public class TaskClass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Question qu=new Question();
		Answer ans=new Answer();
		qu.setQue("what do you think about java");
		EntityTransaction et=em.getTransaction();
		
		
		et.begin();
		em.persist(qu);
		
		
		List<Answer> ansli=new ArrayList();
		Query qry=em.createQuery("select ans from Answer ans");
		List<Answer> ansqr=qry.getResultList();
		for(Answer a:ansqr) {
			if(a.getAnsno()%2==0) {
				ansli.add(a);
			}
		}
		
		
		qu.setA(ansli);
		em.merge(ans);

		
		et.commit();
	}
}
