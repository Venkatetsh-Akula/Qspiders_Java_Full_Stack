package org.jsp.app.controller;

import java.net.URI;
import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


import org.jsp.app.userentity.UserDaOService;
import org.jsp.app.userentity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserControllerClass {
	
	private UserDaOService us;
	
	public UserControllerClass(UserDaOService us) {
		this.us=us;
	}
	
	
	@GetMapping("/users/{id}")
	public EntityModel<UserEntity> retriveUser(@PathVariable int id){
		UserEntity ue=us.findById(id);
		if(ue==null) {
			throw new IdNotFindException("Perticular user Not found");
		}
		EntityModel<UserEntity> entityModel=EntityModel.of(ue);
		
		
		//used to create link this class
		WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).getUserMethod());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}
	
	
	@GetMapping("/users")
	public List<UserEntity> getUserMethod(){
		return  us.findAll();
	}
	
	/*
	 * @GetMapping("/users/{id}") public List<UserEntity>
	 * getUserIdMethod(@PathVariable int id){ if(us.findById(id)==null) { throw new
	 * IdNotFindException(id+" No id exsist in the ArrayList"); } return
	 * us.findAllById(id); }
	 */
	
	@PostMapping("/users")
	public ResponseEntity<UserEntity> postUserMethod(@Valid @RequestBody UserEntity ue) {
		us.saveUser(ue);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(ue.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUserMethod(@PathVariable int id) {
		us.deleteById(id);
	}
	
}
