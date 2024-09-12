package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.FacultyDaoInterface;
import org.jsp.app.entity.Faculty;
import org.jsp.app.rapo.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FacultyDao implements FacultyDaoInterface{
	
	@Autowired
	private FacultyRepository facultyRepository;
	@Override
	public List<Faculty> daoFindAllFaculty() {
		return facultyRepository.findAll();
	}
	@Override
	public Optional<Faculty> daoFindFacultyById(int id) {
		return facultyRepository.findById(id);
	}
	@Override
	public void daoDeleteByFacultyId(int id) {
		facultyRepository.deleteById(id);
		
	}
	@Override
	public Faculty daoSaveFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}
	

}
