package org.jsp.peoplebus.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.peoplebus.entity.Bus;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Bus b=em.find(Bus.class, 2);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(b);
		et.commit();
		em.close();
		emf.close();
	}
}
