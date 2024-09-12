package org.jsp.adhar.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.adhar.entity.PAN;
import org.jsp.adhar.entity.PersonPan;

public class SavePersonForPAN {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		PAN p=new PAN();
		p.setPcity("pamuru");
		p.setAccno(12345);
		
		PersonPan pp=new PersonPan();
		pp.setName("venky");
		pp.setEmail("venky@gmail.com");
		pp.setPhone(9875564);
		pp.setP(p);
		
		em.persist(p);
		em.persist(pp);
		
		et.commit();
		em.close();
		emf.close();
	}
}
