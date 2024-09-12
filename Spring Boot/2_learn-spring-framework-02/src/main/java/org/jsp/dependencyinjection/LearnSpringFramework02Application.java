package org.jsp.dependencyinjection;

import org.jsp.learnspringframework.game.GameRunner;
import org.jsp.learnspringframework.game.GamingConsole;
import org.jsp.learnspringframework.game.MarioGame;
import org.jsp.learnspringframework.game.PacmanGame;
import org.jsp.learnspringframework.game.SuperContraGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	//field level injection(AutoWried)
	//@Autowired
	Dependency1 dependency1;
	//@Autowired
	Dependency2 dependency2;
	
	//constructor Injection(Autowired)
		@Autowired
	public YourBusinessClass(Dependency1 dependency1,Dependency2 dependency2) {
		this.dependency1=dependency1;
		this.dependency2=dependency2;
	}
	
	//setter Injection(Autowired)
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1=dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2=dependency2;
	}
	@Override
	public String toString() {
		return "Using "+dependency1+" and "+dependency2;
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}
@Configuration
@ComponentScan
public class LearnSpringFramework02Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringFramework02Application.class);
		System.out.println(context.getBean(YourBusinessClass.class));
		System.out.println(context.getBean(Dependency1.class));
	}

}
 