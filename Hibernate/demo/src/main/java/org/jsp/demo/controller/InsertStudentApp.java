package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Student;

public class InsertStudentApp {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();

		EntityTransaction et=em.getTransaction();
		et.begin();
		Student s=new Student();
		s.setName("venky");
		s.setEmail("venky@gmail.com");
		s.setPhone(4567890);
		s.setPassword("123");
		em.persist(s);
		et.commit();
		em.close();
		emf.close();
	}
}
