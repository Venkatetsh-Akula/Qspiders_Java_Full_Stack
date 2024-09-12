package org.jsp.app.service;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.EnrollmentDaoInterface;
import org.jsp.app.entity.Enrollment;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoEnrollmentFoundException;
import org.jsp.app.serviceinterface.EnrollmentServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService implements EnrollmentServiceInterface {
	
	@Autowired
	private EnrollmentDaoInterface enrollmentdao;
	
	@Override
	public ResponseEntity<?> serviceFindAllEnrollments() {
		List<Enrollment> enrollmentli=enrollmentdao.daoFindAllEnrollment();
		if(enrollmentli.size()==0) {
			throw NoEnrollmentFoundException.builder().message("No emrollment found in list").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("List Of Enrollments").body(enrollmentli).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceEnrollmentById(int id) {
		Optional<Enrollment> enrollment=enrollmentdao.daoFindEnrollmentById(id);
		if(enrollment.isEmpty()) {
			throw NoEnrollmentFoundException.builder().message("No emrollment found").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Enrollments Found").body(enrollment).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceSaveEnrollment(Enrollment enrollment) {
		if(enrollment==null) {
			throw InvalidData.builder().message("Invalid Enrollment data").build();
		}
		else {
			Enrollment enroll=enrollmentdao.daoSaveEnrollment(enrollment);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Enrollments saved").body(enroll).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDeleteEnrollmentById(int id) {
		Optional<Enrollment> enrollment=enrollmentdao.daoFindEnrollmentById(id);
		if(enrollment.isEmpty()) {
			throw NoEnrollmentFoundException.builder().message("No emrollment found").build();
		}
		else {
			enrollmentdao.daoDeleteEnrollment(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Enrollments Deleted SuccessFully").body(enrollment).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceUpdateAdministrator(int id, Enrollment enrollment) {
		Optional<Enrollment> enroll=enrollmentdao.daoFindEnrollmentById(id);
		if(enroll.isEmpty()) {
			throw NoEnrollmentFoundException.builder().message("No emrollment found").build();
		}
		else {
			Enrollment updatedEnrollment= enrollmentdao.daoSaveEnrollment(enrollment);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Enrollments Updated SuccessFully").body(updatedEnrollment).build());
		}
	}

}
