package org.jsp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency somedependency;
	public SomeClass(SomeDependency somedependency) {
		super();
		this.somedependency=somedependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct  //it will help call method after intlizing object to independent object in current class
	public void initialize() {
		somedependency.getReady();
	}
	
	@PreDestroy  // it will invoke complete excuation of the program
	public void cleanUp() {
		System.out.println("cleanup");
	}
	
	
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("Some Logic Using SomeDependency");
	}
}


@Configuration
@ComponentScan
public class PrepPostAnnotationContextLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrepPostAnnotationContextLauncherApplication.class);
		System.out.println(context.getBean(SomeClass.class));
	
	}

}
