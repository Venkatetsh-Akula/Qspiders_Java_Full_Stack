package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Person;
import org.jsp.demo.entity.User;

public class fetchApp {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Person p = new Person();
		p.setEmail("gmail.com");
		p.setName("vamsi");
		p.setPassword("1238");
		p.setPhone(12345);
		p.setRole("admin");
 		
		
		Person person = em.find(Person.class, "gmail.com");
		System.out.println(person);
		
		
		
		
	}

}
