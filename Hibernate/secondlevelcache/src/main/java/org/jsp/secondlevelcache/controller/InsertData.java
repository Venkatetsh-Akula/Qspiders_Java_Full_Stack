package org.jsp.secondlevelcache.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.secondlevelcache.entity.Person;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Person p1=new Person();
		p1.setName("venky");
		p1.setEmail("venky@gmail.com");
		
		Person p2=new Person();
		p2.setName("niteesh");
		p2.setEmail("niteesh@gmail.com");
		
		Person p3=new Person();
		p3.setName("sudheer");
		p3.setEmail("sudheer@gmail.com");
		
		Person p4=new Person();
		p4.setName("naveen");
		p4.setEmail("naveen@gmail.com");
		
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		et.commit();
		
	}
}
