package org.jsp.hibernate.controller;

import org.jsp.hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ManipulationAndQuery {
	@PersistenceContext
	EntityManager em;
	public void insert(Course c) {
		em.persist(c);
	}
	public void update(int i) {
		Course c=em.find(Course.class,i);
		c.setName("cock tin");
		em.merge(c);
	}
	public void delete(int i) {
		Course c=em.find(Course.class, i);
		em.remove(c);
	}
	public Course fetch(int i) {
		Course c=em.find(Course.class, i);
		return c;
	}
	
}
