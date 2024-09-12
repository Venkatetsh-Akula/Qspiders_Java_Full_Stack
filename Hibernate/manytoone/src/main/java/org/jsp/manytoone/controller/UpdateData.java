package org.jsp.manytoone.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytoone.entity.Student;
import org.jsp.manytoone.entity.Subject;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Subject s=em.find(Subject.class, 1);
		Query qry=em.createQuery("select std from Student std where std.sname=?1");
		qry.setParameter(1, "rahul");
		List<Student> std=qry.getResultList();
		for(Student o:std) {
			
			if(o.getSname().equals("rahul") && o.getSubject().getName().equals("spring")) {
				o.setSubject(s);
				et.begin();
				em.merge(o);
				et.commit();
			}
		}
		em.close();
		emf.close();
	}
}
