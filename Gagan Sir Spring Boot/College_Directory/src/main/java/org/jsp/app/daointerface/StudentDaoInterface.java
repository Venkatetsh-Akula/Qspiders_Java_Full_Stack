package org.jsp.app.daointerface;

import java.util.List;

import org.jsp.app.entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface StudentDaoInterface {

	List<Student> daoFindAllStudents();

	Optional<Student> daoFindStudentById(int id);

	Student daoSaveStudent(Student student);

	void daoDeleteById(int id);

}
