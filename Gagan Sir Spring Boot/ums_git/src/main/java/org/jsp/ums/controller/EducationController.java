package org.jsp.ums.controller;

import org.jsp.ums.entity.Education;
import org.jsp.ums.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educations")
public class EducationController {
	
	@Autowired
	private EducationService educationservice;
	
	
	
//	@PostMapping    				Safdar
	
	
	
	@PutMapping
	public ResponseEntity<?> updateEducationDetails(@RequestBody Education education){
		return educationservice.serviceUpdateEducation(education);
	}
	
	
//	@GetMapping("/{id}") 			Ranjitha
	
	
	
	
//	@DeleteMapping("/{id}")			Sanjeev
	
	
	
	
	
	
}
