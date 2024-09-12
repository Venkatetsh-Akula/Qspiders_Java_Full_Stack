package org.jsp.app.serviceinterface;

import org.jsp.app.entity.LoginDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface LoginServiceInterface {

	public ResponseEntity<?> userAuthentication(LoginDetails login);

}
