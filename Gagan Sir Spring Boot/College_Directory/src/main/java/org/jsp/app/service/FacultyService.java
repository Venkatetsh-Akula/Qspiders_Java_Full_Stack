package org.jsp.app.service;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.FacultyDaoInterface;
import org.jsp.app.entity.Faculty;
import org.jsp.app.entity.Users;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoFacultyFoundException;
import org.jsp.app.exception.NoUserFoundException;
import org.jsp.app.serviceinterface.FacultyServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FacultyService implements FacultyServiceInterface{
	
	@Autowired
	private FacultyDaoInterface facultydao;
	
	@Override
	public ResponseEntity<?> serviceFindAllFacultys() {
		List<Faculty> facultylist=facultydao.daoFindAllFaculty();
		if(facultylist.size()==0) {
			throw NoFacultyFoundException.builder().message("NO faculty Found").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("List of Faculty").body(facultylist).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceFacultyById(int id) {
		Optional<Faculty> faculty=facultydao.daoFindFacultyById(id);
		if(faculty.isEmpty()) {
			throw NoFacultyFoundException.builder().message("NO faculty Found using this id").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Faculty found").body(faculty).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceSaveFaculty(Faculty faculty) {
		if(faculty==null) {
			throw InvalidData.builder().message("Faculty Data is Miss matchs").build();
		}
		else {
			Faculty fac=facultydao.daoSaveFaculty(faculty);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Faculty Saved").body(fac).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDeleteById(int id) {
		Optional<Faculty> faculty=facultydao.daoFindFacultyById(id);
		if(faculty.isEmpty()) {
			throw NoFacultyFoundException.builder().message("NO faculty Found using this id").build();
		}
		else {
			facultydao.daoDeleteByFacultyId(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Faculty deleted").body(faculty).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceUpdateFaculty(int id, Faculty faculty) {
		Optional<Faculty> facultyid=facultydao.daoFindFacultyById(id);
		if(facultyid.isEmpty()) {
			throw NoUserFoundException.builder().message("Faculty Not Found").build();
		}
		else {
			Faculty updatedFaculty=facultydao.daoSaveFaculty(faculty);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("User Updated Success fully").body(updatedFaculty).build());
		}
	}

}
