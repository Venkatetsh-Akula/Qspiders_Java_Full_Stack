package org.jsp.app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.app.daointerface.AdministratorDaoInterface;
import org.jsp.app.entity.Administrator;
import org.jsp.app.rapo.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdministratorDao implements AdministratorDaoInterface {
	
	@Autowired
	private AdministratorRepository administratorrepository;
	
	@Override
	public List<Administrator> daoFindAllAdministrator() {
		return administratorrepository.findAll();
	}

	@Override
	public Optional<Administrator> daoFindAdministratorById(int id) {
		return administratorrepository.findById(id);
	}

	@Override
	public Administrator daoSaveAdministrator(Administrator administrator) {
		return administratorrepository.save(administrator);
	}

	@Override
	public void daoDeleteAdministratorById(int id) {
		administratorrepository.deleteById(id);
		
	}
	

}
