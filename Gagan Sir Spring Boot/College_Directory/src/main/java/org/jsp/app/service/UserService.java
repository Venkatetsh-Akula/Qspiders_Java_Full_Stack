package org.jsp.app.service;


import java.util.Optional;

import org.jsp.app.daointerface.UserDaoInterface;
import org.jsp.app.entity.Users;
import org.jsp.app.exception.EmailAlreadyExist;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoUserFoundException;
import org.jsp.app.serviceinterface.UserInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {
	
	@Autowired
	private UserDaoInterface userdao;
	
	//users operation
	
	//Get Mapping users
	@Override
	public ResponseEntity<?> serviceFindAllUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
				.message("Users Find").body(userdao.daoFindAllUsers()).build());
	}
	
	//GetMapping by ID
		@Override
		public ResponseEntity<?> serviceUsersById(int id) {
			Optional<Users> users=userdao.daoFindUserById(id);
			if(users.isEmpty()) {
				throw NoUserFoundException.builder().message("User Not Found").build();
			}
			else {
				return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
						.message("User Found").body(users).build());
			}
		}
		
	//PostMapping Users
	@Override
	public ResponseEntity<?> serviceSaveUser(Users users) {
		Optional<Users> usersemail=userdao.daoFindByEmail(users.getEmail());
		if(!usersemail.isEmpty()) {
			throw EmailAlreadyExist.builder().message("email already exist").build();
		}
		else if(users.getEmail()!=null || users.getFullname()==null || users.getPassword()==null) {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value()).message("User Saved").body(userdao.saveUser(users)).build());
		}
		else {
			throw InvalidData.builder().message("User Data is Miss matchs").build();
		}
	}
	//DeleteMapping delete
	@Override
	public ResponseEntity<?> serviceDeleteById(int id) {
		Optional<Users> users=userdao.daoFindUserById(id);
		if(users.isPresent()) {
			userdao.daoDeleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("User Deleted Successfully").body(users).build());
		}else {
			throw NoUserFoundException.builder().message("User Not Found").build();
		}
	}
	
	//Putmapping user
	@Override
	public ResponseEntity<?> serviceUpdateUser(int id,Users users) {
		Optional<Users> userid=userdao.daoFindUserById(id);
		if(userid.isEmpty()) {
			throw NoUserFoundException.builder().message("User Not Found").build();
		}
		else {
			Users updatedUser=userdao.saveUser(users);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("User Updated Success fully").body(updatedUser).build());
		}
	}

	
	

}
