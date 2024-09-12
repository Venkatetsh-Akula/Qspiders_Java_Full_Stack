package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Administrator;
import org.jsp.app.entity.Course;
import org.springframework.http.ResponseEntity;

public interface CourseServiceInterface {

	ResponseEntity<?> serviceFindAllCourses();

	ResponseEntity<?> serviceCourseById(int id);

	ResponseEntity<?> serviceSaveCourse(Course course);

	ResponseEntity<?> serviceDeleteCourseById(int id);

	ResponseEntity<?> serviceUpdateAdministrator(int id, Course administrator);

}
