package org.jsp.ums.serviceimpl;

import org.jsp.ums.dao.EducationDao;
import org.jsp.ums.entity.Education;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.jsp.ums.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	private EducationDao educationdao;
	
	@Override
	public ResponseEntity<?> serviceUpdateEducation(Education education) {
		Education updatedEducation= educationdao.daoUpdateEducation(education);
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value())
								.message("Education Details Updated").body(updatedEducation).build());
	}

}
