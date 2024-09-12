package or.jsp.manytomanybidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.hibernate.cache.spi.support.EntityTransactionalAccess;
import org.jsp.manytomanybidirectional.entity.Student;
import org.jsp.manytomanybidirectional.entity.Subject;

public class MappingStudentSubjectData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student std1=em.find(Student.class, 1);
		Student std2=em.find(Student.class, 2);
		Student std3=em.find(Student.class, 3);
		Student std4=em.find(Student.class, 4);
		Student std5=em.find(Student.class, 5);
		
		Subject s1=em.find(Subject.class, 1);
		Subject s2=em.find(Subject.class, 2);
		Subject s3=em.find(Subject.class, 3);
		Subject s4=em.find(Subject.class, 4);
		
		List<Student> mpcli=new ArrayList<>();
		List<Student> bli=new ArrayList<>();
		
		mpcli.add(std1);
		mpcli.add(std2);
		mpcli.add(std3);
		
		bli.add(std4);
		bli.add(std5);
		
		s1.setStudent(mpcli);
		s2.setStudent(mpcli);
		s3.setStudent(mpcli);
		s4.setStudent(bli);
		
		List<Subject> stdmpcli=new ArrayList<>();
		List<Subject> stdbli=new ArrayList<>();
		//MPC List
		stdmpcli.add(s1);
		stdmpcli.add(s2);
		stdmpcli.add(s3);
		//Only biology list
		stdbli.add(s4);

		std1.setSubject(stdmpcli);
		std2.setSubject(stdmpcli);
		std3.setSubject(stdmpcli);
		std4.setSubject(stdbli);
		std5.setSubject(stdbli);
		
		et.begin();
		
		//subject update
		em.merge(s1);
		em.merge(s2);
		em.merge(s3);
		em.merge(s4);
		//student update
		em.merge(std1);
		em.merge(std2);
		em.merge(std3);
		em.merge(std4);
		em.merge(std5);
		
		et.commit();
	}
}
