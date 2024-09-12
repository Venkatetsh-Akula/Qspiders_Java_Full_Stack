package org.jsp.manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomany.entity.Student;
import org.jsp.manytomany.entity.Subject;

public class RemovePerticularDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student mstd1=em.find(Student.class, 2);
		Student mstd2=em.find(Student.class, 3);
		
		List<Student> mstdli=new ArrayList();
		mstdli.add(mstd1);
		mstdli.add(mstd2);
		
		Query qry=em.createQuery("select sub from Subject sub");
		
		
		
		
		et.begin();
		
		
		List<Subject> qstdli=qry.getResultList();
		for(Subject dup:qstdli) {
			List<Student> stdli=dup.getStudent();
			List<Student> newstdli=new ArrayList<>();
			for(Student std:stdli) {
				if(std.getSid()!=mstd1.getSid() && std.getSid()!=mstd2.getSid() ) {
					newstdli.add(std);
				}
			}
			dup.setStudent(newstdli);
			em.merge(dup);
		}
		
		
		em.remove(mstd1);
		em.remove(mstd2);
		
		
		et.commit();
		
		
		
	}
}
