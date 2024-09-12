package org.jsp.adharproject.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.adharproject.entity.Adhar;
import org.jsp.adharproject.entity.Person;

public class FetchingData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class,1);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getEmail());
		System.out.println(p.getPassword());
		Adhar a=p.getAdhar();
		System.out.println(a.getNo());
		System.out.println(a.getCity());
		System.out.println(a.getPin());
		System.out.println("Done..........");
	}
}
