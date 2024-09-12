package org.jsp.springboot.jdbc;

import org.jsp.springboot.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcComandLineRunner implements CommandLineRunner{
	@Autowired
	private JdbcRepository jdbcQuery; 
	@Override
	public void run(String... args) throws Exception { 	
		jdbcQuery.persist(new Course(1,"prabash","kalki"));
		jdbcQuery.persist(new Course(2,"prabash","salar"));
		jdbcQuery.persist(new Course(3,"prabash","bahubali"));
		jdbcQuery.persist(new Course(4,"Prabash","Darling"));
		jdbcQuery.persist(new Course(5,"prabash","chakaram"));
		jdbcQuery.merge(1); 
		jdbcQuery.remove(5);
		System.out.println((Course) jdbcQuery.find(2));
	}
	
}
