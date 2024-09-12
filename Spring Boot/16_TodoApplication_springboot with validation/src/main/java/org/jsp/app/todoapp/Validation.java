package org.jsp.app.todoapp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class Validation {
	public boolean check(String name,String password) {
		if(name.equals("venky") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
}
