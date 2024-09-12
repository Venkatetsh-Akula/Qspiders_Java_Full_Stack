package org.jsp.app.daointerface;

import java.util.List;
import java.util.Optional;

import org.jsp.app.entity.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

public interface UserDaoInterface {
	
	//users operation

	public Users saveUser(Users users);

	public Optional<Users> daoFindByEmail(String email);

	public List<Users> daoFindAllUsers();

	public Optional<Users> daoFindUserById(int id);

	public void daoDeleteById(int id);
	
}
