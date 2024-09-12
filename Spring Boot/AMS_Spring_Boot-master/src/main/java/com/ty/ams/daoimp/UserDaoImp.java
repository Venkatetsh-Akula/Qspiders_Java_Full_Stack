package com.ty.ams.daoimp;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.ams.dao.UserDao;
import com.ty.ams.entity.User;
import com.ty.ams.repository.UserRepository;
import com.ty.ams.util.UserRole;
import com.ty.ams.util.UserStatus;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private UserRepository userRepository;


	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public Optional<User> findUserById(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public Optional<User> findUserByEmpId(String empId) {
		return userRepository.findByEmpId(empId);
	}

	@Override
	public List<User> findUserByRole(UserRole role) {
		return userRepository.findByUserRole(role);
	}

	@Override
	public List<User> findUserByCategory(Category category) {
		return userRepository.findByUserCategory(category);
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserByPhoneNumber(long phone) {
		return userRepository.findByPhone(phone);
	}

	@Override
	public Optional<User> findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public List<User> findUserByStatus(UserStatus status) {
		return userRepository.findByUserStatus(status);
	}

	@Override
	public Optional<User> findUserByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}


	@Override
	public Optional<User> findUserByPhoneAndPassword(long phone, String password) {
		return userRepository.findByPhoneAndPassword(phone, password);
	}

}
