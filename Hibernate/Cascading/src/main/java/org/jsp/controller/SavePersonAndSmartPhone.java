package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.entity.Person;
import org.jsp.entity.SmartPhone;

public class SavePersonAndSmartPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		SmartPhone ph1=new SmartPhone();
		SmartPhone ph2=new SmartPhone();
		SmartPhone ph3=new SmartPhone();
		
		
		ph1.setSmname("nothing");
		ph1.setSmbrand("mi");
		ph1.setSmprice(500);
		
		ph2.setSmname("vivo");
		ph2.setSmbrand("vivo");
		ph2.setSmprice(900);
		
		ph3.setSmname("iphone");
		ph3.setSmbrand("apple");
		ph3.setSmprice(800);
		
		List<SmartPhone> smli=new ArrayList<SmartPhone>();
		smli.add(ph1);
		smli.add(ph2);
		smli.add(ph3);
		
		
		Person p1=new Person();
		p1.setName("sumara");
		p1.setEmail("sumara@gmail.com");
		p1.setSmartphone(smli);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p1);
		et.commit();
	}
}
