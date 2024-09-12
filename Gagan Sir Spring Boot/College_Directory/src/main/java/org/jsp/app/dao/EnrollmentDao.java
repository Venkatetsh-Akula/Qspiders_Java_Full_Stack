package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.EnrollmentDaoInterface;
import org.jsp.app.entity.Enrollment;
import org.jsp.app.rapo.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EnrollmentDao implements EnrollmentDaoInterface {
	
	@Autowired
	private EnrollmentRepository enrollmentrepository;
	@Override
	public List<Enrollment> daoFindAllEnrollment() {
		return enrollmentrepository.findAll();
	}
	@Override
	public Optional<Enrollment> daoFindEnrollmentById(int id) {
		return enrollmentrepository.findById(id);
	}
	@Override
	public Enrollment daoSaveEnrollment(Enrollment enrollment) {
		return enrollmentrepository.save(enrollment);
	}
	@Override
	public void daoDeleteEnrollment(int id) {
		enrollmentrepository.deleteById(id);
	}
	
	
	
}
