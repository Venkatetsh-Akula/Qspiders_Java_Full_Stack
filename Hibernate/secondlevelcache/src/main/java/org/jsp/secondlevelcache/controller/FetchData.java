package org.jsp.secondlevelcache.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.secondlevelcache.entity.Person;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		System.out.println(em1);
		System.out.println(em2);

		Person p1 = em1.find(Person.class, 1);
		System.out.println(p1);
		Person p2 = em2.find(Person.class, 1);
		System.out.println(p2);
	}
}
