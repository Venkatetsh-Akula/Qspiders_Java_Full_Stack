package org.jsp.peoplebus.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.peoplebus.entity.People;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		People p=em.find(People.class, 1);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getBus().getLoc());
		System.out.println(p.getBus().getPrice());
	}
}
