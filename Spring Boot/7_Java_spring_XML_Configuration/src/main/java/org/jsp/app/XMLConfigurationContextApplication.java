package org.jsp.app;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XMLConfigurationContextApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("contextConfiuration.xml");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
