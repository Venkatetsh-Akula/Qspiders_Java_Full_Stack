package org.jsp.onetoonebidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoonebidirectional.entity.PanCard;
import org.jsp.onetoonebidirectional.entity.Person;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		PanCard pc1=new PanCard();
		PanCard pc2=new PanCard();
		PanCard pc3=new PanCard();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		p1.setName("ino");
		p1.setEmail("ino@gmail.com");
		//p1.setPan(pc1);
		
		p2.setName("kiba");
		p2.setEmail("kiba@gmail.com");
		//p2.setPan(pc2);
		
		p3.setName("hinata");
		p3.setEmail("hinata@gmail.com");
		//p3.setPan(pc3);
		
		pc1.setPanno("A4");
		pc1.setPerson(p1);
		
		pc2.setPanno("A5");
		pc2.setPerson(p2);
		
		pc3.setPanno("A6");
		pc3.setPerson(p3);
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.persist(pc1);
		em.persist(pc2);
		em.persist(pc3);
		
		
		
		
		et.commit();
		em.close();
		emf.close();
		
	}
}
