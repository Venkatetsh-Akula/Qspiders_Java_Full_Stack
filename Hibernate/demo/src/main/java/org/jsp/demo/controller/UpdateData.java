package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Employee;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class,0);
		if(emp!=null) {
			//emp.setId(102);
			emp.setGmail("mouli@gmail.com");
			emp.setName("mouli");
			emp.setPhone(2345678);
			System.out.println("updated sucessfully..........");
		}else {
			System.out.println("No ID has found");
		}
		em.merge(emp);
		et.commit();
		em.close();
		emf.close();
	}
}
