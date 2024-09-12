package org.jsp.emart.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.emart.entity.Items;
import org.jsp.emart.entity.Orders;

public class OrderController {
	static Scanner sc = new Scanner(System.in);

	public static void save() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Items item1 = new Items();
		item1.setName("kesaribath");
		item1.setPrice(40);

		Items item2 = new Items();
		item2.setName("lemon rice");
		item2.setPrice(50);

		Items item3 = new Items();
		item3.setName("Puliogre");
		item3.setPrice(60);

		Items item4 = new Items();
		item4.setName("Curd Rice");
		item4.setPrice(50);

		List<Items> itemli = new ArrayList<>();
		itemli.add(item1);
		itemli.add(item2);
		itemli.add(item3);
		itemli.add(item4);

		Orders o1 = new Orders();
		// o1.setOrderdtime(LocalDateTime.now());
		// o1.setDeliverytime(LocalDateTime.of(2024, 07,17,16,59));
		o1.setItems(itemli);

		double result = 0;
		for (Items i : itemli) {
			result += i.getPrice();
		}
		o1.setTotalamount(result);

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(o1);
		et.commit();
		System.out.println("Order Placed Successfully");
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Orders o = em.find(Orders.class, 2);
		o.setDecsription("Something...");

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(o);
		et.commit();

	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Press 0 to stop ORM tool");
			System.out.println("Press 1 to save Data");
			System.out.println("Press 2 to remove Data");

			int choose = sc.nextInt();

			if (choose == 0) {
				break;
			}
			switch (choose) {
			case 1:
				save();
				break;
			case 2:
				update();
				break;
			}
		}
	}
}
