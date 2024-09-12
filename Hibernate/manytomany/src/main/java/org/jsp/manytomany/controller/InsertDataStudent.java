package org.jsp.manytomany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomany.entity.Student;
import org.jsp.manytomany.entity.Subject;

public class InsertDataStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student std1=new Student();
		std1.setSname("vinay");
//		Student std2=new Student();
//		std2.setSname("niteesh");
//		Student std3=new Student();
//		std3.setSname("sudheer");
//		Student std4=new Student();
//		std4.setSname("samar");
//		Student std5=new Student();
//		std5.setSname("nithin");
		em.persist(std1);
//		em.persist(std2);
//		em.persist(std3);
//		em.persist(std4);
//		em.persist(std5);
		et.commit();
	}
}
