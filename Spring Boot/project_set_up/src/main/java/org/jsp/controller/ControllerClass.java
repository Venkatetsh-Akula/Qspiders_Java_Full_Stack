package org.jsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ControllerClass {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Hello");
		return "home";
	}
}

