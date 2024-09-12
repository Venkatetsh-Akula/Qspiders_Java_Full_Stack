package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Administrator;
import org.springframework.http.ResponseEntity;

public interface AdministratorServiceInterface {

	ResponseEntity<?> serviceFindAllAdministrators();

	ResponseEntity<?> serviceAdministratorById(int id);

	ResponseEntity<?> serviceSaveAdministrator(Administrator administrator);

	ResponseEntity<?> serviceDeleteById(int id);

	ResponseEntity<?> serviceUpdateAdministrator(int id, Administrator administrator);

}
