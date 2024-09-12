package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Users;
import org.springframework.http.ResponseEntity;

public interface UserInterface {
	
	//users operation

	public ResponseEntity<?> serviceSaveUser(Users users);

	public ResponseEntity<?> serviceFindAllUsers();

	public ResponseEntity<?> serviceDeleteById(int id);

	public ResponseEntity<?> serviceUpdateUser(int id, Users user);

	public ResponseEntity<?> serviceUsersById(int id);
	
	
}
