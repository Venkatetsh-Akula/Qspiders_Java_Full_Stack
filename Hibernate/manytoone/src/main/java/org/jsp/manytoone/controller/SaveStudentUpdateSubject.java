package org.jsp.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytoone.entity.Student;
import org.jsp.manytoone.entity.Subject;

public class SaveStudentUpdateSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Subject s=em.find(Subject.class, 1);
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student std1=new Student();
		std1.setSname("cherry");
		std1.setSubject(s);
		Student std2=new Student();
		std2.setSname("rahul");
		std2.setSubject(s);
//		Student std3=new Student();
//		std1.setSname("ram");
//		std1.setSubject(s);
		em.persist(std1);
		em.persist(std2);
		//em.persist(std3);
		et.commit();
		em.close();
		emf.close();
	}
	
}
