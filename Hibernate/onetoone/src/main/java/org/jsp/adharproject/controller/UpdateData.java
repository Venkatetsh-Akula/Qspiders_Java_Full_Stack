package org.jsp.adharproject.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.adharproject.entity.Adhar;
import org.jsp.adharproject.entity.Person;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
//		Person p=em.find(Person.class, 3);
//		Adhar a=em.find(Adhar.class, 3);
//		p.setName("niteeshkumar");
//		a.setCity("pamuru");
//		em.merge(p);
//		em.merge(a);
		
		Person p=em.find(Person.class, 3);
		p.setAdhar(null);
		em.merge(p);
		et.commit();
		em.close();
		emf.close();
	}
}
