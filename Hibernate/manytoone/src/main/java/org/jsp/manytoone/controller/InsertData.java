package org.jsp.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytoone.entity.Student;
import org.jsp.manytoone.entity.Subject;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Subject s=new Subject();
		s.setName("hibernate");
		Student stu=new Student();
		stu.setSname("vamsi");
		stu.setSubject(s);
		Student stu2=new Student();
		stu2.setSname("niteesh");
		stu2.setSubject(s);
		Student stu3=new Student();
		stu2.setSname("naveen");
		stu2.setSubject(s);
		Student stu4=new Student();
		stu2.setSname("sudheer");
		stu2.setSubject(s);
		Student stu5=new Student();
		stu2.setSname("hari");
		stu2.setSubject(s);
		em.persist(s);
		em.persist(stu);
		em.persist(stu2);
		em.persist(stu3);
		em.persist(stu4);
		em.persist(stu5);
		et.commit();
		em.close();
		emf.close();
		System.out.println("Done......");
	}
}
