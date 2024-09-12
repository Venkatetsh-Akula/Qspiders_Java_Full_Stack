package org.jsp.app.daointerface;

import java.util.Optional;

import org.jsp.app.entity.Users;

public interface LoginDaoInterface {

	Optional<Users> daoFindUser(String email, String password);

}
