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

public class UploadNewAnswerClass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Question qus=em.find(Question.class,1);
		et.begin();
		Answer ans1=new Answer();
		ans1.setAnswer("java is a high verbose language");
		Answer ans2=new Answer();
		ans2.setAnswer("java is AI support language");
		Answer ans3=new Answer();
		ans3.setAnswer("java is a standaed edition");
		List<Answer> ansli=qus.getA();
		ansli.add(ans1);
		ansli.add(ans2);
		ansli.add(ans3);
		qus.setA(ansli);
		em.persist(ans1);
		em.persist(ans2);
		em.persist(ans3);
		em.merge(qus);
//		Query qry=em.createQuery("select q from Question q");
//		List<Question> questions=qry.getResultList();
//		for(Question q:questions) {
//			if(q.getQno()==qus.getQno()) {
//				
//			}
//		}
		et.commit();
	}
	
}
