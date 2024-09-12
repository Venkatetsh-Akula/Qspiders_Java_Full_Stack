package org.jsp.app.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoList li;
	@Autowired
	private Validation valid;
	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public String loginweb() {
		return "logindetails";
	}
	@RequestMapping(value="/loginpage",method=RequestMethod.POST)
	public String welcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		if(valid.check(name,password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}else {
			model.put("credintails", "invalid username or password");
			return "logindetails";
		}
		
	}
	@RequestMapping(value="/todo")
	public String todopage(ModelMap model) {
		model.put("name",model.get("name"));
		model.put("todolist",li.findByUsername("java"));
		return "todoweb";
	}
	
	@RequestMapping(value="/addtodoweb",method=RequestMethod.GET)
	public String todomerge() {
		return "addtodo";
	}
	@RequestMapping(value="/addtodoweb",method=RequestMethod.POST)
	public String addedtodo(@RequestParam String description,ModelMap model) {
		System.out.println("Result is:->"+description);
		if(!description.equals("")) {
			li.newtodo("java",description,true);
			return "redirect:todo";
		}else {
			return "redirect:todo";
		}
		
	}
	
}
