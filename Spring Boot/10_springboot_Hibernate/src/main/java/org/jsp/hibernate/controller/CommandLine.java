package org.jsp.hibernate.controller;


import org.jsp.hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner{
	
	@Autowired
	ManipulationAndQuery mq;
	@Override
	public void run(String... args) throws Exception {
		//insert of data
		mq.insert(new Course("venky","fry peice"));
		mq.insert(new Course("sudheer","boneless"));
		mq.insert(new Course("navenn","fish curry"));
		mq.insert(new Course("niteesh","veg-biriyani"));
		
		//update
		mq.update(1);
		//remove
		mq.delete(4);
		//find
		System.out.println(mq.fetch(3));
	}

}
