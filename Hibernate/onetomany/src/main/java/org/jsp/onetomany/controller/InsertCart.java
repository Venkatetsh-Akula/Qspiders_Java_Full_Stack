package org.jsp.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomany.entity.Cart;
import org.jsp.onetomany.entity.Product;

public class InsertCart {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Product p1=new Product();
		p1.setName("football");
		p1.setPrice(800);
		Product p2=new Product();
		p2.setName("vollyball");
		p2.setPrice(900);
		Product p3=new Product();
		p3.setName("Nike");
		p3.setPrice(5000);
		
		
		List<Product> p=new ArrayList();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		Cart c=new Cart();
		c.setCart("flipkart");
		c.setProduct(p);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(c);
		et.commit();
	}
}
