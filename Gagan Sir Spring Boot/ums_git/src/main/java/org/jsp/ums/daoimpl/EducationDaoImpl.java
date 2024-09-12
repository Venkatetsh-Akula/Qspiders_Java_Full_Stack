package org.jsp.ums.daoimpl;

import org.jsp.ums.dao.EducationDao;
import org.jsp.ums.entity.Education;
import org.jsp.ums.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class EducationDaoImpl implements EducationDao {
	
	@Autowired
	private EducationRepository educationrepository;

	@Override
	public Education daoUpdateEducation(Education education) {
		return educationrepository.save(education);
	}

}
