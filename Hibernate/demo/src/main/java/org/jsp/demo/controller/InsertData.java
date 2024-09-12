package org.jsp.demo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.jsp.demo.entity.Employee;

public class InsertData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = new Employee();
		System.out.println("Enter employee ID");
		emp.setId(sc.nextInt());
		System.out.println("Enter employee name");
		emp.setName(sc.next());
		System.out.println("enter employee gmail");
		emp.setGmail(sc.next());
		System.out.println("Enter phone nubmer");
		emp.setPhone(sc.nextLong());
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
		
		System.out.println("inserted data successfully..........");
		
		em.close();
		emf.close();
	}
}
