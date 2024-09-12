package org.jsp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Configuration
@ComponentScan
public class PraticeProjectApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PraticeProjectApplication.class);
//		System.out.println(context.getBean(Sample.class));
//		context.getBean(Sample.class).run();
//		System.out.println(context.getBean(Driver.class));
		System.out.println(context.getBean(Driver.class).h);
	}
	@PostConstruct
	public void remo() {
		System.out.println("I am in remo method");
	}

}

@Component
interface Head{
	 public abstract void run();
}

@Component
class Driver{
	Head h;
	@Autowired
	public Driver(Head h) {
		this.h=h;
	}
}

@Component
@Qualifier("prefered")
class Sample implements Head{
	public void method() {
		System.out.println("I am in sample class");
	}
	@Override
	public void run() {
		System.out.println("i am in sample run method");
	}
}

@Component
@Primary
class Demo implements Head{
	public void method() {
		System.out.println("I am in Demo class");
	}
	@Override
	public void run() {
		System.out.println("i am in sample run method");
	}
}
