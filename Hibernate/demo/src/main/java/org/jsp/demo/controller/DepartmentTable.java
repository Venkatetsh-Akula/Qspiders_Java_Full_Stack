package org.jsp.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.demo.entity.Department;
import org.jsp.demo.entity.DepartmentCompositeKey;

public class DepartmentTable {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		DepartmentCompositeKey dc=new DepartmentCompositeKey();
		dc.setDeptno(10);
		dc.setPhone(92345654);
		
		Department d=new Department();
		d.setDepartmentCompositeKeys(dc);
		d.setDname("software");
		d.setLoc("bangalore");
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(d);
		et.commit();
		em.close();
		emf.close();
	}
}
