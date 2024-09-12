package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Faculty;
import org.springframework.http.ResponseEntity;

public interface FacultyServiceInterface {

	ResponseEntity<?> serviceFindAllFacultys();

	ResponseEntity<?> serviceFacultyById(int id);

	ResponseEntity<?> serviceSaveFaculty(Faculty faculty);

	ResponseEntity<?> serviceDeleteById(int id);

	ResponseEntity<?> serviceUpdateFaculty(int id, Faculty faculty);

}
