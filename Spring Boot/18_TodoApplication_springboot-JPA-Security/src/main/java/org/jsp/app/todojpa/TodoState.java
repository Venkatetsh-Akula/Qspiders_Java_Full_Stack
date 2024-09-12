package org.jsp.app.todojpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class TodoState {
	static int i=0;
	private static List<TodoComponent> todoli=new ArrayList<>();
	static {
		todoli.add(new TodoComponent(++i,"java","core java",LocalDate.now().plusYears(1),true));
		todoli.add(new TodoComponent(++i,"java","java JDBC",LocalDate.now().plusYears(1),true));
		todoli.add(new TodoComponent(++i,"java","java Servlet",LocalDate.now().plusYears(1),true));
	}
	public List<TodoComponent> getTodoli() {
		return todoli;
	}
	public void addTodoLi(int id,String username,String description,LocalDate time,boolean state) {
		todoli.add(new TodoComponent(id,username,description,time,state));		
	}
	
	public void removeTodoLi(int id) {
		for(TodoComponent tc:todoli) {
			if(tc.getId()==id) {
				todoli.remove(todoli.indexOf(tc));
				break;
			}
		}
	}
	public void updateTodoli(int id,TodoComponent tc) {
		removeTodoLi(id);
		todoli.add(tc);
	}
	
	public TodoComponent getTodoComponent(int id) {
		for(TodoComponent tc:todoli) {
			if(tc.getId()==id) {
				return tc;
			}
		}
		return null;
	}
}
