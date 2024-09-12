package org.jsp.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansClass {
	@Bean
	public String hello() {
		return "hello";
	}
}
