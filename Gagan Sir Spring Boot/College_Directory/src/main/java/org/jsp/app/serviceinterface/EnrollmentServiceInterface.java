package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Enrollment;
import org.springframework.http.ResponseEntity;

public interface EnrollmentServiceInterface {

	ResponseEntity<?> serviceFindAllEnrollments();

	ResponseEntity<?> serviceEnrollmentById(int id);

	ResponseEntity<?> serviceSaveEnrollment(Enrollment enrollment);

	ResponseEntity<?> serviceDeleteEnrollmentById(int id);

	ResponseEntity<?> serviceUpdateAdministrator(int id, Enrollment enrollment);

}
