package org.jsp.ums.controller;

import org.jsp.ums.entity.User;
import org.jsp.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}

//	@PutMapping        													// Vikas and Group
	
	
	@Operation(description =  "We have to pass Task Entity as RequestBody and Passes Entity will we persisted into DB table", summary = "To Create Task Entity")
	@ApiResponses(value = {@ApiResponse(description = "Task Saved Successfully...", responseCode = "200"),@ApiResponse(description = "Unable to Save Task Becouse of Duplicate Email",responseCode = "400"),@ApiResponse(description = "Unable to Save Task Becouse of Duplicate Phone Number", responseCode = "400")})
	@GetMapping(value =  "/{id}")										// Bharath  & vamshi & Venkatesh
	public ResponseEntity<?> allUserById(@PathVariable int id)
	{
		return userService.findAllUsersById(id);
	}
	
	
//	@GetMapping     													// Misba and Group
	public ResponseEntity<?> finmdAllUsers()
	{
		return userService.findAllUsers();
	}
	
//	@PatchMapping(value = "/inactive/{id}")								// Rizwan
	
	
//	@PatchMapping( value = "/active/{id}") 								// Rizwan
	

//	@PatchMapping(value = "/blocked/{id}")								// Rizwan
	
	
//	@DeleteMapping(value =  "/{id}") 									// Chetana and Group
	
	
	
}
