package org.jsp.app.todoapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class TodoList {
	public static int i=0;
	private static List<TodoDetails> todos=new ArrayList();
	static {
		todos.add(new TodoDetails(++i,"java","learn core java",LocalDate.now().plusYears(1),true));
		todos.add(new TodoDetails(++i,"java","learn spring",LocalDate.now().plusYears(1),false));
		todos.add(new TodoDetails(++i,"java","learn springboot",LocalDate.now().plusYears(1),false));
	}
	
	public List<TodoDetails> findByUsername(String name){
		return todos;
	}
	public void newtodo(String username,String description,boolean isdone) {
		todos.add(new TodoDetails(++i,username,description,LocalDate.now().plusYears(1),isdone));
	}
}
