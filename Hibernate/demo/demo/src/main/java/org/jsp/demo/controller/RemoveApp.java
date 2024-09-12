package org.jsp.demo.controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Person;
import org.jsp.demo.entity.User;

public class RemoveApp {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Person person = em.find(Person.class, "gmail.com");
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(person);
		et.commit();
		System.out.println("user removed");
	}
	
	
}
