package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Student;
import org.jsp.app.entity.Users;
import org.springframework.http.ResponseEntity;

public interface StudentServiceInterface {

	ResponseEntity<?> serviceFindAllStudents();

	ResponseEntity<?> serviceStudentById(int id);

	ResponseEntity<?> serviceSaveStudent(Student student);

	ResponseEntity<?> serviceDeleteById(int id);

	ResponseEntity<?> serviceUpdateStudent(int id, Student student);

}
