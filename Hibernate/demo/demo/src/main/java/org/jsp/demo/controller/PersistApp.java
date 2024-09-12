	package org.jsp.demo.controller;
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	import org.jsp.demo.entity.User;
	public class PersistApp {

		public static void main(String[] args) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
			EntityManager em =  emf.createEntityManager();
		
			System.out.println(em);
			System.out.println(emf);
			
			User user = new User();
			user.setId(101);
			user.setName("Vamsi");
			user.setEmail("vamsi@gmail.com");
			user.setPassword("vamsi123");
			user.setPhone(1234567890);
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(user);
			et.commit();
			
		

	}


}
