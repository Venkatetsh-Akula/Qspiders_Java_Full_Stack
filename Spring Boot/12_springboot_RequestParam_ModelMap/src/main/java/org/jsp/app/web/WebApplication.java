package org.jsp.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebApplication {
	@RequestMapping("/param")
	public String webpage(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		return "paramlogin";
	}
}
