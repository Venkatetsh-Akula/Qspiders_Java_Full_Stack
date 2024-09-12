package org.jsp.ums.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.ums.entity.User;

public interface UserDao {

	User saveUser(User user);

	Optional<User> daofindUserById(int id);

	List<User> findAllUsers();

}
