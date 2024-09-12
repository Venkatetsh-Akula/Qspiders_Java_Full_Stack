package org.jsp.app.springsecurity;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityClass {
	
	//it will store the data(user,password) in the UserDetails interface 
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetails1 = createNewUser("venky", "123");
		UserDetails userDetails2 = createNewUser("venkyreddy", "1234");
		return new InMemoryUserDetailsManager(userDetails1,userDetails2); 
	}
    
	
	//in this method it set the username and password in the spring security finally gives data to the UserDetails interface
	//passwordEncoder is a variable that encode the date in BCryptPasswordEncoder format
	
	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder=input->passwordEncoder().encode(input);
		UserDetails userDetails=User.builder()
								.passwordEncoder(passwordEncoder)
								.username(username)
								.password(password)
								.roles("USER","ADMIN")
								.build();
		return userDetails;
	}
	
	//in this will check the password in the form of BCryptPasswordEncoder format
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//this hole method provide security to the h2-database security
	// this will accept the request from the login data
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//all request are authenticated
		http.authorizeHttpRequests(
				auth->auth.anyRequest().authenticated());
		//if authentication is wrong this methd will take over and redirect to loginpage
		http.formLogin(withDefaults());
		//one of the security propety is disabled
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
}
