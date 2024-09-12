package org.jsp.emart.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.emart.entity.Status;
import org.jsp.emart.entity.User;

public class SaveUserController {
	static Scanner sc = new Scanner(System.in);

	public static void saveUser() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		User u = new User();
		System.out.println("enter name");
		u.setName(sc.next());
		System.out.println("enter phone");
		u.setPhone(sc.nextLong());
		System.out.println("enter email");
		u.setEmail(sc.next());

		System.out.println("1:-> Login OR 2:->Logout");
		switch (sc.nextInt()) {
		case 1:
			u.setUserstate(Status.LOGIN);
			break;
		case 2:
			u.setUserstate(Status.LOGOUT);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(u);
		et.commit();
		System.out.println("user saved");
	}

	public static void findUserByEmailAndPhone() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Query qry = em.createQuery("select u from User u where u.email=:email and u.phone=:phone");
		System.out.println("Enter Email");
		qry.setParameter("email", sc.next());
		System.out.println("Enter Phone");
		qry.setParameter("phone", sc.nextLong());
		List<User> li = qry.getResultList();
		if (li.size() > 0) {
			User u = em.find(User.class, li.get(0).getUid());
			u.setUserstate(Status.LOGIN);
			et.begin();
			em.merge(u);
			et.commit();
			u = em.find(User.class, li.get(0).getUid());

			System.out.println(u.getUid() + " " + u.getName() + "  " + u.getEmail() + " " + u.getPhone() + "  "
					+ u.getCreatedat() + " " + u.getLastlogin() + " " + u.getUserstate());

		}

	}

	public static void main(String[] args) {

		findUserByEmailAndPhone();
//		saveUser();
	}
}
