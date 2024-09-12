package org.jsp.ums.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.jsp.ums.dao.UserDao;
import org.jsp.ums.entity.User;
import org.jsp.ums.exceptionclasses.InvalidUserId;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.jsp.ums.service.UserService;
import org.jsp.ums.util.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public ResponseEntity<?> saveUser(User user) {
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value())
				.message("User Created Successfully...").body(userDao.saveUser(user)).build());
	}

	@Override
	public ResponseEntity<?> findAllUsersById(int id) {
		Optional<User> optional = userDao.daofindUserById(id);
		if(optional.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.FOUND.value())
					.message("User Found").body(optional.get()).build());
		}
		else {
			throw InvalidUserId.builder().message("No valid input exist").build();
		}
	}

	@Override
	public ResponseEntity<?> findAllUsers() {
		List<User> users = userDao.findAllUsers();
		ArrayList<User> al = new ArrayList<>();
		for (User u : users)
			if (u.getStatus() == UserStatus.ACTIVE)
				al.add(u);
//		if(al.size()==0)
//			throw new NoUserFoundException();
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("All Active Users Found Successfully..").body(al).build());
	}

}
