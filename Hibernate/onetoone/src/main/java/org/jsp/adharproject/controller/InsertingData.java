package org.jsp.adharproject.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.adharproject.entity.Adhar;
import org.jsp.adharproject.entity.Person;

public class InsertingData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Adhar adhar=new Adhar();
		adhar.setCity("bangalore");
		adhar.setPin(560043);
		Person person=new Person();
		person.setAdhar(adhar);
		person.setName("naveen");
		person.setEmail("naveen@gmail.com");
		person.setPassword("123");
		em.persist(adhar);
		em.persist(person);
		et.commit();
		em.close();
		emf.close();
	}
}
