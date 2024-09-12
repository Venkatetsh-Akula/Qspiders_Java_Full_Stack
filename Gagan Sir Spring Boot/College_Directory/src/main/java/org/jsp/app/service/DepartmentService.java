package org.jsp.app.service;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.DepartmentDaoInterface;
import org.jsp.app.entity.Department;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoDepartmentFoundException;
import org.jsp.app.serviceinterface.DepartmentServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements DepartmentServiceInterface {
	
	@Autowired
	private DepartmentDaoInterface departmentdao;
	
	@Override
	public ResponseEntity<?> serviceFindAllDepartments() {
		List<Department> departmentli=departmentdao.daofindAllDepartments();
		if(departmentli.size()==0) {
			throw NoDepartmentFoundException.builder().message("No Department found").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("List Of Department Found").body(departmentli).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDepartmentById(int id) {
		Optional<Department> department=departmentdao.daoFindByDepartmentId(id);
		if(department.isEmpty()) {
			throw NoDepartmentFoundException.builder().message("No Department found By given id").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Department Found By given Id").body(department).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceSaveDepartment(Department department) {
		if(department==null) {
			throw InvalidData.builder().message("In sufficuent data").build();
		}
		else {
			Department dept=departmentdao.daoSaveDepartment(department);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Department saved").body(dept).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDeleteDepartmentById(int id) {
		Optional<Department> department=departmentdao.daoFindByDepartmentId(id);
		if(department.isEmpty()) {
			throw NoDepartmentFoundException.builder().message("No Department found By given id").build();
		}
		else {
			departmentdao.daoDeleteDepartmentById(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Department Deleted By given Id").body(department).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceUpdateDepartment(int id, Department department) {
		Optional<Department> dept=departmentdao.daoFindByDepartmentId(id);
		if(dept.isEmpty()) {
			throw NoDepartmentFoundException.builder().message("No Department found By given id").build();
		}
		else {
			Department updatedDepartment=departmentdao.daoSaveDepartment(department);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Department Updated By given Id").body(updatedDepartment).build());
		}
	}

}
