package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.entity.Person;
import org.jsp.entity.SmartPhone;

public class CacheMemory {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		em.find(SmartPhone.class,1);
		em.find(SmartPhone.class,2); //first-level chache:- in here it will fetch only two because  smart phone 1 is all ready chceked and 2 is checked  if we check aain the 1st it give data from cache
		em.find(SmartPhone.class,1);
		
	}
}
