package or.jsp.manytomanybidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomanybidirectional.entity.Student;
import org.jsp.manytomanybidirectional.entity.Subject;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Subject ms=em.find(Subject.class, 4);
		
		Subject sb1=em.find(Subject.class, 2);
		Subject sb2=em.find(Subject.class, 3);
		
		
		List<Subject> added=new ArrayList<>();
		added.add(ms);
		Query qry=em.createQuery("select s from Subject s");
		List<Subject> sub=qry.getResultList();
		
		for(Subject sub1: sub) {
				if(sub1==sb1 || sub1==sb2) {
					added.add(sub1);
				}
		}
		
		Student s4=em.find(Student.class, 4);
		Student s5=em.find(Student.class, 5);
		
		s4.setSubject(added);
		s5.setSubject(added);
		et.begin();
		
		em.merge(s4);
		em.merge(s5);
		
		et.commit();
	}
}
