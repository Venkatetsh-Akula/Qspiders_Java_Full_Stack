package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.User;

public class MergeApp
{
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em =  emf.createEntityManager();
	
		System.out.println(em);
		System.out.println(emf);
		
		User user = new User();
		user.setId(103);
		user.setName("Gopi");
		user.setEmail("gopi@gmail.com");
		user.setPassword("gopi123");
		user.setPhone(1234573373);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(user);
		et.commit();
		
		
		
	}


}
