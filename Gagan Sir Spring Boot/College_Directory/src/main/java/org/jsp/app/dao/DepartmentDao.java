package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.DepartmentDaoInterface;
import org.jsp.app.entity.Department;
import org.jsp.app.rapo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao implements DepartmentDaoInterface{

	@Autowired
	private DepartmentRepository departmentrepository;
	
	@Override
	public List<Department> daofindAllDepartments() {
		return departmentrepository.findAll();
	}

	@Override
	public Optional<Department> daoFindByDepartmentId(int id) {
		return departmentrepository.findById(id);
	}

	@Override
	public Department daoSaveDepartment(Department department) {
		return departmentrepository.save(department);
	}

	@Override
	public void daoDeleteDepartmentById(int id) {
		departmentrepository.deleteById(id);
	}

}
