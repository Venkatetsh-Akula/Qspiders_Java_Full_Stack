package org.jsp.app.controller;

import org.jsp.app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ControllerClass implements CommandLineRunner{
	@Autowired
	Repo code;

	@Override
	public void run(String... args) throws Exception {
		code.save(new Employee("niteesh",10));
		code.save(new Employee("sudheer",20));
		code.save(new Employee("naveen",30));
		code.save(new Employee("venky",40));
	}
	
}
