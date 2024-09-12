package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.StudentDaoInterface;
import org.jsp.app.entity.Student;
import org.jsp.app.rapo.StudentRepository;
import org.jsp.app.serviceinterface.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao implements StudentDaoInterface{
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public List<Student> daoFindAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Optional<Student> daoFindStudentById(int id) {
		return studentrepo.findById(id);
	}

	@Override
	public Student daoSaveStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public void daoDeleteById(int id) {
		studentrepo.deleteById(id);
		
	}

}
