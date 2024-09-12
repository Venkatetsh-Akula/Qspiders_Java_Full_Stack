package org.jsp.app.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@GetMapping is used to not menction of method=RequestMethod.GET 
	@GetMapping(path="/helloworld")
	public String helloWorldMethod() {
		return "Hello World";
	}
	
	@GetMapping(path="/helloworldbean")
	public HelloWorldBean helloWorldBeanMethod() {
		return new HelloWorldBean("Hello world");
	}
	
	@GetMapping(path="/helloworldbean/pathvariable/{msg}")
	public HelloWorldBean helloWorldPathVariableMethod(@PathVariable String msg) {
		return new HelloWorldBean("Hello world to "+msg);
	}
}
