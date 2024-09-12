package org.jsp.app.daointerface;

import java.util.List;
import java.util.Optional;

import org.jsp.app.entity.Administrator;

public interface AdministratorDaoInterface {

	List<Administrator> daoFindAllAdministrator();

	Optional<Administrator> daoFindAdministratorById(int id);

	Administrator daoSaveAdministrator(Administrator administrator);

	void daoDeleteAdministratorById(int id);

}
