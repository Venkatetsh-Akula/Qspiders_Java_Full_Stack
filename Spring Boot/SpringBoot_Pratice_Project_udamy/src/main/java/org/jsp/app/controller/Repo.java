package org.jsp.app.controller;

import org.jsp.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Employee, Integer>{
	
}
