package org.jsp.learnspringframework;

import org.jsp.learnspringframework.game.GameRunner;
import org.jsp.learnspringframework.game.GamingConsole;
import org.jsp.learnspringframework.game.MarioGame;
import org.jsp.learnspringframework.game.PacmanGame;
import org.jsp.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.jsp.learnspringframework.game")
public class LearnSpringFramework02Application {
	@Bean
	public GamingConsole mario() {
		return new MarioGame();
	}
//	@Bean
//	public GamingConsole pacmangame() {
//		return new PacmanGame();
//	}
	@Bean
	public GamingConsole supercontragame() {
		return new SuperContraGame();
	}
	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFramework02Application.class, args);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringFramework02Application.class);
		//System.out.println(context.getBean("mario"));
		//System.out.println(context.getBean("pacmangame"));
		context.getBean(GamingConsole.class).up();
		context.getBean(PacmanGame.class).down();
	}

}
 