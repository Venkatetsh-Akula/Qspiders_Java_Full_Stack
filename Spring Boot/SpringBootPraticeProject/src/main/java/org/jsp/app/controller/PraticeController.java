package org.jsp.app.controller;

import java.util.List;

import org.jsp.app.entity.EmployeeEntity;
import org.jsp.app.jparepo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("ename")
public class PraticeController {
	
	@Autowired
	private EmployeeEntity ee;
	
	@Autowired
	private EmployeeRepo er;
	
	@RequestMapping(value="loginrequest",method=RequestMethod.GET)
	public String loginGetMethod(ModelMap model) {
		EmployeeEntity e1=new EmployeeEntity("empty",0,0.0);
		model.put("e1", e1);
		return "loginweb";
	}
	@RequestMapping(value="loginrequest",method=RequestMethod.POST)
	public String loginPostMethod(ModelMap model,EmployeeEntity e1) {
		System.out.println(e1);
		er.save(e1);
		List<EmployeeEntity> eli=er.findAll();
		model.put("e1", eli);
		return "display";
	}
}
