package org.jsp.app.daointerface;

import java.util.List;
import java.util.Optional;

import org.jsp.app.entity.Course;

public interface CourseDaoInterface {

	List<Course> daoFindAllCourse();

	Optional<Course> daoFindCourseById(int id);

	Course daoSaveCourse(Course course);

	void daoCourseDeletedById(int id);

}
