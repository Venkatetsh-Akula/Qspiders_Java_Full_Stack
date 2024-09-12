package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.CourseDaoInterface;
import org.jsp.app.entity.Course;
import org.jsp.app.rapo.CourseRepository;
import org.jsp.app.serviceinterface.CourseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao implements CourseDaoInterface{
	
	@Autowired
	private CourseRepository courserepository;
	@Override
	public List<Course> daoFindAllCourse() {
		return courserepository.findAll();
	}
	@Override
	public Optional<Course> daoFindCourseById(int id) {
		return courserepository.findById(id);
	}
	@Override
	public Course daoSaveCourse(Course course) {
		return courserepository.save(course);
	}
	@Override
	public void daoCourseDeletedById(int id) {
		courserepository.deleteById(id);	
	}

}
