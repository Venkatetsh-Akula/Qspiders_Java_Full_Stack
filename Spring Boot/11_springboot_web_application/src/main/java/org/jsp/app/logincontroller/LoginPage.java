package org.jsp.app.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginPage {
	@RequestMapping("/login")
	public String log() {
		return "login";
	}
}
