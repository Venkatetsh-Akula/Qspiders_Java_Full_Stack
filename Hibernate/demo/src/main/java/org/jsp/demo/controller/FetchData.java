package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Employee;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Employee emp=em.find(Employee.class, 101);
		EntityTransaction et=em.getTransaction();
		et.begin();
		if(emp!=null) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getGmail());
			System.out.println(emp.getPhone());
		}
		else {
			System.out.println("No Data found");
		}
		et.commit();
		em.close();
		emf.close();
	}
}
