package or.jsp.manytomanybidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomanybidirectional.entity.Student;
import org.jsp.manytomanybidirectional.entity.Subject;

public class InsertStudentSubjectData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student std1=new Student();
		Student std2=new Student();
		Student std3=new Student();
		Student std4=new Student();
		Student std5=new Student();
		
		std1.setSname("lokesh");
		std1.setSphone(345677);
		
		std2.setSname("stephen");
		std2.setSphone(9732456);
		
		std3.setSname("prakesh");
		std3.setSphone(787657865);
		
		std4.setSname("pavan");
		std4.setSphone(90776);
		
		std5.setSname("sangeetha");
		std5.setSphone(898876);
		
		Subject s1=new Subject();
		Subject s2=new Subject();
		Subject s3=new Subject();
		Subject s4=new Subject();
		
		s1.setName("maths");
		s2.setName("physics");
		s3.setName("chemistry");
		s4.setName("biology");
		
		
		et.begin();
		em.persist(std1);
		em.persist(std2);
		em.persist(std3);
		em.persist(std4);
		em.persist(std5);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		et.commit();
		em.close();
		emf.close();
		
	}
}
