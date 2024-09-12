package org.jsp.onetomanybidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomanybidirectional.entity.Accounts;

public class AccountsInsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Accounts a1=new Accounts();
		Accounts a2=new Accounts();
		Accounts a3=new Accounts();
		Accounts a4=new Accounts();
		
		a1.setName("facebook");
		
		a2.setName("instagram");
		
		a3.setName("whatsapp");
		
		a4.setName("twitter");
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		et.commit();
	}
}
