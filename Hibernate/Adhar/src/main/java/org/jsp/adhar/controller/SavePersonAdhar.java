package org.jsp.adhar.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.adhar.entity.Adhar;
import org.jsp.adhar.entity.Person;

public class SavePersonAdhar {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setName("venky");
		p.setEmail("venky@gmail.com");
		p.setPassword("123");
		p.setPhone(3456);
		Adhar a=new Adhar();
		a.setCity("bengaluru");
		a.setPincode(467);
		p.setAdhar(a);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		System.out.println("Done.......");
	}
}
