package org.jsp.app.webpage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CredentialClass {
	public boolean check(String name,String password) {
		if(name.equals("venky") && password.equals("123")) {
			return true;
		}
		return false;
	}
}
