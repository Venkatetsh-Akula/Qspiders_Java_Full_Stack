package org.jsp.manytomany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomany.entity.Subject;

public class InsertDataSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Subject sub1=new Subject();
		sub1.setName("core java");
		Subject sub2=new Subject();
		sub2.setName("jdbc");
		Subject sub3=new Subject();
		sub3.setName("servlwts");
		Subject sub4=new Subject();
		sub4.setName("hibernate");
		Subject sub5=new Subject();
		sub5.setName("spring");
		em.persist(sub1);
		em.persist(sub2);
		em.persist(sub3);
		em.persist(sub4);
		em.persist(sub5);
		et.commit();
	}
}
