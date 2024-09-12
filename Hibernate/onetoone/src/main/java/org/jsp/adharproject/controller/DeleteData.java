package org.jsp.adharproject.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.adharproject.entity.Adhar;
import org.jsp.adharproject.entity.Person;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Person p=em.find(Person.class, 4);
		Adhar a=em.find(Adhar.class, 4);
		em.remove(p);
		em.remove(a);
		et.commit();
		em.close();
		emf.close();
	}
}
