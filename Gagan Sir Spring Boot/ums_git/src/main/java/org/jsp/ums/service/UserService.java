package org.jsp.ums.service;

import org.jsp.ums.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<?> saveUser(User user);

	ResponseEntity<?> findAllUsersById(int id);

	ResponseEntity<?> findAllUsers();
	
}
