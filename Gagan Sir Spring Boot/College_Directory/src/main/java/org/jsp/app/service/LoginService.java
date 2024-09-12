package org.jsp.app.service;

import java.util.Optional;

import org.jsp.app.daointerface.LoginDaoInterface;
import org.jsp.app.entity.LoginDetails;
import org.jsp.app.entity.Users;
import org.jsp.app.exception.InvalidCredentials;
import org.jsp.app.serviceinterface.LoginServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginServiceInterface {
	@Autowired
	private LoginDaoInterface logindao;
	@Override
	public ResponseEntity<?> userAuthentication(LoginDetails login) {
		Optional<Users> user=logindao.daoFindUser(login.getEmail(),login.getPassword());
		if(user.isEmpty()) {
			throw InvalidCredentials.builder().message("email or password is wrong").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.FOUND.value())
					.message("User found").body(user).build());
		}
	}

}
