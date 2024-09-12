package org.jsp.app.todojpa;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoControllerJpa {
	@Autowired
	private TodoState todo;
	@Autowired
	private TodoRepository todorepo;
	
	
	@RequestMapping(value="/")
	public String welcomeMethod() {
		return "welcomeweb";
	}
	
	@RequestMapping(value="/todorequest")
	public String todoMethod(ModelMap model) {
		//List<TodoComponent> todoli=todo.getTodoli();
		List<TodoComponent> todoli=todorepo.findAll();
		model.put("todolist", todoli);
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
		//System.out.println(tc);
		todorepo.save(tc);
		//todo.addTodoLi(tc.getId(),tc.getUsername(),tc.getDescription(),tc.getTargetdate(),tc.getState());
		return "redirect:todorequest";
	}
	
	
	@RequestMapping(value="/deletetodorequest")
	public String removeTodoMethod(@RequestParam int id){
		todorepo.deleteById(id);
		//todo.removeTodoLi(id);
		return "redirect:todorequest";
	}
	
	@RequestMapping(value="/updatetodorequest",method = RequestMethod.GET)
	public String updateTodoMethod(@RequestParam int id,ModelMap model) {
		//TodoComponent tc=todo.getTodoComponent(id);
		TodoComponent tc=todorepo.findById(id).get();
		model.put("TodoComponent", tc);
		return "updateweb";
	}
	
	@RequestMapping(value="/updatetodorequest",method=RequestMethod.POST)
	public String updateTodoMethodPost(ModelMap model,TodoComponent tc) {
		todorepo.save(tc);
		//todo.updateTodoli(tc.getId(),tc);
		return "redirect:todorequest";
	}
}
