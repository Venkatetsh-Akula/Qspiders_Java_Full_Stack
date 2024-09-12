package org.jsp.ums.service;

import org.jsp.ums.entity.Education;
import org.springframework.http.ResponseEntity;

public interface EducationService {

	ResponseEntity<?> serviceUpdateEducation(Education education);

}
