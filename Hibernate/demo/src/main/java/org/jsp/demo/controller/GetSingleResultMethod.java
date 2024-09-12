package org.jsp.demo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.demo.entity.Employee;

public class GetSingleResultMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query qur=em.createQuery("select emp from Employee emp where id=?1");
		System.out.println("Enter the user id whom you want to fetch");
		qur.setParameter(1,sc.nextInt());
		Employee emp=(Employee)qur.getSingleResult();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getGmail());
		System.out.println(emp.getPhone());
		em.close();
		emf.close();
	}
}
