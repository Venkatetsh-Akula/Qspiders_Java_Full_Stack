package org.jsp.onetoonebidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoonebidirectional.entity.PanCard;
import org.jsp.onetoonebidirectional.entity.Person;

public class UpdataData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		
		Person p2=em.find(Person.class, 1);
		//Person p3=em.find(Person.class, 3);
		
//		p2.setEmail("naruto@gmail.com");
//		p2.setName("naruto");
//		
//		p3.setEmail("shino@gmali.com");
//		p3.setName("shino");
		
		//PanCard pa1=em.find(PanCard.class, 1);
		PanCard pa3=em.find(PanCard.class, 2);
		
		p2.setPan(pa3);
//		p3.setPan(pa3);
		
		em.merge(p2);
		//em.merge(p3);
		
		et.commit();
		
		em.close();
		emf.close();
	}
}
