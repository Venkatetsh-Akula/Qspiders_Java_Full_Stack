package org.jsp.app.todoapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
	
	@RequestMapping(value="/welcomepage")
	public String welcomeMethod() {
		return "welcome";
	}
	@RequestMapping(value="/todo")
	public String todopage(ModelMap model) {
		model.put("name",model.get("name"));
		model.put("todolist",li.findByUsername("java"));
		return "todoweb";
	}
	
	@RequestMapping(value="/addtodoweb",method=RequestMethod.GET)
	public String todomerge(ModelMap model) {
		String username=(String)model.get("name");
		TodoDetails todo=new TodoDetails(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("TodoDetails", todo);
		return "addtodo";
	}
	@RequestMapping(value="/addtodoweb",method=RequestMethod.POST)
	public String addedtodo(ModelMap model,@Valid TodoDetails todo,BindingResult res) {
		if(res.hasErrors()) {
			System.out.println(res+"--->");
			return "addtodo";
		}
		String username=(String) model.get("name");
		li.newtodo(username, todo.getDescription(),todo.getDone());
		return "redirect:todo";
	}
	
	@RequestMapping(value="/tododelete")
	public String delete(@RequestParam int id) {
		li.removeById(id);
		return "redirect:todo";
	}
	
	@RequestMapping(value="/todoupdate",method=RequestMethod.GET)
	public String update(@RequestParam int id,ModelMap model) {
		TodoDetails todo=li.findById(id);
		model.addAttribute("TodoDetails",todo);
		return "updatetodo";
	}
	
	@RequestMapping(value="/todoupdate",method=RequestMethod.POST)
	public String update(ModelMap model,TodoDetails todo) {
		li.updateData(todo);
		return "redirect:todo";
	}
	
}
