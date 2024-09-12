package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.entity.Person;
import org.jsp.entity.SmartPhone;

public class UpdataCascadeData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Person p=em.find(Person.class, 2);
		
		for(SmartPhone sphn:p.getSmartphone()) {
			if(sphn.getSmid()==5) {
				sphn.setSmprice(1000);
			}
		}
		p.setName("kakhashi");
		em.merge(p);
		et.commit();
	}
}
