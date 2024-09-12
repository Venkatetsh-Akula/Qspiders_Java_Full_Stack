package org.jsp.composite.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.composite.Entity.User;
import org.jsp.composite.Entity.UserId;

public class UserController {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		UserId id = new UserId();
		id.setEmail("vamsi@gmail.com");
		id.setPhone(123456788990l);
		
		User u = new User();
		u.setId(id);
		u.setPassword("vamsi123");
		u.setName("vamsi");
		
	
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(u);
		et.commit();
		
 	}

}
