package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.UserDaoInterface;
import org.jsp.app.entity.Users;
import org.jsp.app.rapo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements UserDaoInterface{
	@Autowired
	private UserRepository userrepo;
	
	//users operation
	
	@Override
	public Users saveUser(Users users) {
		
		return userrepo.save(users);
	}

	@Override
	public Optional<Users> daoFindByEmail(String email) {
		return userrepo.findByEmail(email);
	}

	@Override
	public List<Users> daoFindAllUsers() {
		return userrepo.findAll();
	}

	@Override
	public Optional<Users> daoFindUserById(int id) {
		return userrepo.findById(id);
	}

	@Override
	public void daoDeleteById(int id) {
		userrepo.deleteById(id);
	}

	
}
