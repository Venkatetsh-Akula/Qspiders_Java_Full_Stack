package org.jsp.peoplebus.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.peoplebus.entity.Bus;
import org.jsp.peoplebus.entity.People;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Bus b=new Bus();
		b.setLoc("nellore");
		b.setPrice(1000);
		b.setServiceno(1003);
		People p1=new People();
		p1.setName("sudheer");
		p1.setBus(b);
		People p2=new People();
		p2.setName("niteesh");
		p2.setBus(b);
		People p3=new People();
		p3.setName("naveen");
		p3.setBus(b);
		em.persist(b);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();
		em.close();
		emf.close();
	}
}
