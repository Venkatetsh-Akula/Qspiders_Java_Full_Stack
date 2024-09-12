package org.jsp.manytomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomany.entity.Student;
import org.jsp.manytomany.entity.Subject;

public class AssignStudentToSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Subject s=em.find(Subject.class, 3);
		Query qry=em.createQuery("select s from Student s");
		List<Student> std=qry.getResultList();
		s.setStudent(std);
		et.begin();
		em.merge(s);
		et.commit();
	}
}
