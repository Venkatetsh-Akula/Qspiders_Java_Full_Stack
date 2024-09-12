package org.jsp.onetomanybidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomanybidirectional.entity.Accounts;
import org.jsp.onetomanybidirectional.entity.User;

public class MappingData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User u1=em.find(User.class, 1);
		User u2=em.find(User.class, 2);
		
		
		Accounts a1=em.find(Accounts.class, 1);
		Accounts a2=em.find(Accounts.class, 2);
		Accounts a3=em.find(Accounts.class, 3);
		Accounts a4=em.find(Accounts.class, 4);
		
		
		//maoping user and account
		List<Accounts> ua1=new ArrayList<>();
		ua1.add(a1);
		ua1.add(a3);
		
		List<Accounts> ua2=new ArrayList<>();
		ua2.add(a2);
		ua2.add(a4);
		
		
		//mapping accounts and user
		a1.setUser(u1);
		a3.setUser(u1);
		a2.setUser(u2);
		a4.setUser(u2);
		
		et.begin();
		em.merge(u1);
		em.merge(u2);
		em.merge(a1);
		em.merge(a2);
		em.merge(a3);
		em.merge(a4);
		et.commit();
	}
}
