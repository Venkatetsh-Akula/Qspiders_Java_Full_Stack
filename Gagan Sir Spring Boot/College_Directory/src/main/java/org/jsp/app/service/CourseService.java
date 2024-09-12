package org.jsp.app.service;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.CourseDaoInterface;
import org.jsp.app.entity.Course;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoCourseFoundException;
import org.jsp.app.serviceinterface.CourseServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements CourseServiceInterface {
	
	@Autowired
	private CourseDaoInterface coursedao;
	
	@Override
	public ResponseEntity<?> serviceFindAllCourses() {
		List<Course> courseli=coursedao.daoFindAllCourse();
		if(courseli.isEmpty()) {
			throw NoCourseFoundException.builder().message("No Course in List").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("List Course Found").body(courseli).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceCourseById(int id) {
		Optional<Course> course=coursedao.daoFindCourseById(id);
		if(course.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Course Found By given Id").body(course).build());
		}
		else {
			throw NoCourseFoundException.builder().message("No Course By given Id").build();
		}
	}

	@Override
	public ResponseEntity<?> serviceSaveCourse(Course course) {
		if(course==null) {
			throw InvalidData.builder().message("Course is invalid").build();
		}
		else {
			Course co=coursedao.daoSaveCourse(course);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Course Saved").body(co).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDeleteCourseById(int id) {
		Optional<Course> course=coursedao.daoFindCourseById(id);
		if(course.isEmpty()) {
			throw NoCourseFoundException.builder().message("No Course By given Id").build();
		}
		else {
			coursedao.daoCourseDeletedById(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Course Deleted SuccessFully").body(course).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceUpdateAdministrator(int id, Course course) {
		Optional<Course> co=coursedao.daoFindCourseById(id);
		if(co.isEmpty()) {
			throw NoCourseFoundException.builder().message("No Course found by given Id").build();
		}
		else {
			Course updatedCourse=coursedao.daoSaveCourse(course);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Course Updated SuccessFully").body(updatedCourse).build());
		}
	}

}
