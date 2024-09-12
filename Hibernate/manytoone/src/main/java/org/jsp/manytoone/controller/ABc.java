package org.jsp.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytoone.entity.Student;
import org.jsp.manytoone.entity.Subject;

public class ABc {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s = em.find(Student.class, 13);

		Subject su = em.find(Subject.class, 2);

		s.setSubject(su);

		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("done...");

	}
}
