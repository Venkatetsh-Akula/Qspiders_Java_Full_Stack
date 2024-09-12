package org.jsp.springboot;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	 public List<Course> retriveAllCourses(){
		 return Arrays.asList(
				 new Course(1,"AWS","youtube"),
				 new Course(2,"Java","Qspiders")
				 );
	 }
}
