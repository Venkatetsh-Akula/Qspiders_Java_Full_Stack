package org.jsp.onetomanybidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomanybidirectional.entity.User;

public class UserInsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User u1=new User();
		User u2=new User();
		
		u1.setUname("niteesh");
		u1.setUemail("niteesh@gmail.com");
		
		
		u2.setUname("naveen");
		u2.setUemail("naveen@gamil.com");
		
		et.begin();
		em.persist(u1);
		em.persist(u2);
		et.commit();
	}
}
