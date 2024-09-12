package org.jsp.hibernate_life_cycle.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.hibernate_life_cycle.entity.Student;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student std=new Student();   //Transient State
		et.begin();
		std.setName("ram");
		std.setEmail("ram@gmail.com");
		em.persist(std);    //Persistence state
		et.commit();
		em.detach(std);    //Detached state
		
	}
}
