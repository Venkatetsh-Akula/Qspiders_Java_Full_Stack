package org.jsp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
//@Component
@Named
class BusinessService{
	private DataService dataservice; 
	
	//@Autowired
	@Inject
	public void setDataService(DataService dataservice) {
		this.dataservice=dataservice;
	}
	
	public DataService getDataService() {
		return dataservice;
	}
}

//@Component
@Named
class DataService{
	
}
@Configuration
@ComponentScan
public class JakartaAndCDIApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JakartaAndCDIApplication.class);
		System.out.println(BusinessService.class);
	}

}
