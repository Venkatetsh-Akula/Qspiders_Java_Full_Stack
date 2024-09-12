package org.jsp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA a;
	public ClassB(ClassA a) {
		this.a=a;
	}
	public void doSomething() {
		System.out.println("Object is created by bean and autowire will done by Qulifier");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {
	
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LazyInitializationApplication.class);
	System.out.println(context.getBean(ClassB.class));
	context.getBean(ClassB.class).doSomething(); 
	}

}
