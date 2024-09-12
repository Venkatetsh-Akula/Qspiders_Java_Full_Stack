package org.jsp.app.service;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.StudentDaoInterface;
import org.jsp.app.entity.Student;
import org.jsp.app.entity.Users;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoStudentFoundException;
import org.jsp.app.exception.NoUserFoundException;
import org.jsp.app.serviceinterface.StudentServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceInterface {
	@Autowired
	private StudentDaoInterface  studentdao;

	@Override
	public ResponseEntity<?> serviceFindAllStudents() {
		List<Student> studentlist=studentdao.daoFindAllStudents();
		if(!studentlist.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Students Found").body(studentlist).build());
		}
		else {
			throw NoStudentFoundException.builder().message("No Student Exist").build();
		}
	}

	@Override
	public ResponseEntity<?> serviceStudentById(int id) {
		Optional<Student> student=studentdao.daoFindStudentById(id);
		if(student.isEmpty()) {
			throw NoStudentFoundException.builder().message("No Student Found Based on the Id").build();
		}
		else{
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Student Found").body(student).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceSaveStudent(Student student) {
		if(student==null) {
			throw InvalidData.builder().message("Student Data is Miss matchs").build();
		}
		else {
			Student std=studentdao.daoSaveStudent(student);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Student Saved").body(std).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDeleteById(int id) {
		Optional<Student> std=studentdao.daoFindStudentById(id);
		if(std.isEmpty()) {
			throw NoStudentFoundException.builder().message("Student Not Found").build();
		}
		else {
			studentdao.daoDeleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("User Deleted Successfully").body(std).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceUpdateStudent(int id, Student student) {
		Optional<Student> std=studentdao.daoFindStudentById(id);
		if(std.isEmpty()) {
			throw NoStudentFoundException.builder().message("Student Not Found").build();
		}
		else {
			Student updatedstudent=studentdao.daoSaveStudent(student);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Student Updated Successfully").body(updatedstudent).build());
		}
	}
}
