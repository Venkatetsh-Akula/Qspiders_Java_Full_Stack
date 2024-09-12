package org.jsp.onetoonebidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoonebidirectional.entity.Person;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Person p=em.find(Person.class, 1);
		//p.setPan(null); to set null in forgin key
		em.remove(p);
		et.commit();
	}
}
