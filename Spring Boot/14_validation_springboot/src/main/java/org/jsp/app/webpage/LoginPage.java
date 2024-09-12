package org.jsp.app.webpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginPage {
	private CredentialClass cc;
	public LoginPage(CredentialClass cc) {
		this.cc=cc;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String details() {
		return "details";
	}
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public String welcomepage(@RequestParam String name,@RequestParam String password,ModelMap model) {
//		System.out.println("hii");
//		model.put("name", name);
//		model.put("password", password);
//		return "welcome";
//	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String page(@RequestParam String name,@RequestParam String password,ModelMap model) {
		if(cc.check(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		model.put("credentials", "invalid credentials");
		return "details";
	}
}
