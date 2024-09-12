package org.jsp.manytomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomany.entity.Student;
import org.jsp.manytomany.entity.Subject;

public class NewStudentAddedToSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student std1=em.find(Student.class,6);
		
		Subject sub1=em.find(Subject.class, 1);
		Subject sub2=em.find(Subject.class, 2);
		Subject sub3=em.find(Subject.class, 3);
		
		et.begin();
		List<Student> stdlist=sub3.getStudent();
		stdlist.add(std1);
		//em.merge(sub1);
//		em.merge(sub2);
		em.merge(sub3);
		et.commit();
		
	}
}
