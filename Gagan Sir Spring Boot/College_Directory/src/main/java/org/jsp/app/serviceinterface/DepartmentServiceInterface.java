package org.jsp.app.serviceinterface;

import org.jsp.app.entity.Department;
import org.springframework.http.ResponseEntity;

public interface DepartmentServiceInterface {

	ResponseEntity<?> serviceFindAllDepartments();

	ResponseEntity<?> serviceDepartmentById(int id);

	ResponseEntity<?> serviceSaveDepartment(Department department);

	ResponseEntity<?> serviceDeleteDepartmentById(int id);

	ResponseEntity<?> serviceUpdateDepartment(int id, Department department);

}
