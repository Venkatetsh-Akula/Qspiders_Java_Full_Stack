package org.jsp.app.dao;

import java.util.Optional;

import org.jsp.app.daointerface.LoginDaoInterface;
import org.jsp.app.entity.Users;
import org.jsp.app.rapo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao implements LoginDaoInterface {
	
	@Autowired
	private LoginRepository loginrepository;
	@Override
	public Optional<Users> daoFindUser(String email, String password) {
		return loginrepository.findByEmailPassword(email,password);
	}

}
