package org.jsp.ums.dao;

import org.jsp.ums.entity.Education;
import org.springframework.http.ResponseEntity;

public interface EducationDao {
	Education daoUpdateEducation(Education education);
}
