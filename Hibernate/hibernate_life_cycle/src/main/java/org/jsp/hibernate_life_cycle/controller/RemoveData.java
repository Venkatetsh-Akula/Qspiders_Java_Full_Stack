package org.jsp.hibernate_life_cycle.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.hibernate_life_cycle.entity.Student;

public class RemoveData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student p=em.find(Student.class, 1);  //persistence state
		em.remove(p); //removed state
		et.begin();
		et.commit();
		System.out.println(em.contains(p));    //Detached state  // it will check weather the entity is present in my table or not
	}
}
