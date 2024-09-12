package org.jsp.app.controller;

import org.jsp.app.entity.Administrator;
import org.jsp.app.entity.Course;
import org.jsp.app.entity.Department;
import org.jsp.app.entity.Enrollment;
import org.jsp.app.entity.Faculty;
import org.jsp.app.entity.LoginDetails;
import org.jsp.app.entity.Student;
import org.jsp.app.entity.Users;
import org.jsp.app.serviceinterface.AdministratorServiceInterface;
import org.jsp.app.serviceinterface.CourseServiceInterface;
import org.jsp.app.serviceinterface.DepartmentServiceInterface;
import org.jsp.app.serviceinterface.EnrollmentServiceInterface;
import org.jsp.app.serviceinterface.FacultyServiceInterface;
import org.jsp.app.serviceinterface.LoginServiceInterface;
import org.jsp.app.serviceinterface.StudentServiceInterface;
import org.jsp.app.serviceinterface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserInterface userservice;
	
	
	//users operation
	@GetMapping
	public ResponseEntity<?> findAllUsers(){
		return userservice.serviceFindAllUsers();
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> findUsersById(@PathVariable int id){
		return userservice.serviceUsersById(id);
	}
	@PostMapping
	public ResponseEntity<?> saveUsers(@RequestBody Users users){
		return userservice.serviceSaveUser(users);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUsersById(@PathVariable int id){
		return userservice.serviceDeleteById(id);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUsersById(@PathVariable int id,@RequestBody Users users){
		return userservice.serviceUpdateUser(id,users);
	}
	
	@Autowired
	private StudentServiceInterface studentservice;
	
	//Student operation
	@GetMapping("/student")
	public ResponseEntity<?> findAllStudents(){
		return studentservice.serviceFindAllStudents();
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<?> findStudentById(@PathVariable int id){
		return studentservice.serviceStudentById(id);
	}
	@PostMapping("/student")
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		return studentservice.serviceSaveStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<?> deleteStudentById(@PathVariable int id){
		return studentservice.serviceDeleteById(id);
	}
	@PutMapping("/student/{id}")
	public ResponseEntity<?> updateStudentById(@PathVariable int id,@RequestBody Student student){
		return studentservice.serviceUpdateStudent(id,student);
	}
	
	@Autowired
	private FacultyServiceInterface facultyservice;
	
	//Faculty operation
	
	@GetMapping("/faculty")
	public ResponseEntity<?> findAllFaculty(){
		return facultyservice.serviceFindAllFacultys();
	}
	@GetMapping("/faculty/{id}")
	public ResponseEntity<?> findFacultyById(@PathVariable int id){
		return facultyservice.serviceFacultyById(id);
	}
	@PostMapping("/faculty")
	public ResponseEntity<?> saveFaculty(@RequestBody Faculty faculty){
		return facultyservice.serviceSaveFaculty(faculty);
	}
	
	@DeleteMapping("/faculty/{id}")
	public ResponseEntity<?> deleteFacultyById(@PathVariable int id){
		return facultyservice.serviceDeleteById(id);
	}
	@PutMapping("/faculty/{id}")
	public ResponseEntity<?> updateFacultyById(@PathVariable int id,@RequestBody Faculty faculty){
		return facultyservice.serviceUpdateFaculty(id,faculty);
	}
	
	
	
	
	
	@Autowired
	private AdministratorServiceInterface administratorservice;
	//Administrator
	
	@GetMapping("/administrator")
	public ResponseEntity<?> findAllAdministrator(){
		return administratorservice.serviceFindAllAdministrators();
	}
	@GetMapping("/administrator/{id}")
	public ResponseEntity<?> findAdministratorById(@PathVariable int id){
		return administratorservice.serviceAdministratorById(id);
	}
	@PostMapping("/administrator")
	public ResponseEntity<?> saveAdministrator(@RequestBody Administrator administrator){
		return administratorservice.serviceSaveAdministrator(administrator);
	}
	
	@DeleteMapping("/administrator/{id}")
	public ResponseEntity<?> deleteAdministratorById(@PathVariable int id){
		return administratorservice.serviceDeleteById(id);
	}
	@PutMapping("/administrator/{id}")
	public ResponseEntity<?> updateAdministratorById(@PathVariable int id,@RequestBody Administrator administrator){
		return administratorservice.serviceUpdateAdministrator(id,administrator);
	}
	
	
	
	
	
	
	
	
	//Course
	@Autowired
	private CourseServiceInterface courseservice;
	@GetMapping("/course")
	public ResponseEntity<?> findAllCourse(){
		return courseservice.serviceFindAllCourses();
	}
	@GetMapping("/course/{id}")
	public ResponseEntity<?> findCourseById(@PathVariable int id){
		return courseservice.serviceCourseById(id);
	}
	@PostMapping("/course")
	public ResponseEntity<?> saveCourse(@RequestBody Course course){
		return courseservice.serviceSaveCourse(course);
	}
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<?> deleteCourseById(@PathVariable int id){
		return courseservice.serviceDeleteCourseById(id);
	}
	@PutMapping("/course/{id}")
	public ResponseEntity<?> updateCourseById(@PathVariable int id,@RequestBody Course administrator){
		return courseservice.serviceUpdateAdministrator(id,administrator);
	}
	
	
	
	
	//Enrollment
		@Autowired
		private EnrollmentServiceInterface enrollmentservice;
		@GetMapping("/enrollment")
		public ResponseEntity<?> findAllEnrollments(){
			return enrollmentservice.serviceFindAllEnrollments();
		}
		@GetMapping("/enrollment/{id}")
		public ResponseEntity<?> findEnrollmentById(@PathVariable int id){
			return enrollmentservice.serviceEnrollmentById(id);
		}
		@PostMapping("/enrollment")
		public ResponseEntity<?> saveEnrollment(@RequestBody Enrollment enrollment){
			return enrollmentservice.serviceSaveEnrollment(enrollment);
		}
		
		@DeleteMapping("/enrollment/{id}")
		public ResponseEntity<?> deleteEnrollmentById(@PathVariable int id){
			return enrollmentservice.serviceDeleteEnrollmentById(id);
		}
		@PutMapping("/enrollment/{id}")
		public ResponseEntity<?> updateEnrollmentById(@PathVariable int id,@RequestBody Enrollment enrollment){
			return enrollmentservice.serviceUpdateAdministrator(id,enrollment);
		}
	

		//Department
				@Autowired
				private DepartmentServiceInterface departmentservice;
				@GetMapping("/department")
				public ResponseEntity<?> findAllDepartment(){
					return departmentservice.serviceFindAllDepartments();
				}
				@GetMapping("/department/{id}")
				public ResponseEntity<?> findDepartmentById(@PathVariable int id){
					return departmentservice.serviceDepartmentById(id);
				}
				@PostMapping("/department")
				public ResponseEntity<?> saveDepartment(@RequestBody Department department){
					return departmentservice.serviceSaveDepartment(department);
				}
				
				@DeleteMapping("/department/{id}")
				public ResponseEntity<?> deleteDepartmentById(@PathVariable int id){
					return departmentservice.serviceDeleteDepartmentById(id);
				}
				@PutMapping("/department/{id}")
				public ResponseEntity<?> updateDepartmentById(@PathVariable int id,@RequestBody Department department){
					return departmentservice.serviceUpdateDepartment(id,department);
				}
				
				
				//login

				@Autowired
				private LoginServiceInterface loginservice;
				@PostMapping(value="/login")
				public ResponseEntity<?> loginMethod(@RequestBody LoginDetails login){
					return loginservice.userAuthentication(login);
				}

			
}



