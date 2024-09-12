package org.jsp.app.daointerface;

import java.util.List;
import java.util.Optional;

import org.jsp.app.entity.Enrollment;

public interface EnrollmentDaoInterface {

	List<Enrollment> daoFindAllEnrollment();

	Optional<Enrollment> daoFindEnrollmentById(int id);

	Enrollment daoSaveEnrollment(Enrollment enrollment);

	void daoDeleteEnrollment(int id);

	

}
