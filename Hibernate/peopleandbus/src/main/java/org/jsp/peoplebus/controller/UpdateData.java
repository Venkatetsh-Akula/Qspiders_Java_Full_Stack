package org.jsp.peoplebus.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.peoplebus.entity.Bus;
import org.jsp.peoplebus.entity.People;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		//Bus b=em.find(Bus.class, 3);
		EntityTransaction et=em.getTransaction();
		et.begin();
		People p=em.find(People.class, 2);
		p.setBus(null);
		em.merge(p);
		et.commit();
		em.close();
		emf.close();
	}
}
