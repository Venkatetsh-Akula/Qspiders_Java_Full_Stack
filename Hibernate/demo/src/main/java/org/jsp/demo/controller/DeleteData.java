package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Employee;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class,0);
		if(emp!=null) {
			em.remove(emp);
			System.out.println("deleted sucessfully");
		}else {
			System.out.println("No entity found");
		}
		et.commit();
		em.close();
		emf.close();
	}
}
