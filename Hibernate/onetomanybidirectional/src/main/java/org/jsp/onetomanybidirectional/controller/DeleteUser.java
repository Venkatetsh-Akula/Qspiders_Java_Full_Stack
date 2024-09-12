package org.jsp.onetomanybidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomanybidirectional.entity.Accounts;
import org.jsp.onetomanybidirectional.entity.User;

public class DeleteUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		User mu=em.find(User.class, 1);
		
		et.begin();
		List<Accounts> liacc=mu.getAccounts();
		List<Accounts> newacc=new ArrayList<>();
		for(Accounts acc:liacc) {
			if(acc.getUser().getUid()==mu.getUid()) {
				newacc.add(null);
			}else {
				newacc.add(acc);
			}
		}
		mu.setAccounts(newacc);
		em.merge(mu);
		et.commit();
	}
}
