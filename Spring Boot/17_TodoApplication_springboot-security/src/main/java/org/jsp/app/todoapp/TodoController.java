package org.jsp.app.todoapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	
	@Autowired
	private TodoState todo;
	
	@RequestMapping(value="/")
	public String welcomeMethod() {
		return "welcomeweb";
	}
	
	@RequestMapping(value="/todorequest")
	public String todoMethod(ModelMap model) {
		model.put("todolist", todo.getTodoli());
		return "todoweb";
	}
	@RequestMapping(value="/addtodorequest",method = RequestMethod.GET)
	public String addTodoMethod(ModelMap model) {
		TodoComponent td=new TodoComponent(0,"","",LocalDate.now(),false);
		model.put("TodoComponent", td);
		return "addtodoweb";
	}
	
	@RequestMapping(value="/addtodorequest",method=RequestMethod.POST)
	public String addTodoMethodPost(ModelMap model, TodoComponent tc) {
		System.out.println(tc);
		todo.addTodoLi(tc.getId(),tc.getUsername(),tc.getDescription(),tc.getTargetdate(),tc.getState());
		//todo.getTodoli().add(tc);
		return "redirect:todorequest";
	}
	
	
	@RequestMapping(value="/deletetodorequest")
	public String removeTodoMethod(@RequestParam int id){
		todo.removeTodoLi(id);
		return "redirect:todorequest";
	}
	
	@RequestMapping(value="/updatetodorequest",method = RequestMethod.GET)
	public String updateTodoMethod(@RequestParam int id,ModelMap model) {
		TodoComponent tc=todo.getTodoComponent(id);
		model.put("TodoComponent", tc);
		return "updateweb";
	}
	
	@RequestMapping(value="/updatetodorequest",method=RequestMethod.POST)
	public String updateTodoMethodPost(ModelMap model,TodoComponent tc) {
		System.out.println(tc);
		todo.updateTodoli(tc.getId(),tc);
		return "redirect:todorequest";
	}
}
