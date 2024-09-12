package org.jsp.app.daointerface;

import java.util.List;
import java.util.Optional;

import org.jsp.app.entity.Faculty;

public interface FacultyDaoInterface {

	List<Faculty> daoFindAllFaculty();

	Optional<Faculty> daoFindFacultyById(int id);

	void daoDeleteByFacultyId(int id);

	Faculty daoSaveFaculty(Faculty faculty);

}
