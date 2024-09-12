package org.jsp.jpa.controller;

import java.util.Optional;

import org.jsp.jpa.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CommandLine implements CommandLineRunner {
	@Autowired
	JpaRepo code;
	@Override
	public void run(String... args) throws Exception,RuntimeException {
		//to persist
		code.save(new Course("venky","pamuru"));
		code.save(new Course("sudheer","pamuru"));
		code.save(new Course("niteesh","pamuru"));
		code.save(new Course("naveen","nellore"));
		//to delete
		code.deleteById(1);
		//to find
		code.findById(2);
		//to update 
		Course c=code.findById(1).orElseThrow(() -> new RuntimeException("Course not found"));
		c.setName("harsh");
		code.save(c);
		
	}
	
}
