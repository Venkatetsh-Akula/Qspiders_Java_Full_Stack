package org.jsp.app.daointerface;

import java.util.List;
import java.util.Optional;

import org.jsp.app.entity.Department;

public interface DepartmentDaoInterface {

	List<Department> daofindAllDepartments();

	Optional<Department> daoFindByDepartmentId(int id);

	Department daoSaveDepartment(Department department);

	void daoDeleteDepartmentById(int id);

}
