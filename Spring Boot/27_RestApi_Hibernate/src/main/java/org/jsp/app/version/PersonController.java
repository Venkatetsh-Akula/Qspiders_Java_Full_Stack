package org.jsp.app.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 personv1Method() {
		return new PersonV1("Akula Venkatesh");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 personv2Method() {
		return new PersonV2(new PersonFirstNameLastName("Akula","venkatesh"));
	}
	
	
	//Amazon path
	@GetMapping(path="/person",params = "version=1")
	public PersonV1 personv1MethodOfRequestParameter() {
		return new PersonV1("Akula Venkatesh");
	}
	@GetMapping(path="/person",params="version=2")
	public PersonV2 personv2MethodOfRequestParameter() {
		return new PersonV2(new PersonFirstNameLastName("Akula","venkatesh"));
	}
	
	//microsoft path
	@GetMapping(path="/person/header",headers="X-API-VERSION=1")
	public PersonV1 personv1microsoft() {
		return new PersonV1("Akula Venkatesh");
	}
	
	@GetMapping(path="/person/header",headers="X-API-VERSION=2")
	public PersonV2 personv2microsoft() {
		return new PersonV2(new PersonFirstNameLastName("Akula","Venkatesh"));
	}
	
	//media type version
	@GetMapping(path="/person/accept",produces ="application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("Akula Venkatesh");
	}
	
	@GetMapping(path="/person/accept",produces="application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new PersonFirstNameLastName("Akula","venkatesh"));
	}
	
}
