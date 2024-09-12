package org.jsp.demo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.jsp.demo.entity.Employee;

import javax.persistence.Query;

public class CreateQueryMethod {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
         Query query = em.createQuery("select e from Employee e");
         List<Employee> result=query.getResultList();
         for(Employee i:result) {
        	 System.out.println(i.getId());
        	 System.out.println(i.getName());
        	 System.out.println(i.getGmail());
        	 System.out.println(i.getPhone());
        	 System.out.println("-----------------");
         }
		em.close();
		emf.close();
	}
}
