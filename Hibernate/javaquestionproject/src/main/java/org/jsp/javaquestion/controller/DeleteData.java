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

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		List<Answer> ansli=new ArrayList<>();
		et.begin();
		
		Question qus=em.find(Question.class, 1);

		Query qry=em.createQuery("select a from Answer a");
		List<Answer> li=qry.getResultList();
		Answer ans1=em.find(Answer.class, 10);
		Answer ans2=em.find(Answer.class, 11);
		Answer ans3=em.find(Answer.class, 12);
		for(Answer l:li) {
			if(l.equals(ans1)) {
				qus.setA(null);;
				em.merge(ans1);
			}
			if((l.equals(ans1)) || (l.equals(ans2))  || (l.equals(ans3)) ) {
				em.remove(l);
				//ansli.add(null);
			}else {
				ansli.add(l);
			}
		}
		qus.setA(ansli);
		em.remove(ans1);
		em.remove(ans2);
		em.remove(ans3);
		em.merge(qus);
		et.commit();
	}
}

