package org.jsp.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytoone.entity.Student;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Student s4=em.find(Student.class, 10);
		Student s5=em.find(Student.class, 11);
		Student s6=em.find(Student.class, 12);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(s4);
		em.remove(s5);
		em.remove(s6);
		et.commit();
		em.close();
		emf.close();
	}
}
