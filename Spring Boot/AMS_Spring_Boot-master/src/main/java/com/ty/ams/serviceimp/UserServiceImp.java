package com.ty.ams.serviceimp;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.ams.daoimp.UserDaoImp;
import com.ty.ams.entity.Batch;
import com.ty.ams.entity.User;
import com.ty.ams.exceptionclasses.user.DuplicateEmailException;
import com.ty.ams.exceptionclasses.user.DuplicatePhoneNumberException;
import com.ty.ams.exceptionclasses.user.EmployeeIDNotFoundException;
import com.ty.ams.exceptionclasses.user.IdNotFoundException;
import com.ty.ams.exceptionclasses.user.InvalidEmailOrPasswordException;
import com.ty.ams.exceptionclasses.user.InvalidEmailException;
import com.ty.ams.exceptionclasses.user.InvalidPhoneNumberException;
import com.ty.ams.exceptionclasses.user.InvalidPhoneNumberOrPasswordException;
import com.ty.ams.exceptionclasses.user.NoBatchAssignedException;
import com.ty.ams.exceptionclasses.user.NoUserFoundException;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.service.UserService;
import com.ty.ams.util.UserRole;
import com.ty.ams.util.UserStatus;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDaoImp userDaoImp;

	@Override
	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
//		if (user == null)
//			throw new NullPointerException("User Object Is Null no data Found in Request Body...");
		if (!Pattern.compile("[6-9]{1}[0-9]{9}").matcher("" + user.getPhone()).matches())
			throw new InvalidPhoneNumberException();
		if (userDaoImp.findUserByPhoneNumber(user.getPhone()).isPresent())
			throw new DuplicatePhoneNumberException();
		if (userDaoImp.findUserByEmail(user.getEmail()).isPresent())
			throw new DuplicateEmailException();
		
		user.setPassword(user.getEmail().substring(0, 4) + (user.getPhone() + "").substring(6, 10));
		user = userDaoImp.saveUser(user);
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("User Saved Successfully...");
		structure.setBody(user);
		return new ResponseEntity<>(structure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> updateUser(User user) {
		if (user == null)
			throw new NullPointerException("User Object Is Null no data Found in Request Body...");
		user.setPassword(user.getPassword().substring(0, 4) + (user.getPhone() + "").substring(6, 10));
		user = userDaoImp.updateUser(user);
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Updated Successfully...");
		structure.setBody(user);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> findUserById(int userId) {
		Optional<User> optional = userDaoImp.findUserById(userId);
		if (optional.isEmpty())
			throw new IdNotFoundException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Found Successfully...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> findUserByEmpId(String empId) {
		Optional<User> optional = userDaoImp.findUserByEmpId(empId);
		if (optional.isEmpty())
			throw new EmployeeIDNotFoundException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Found Successfully...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<User>> verifyUserByCredentials(String username,String password){
		if(Pattern.compile("[6-9]{1}[0-9]{9}").matcher(username).matches())
			return findUserByPhoneAndPassword(Long.parseLong(username), password);
		return findUserByEmailAndPassword(username, password);
	}
	
	
	
	@Override
	public ResponseEntity<ResponseStructure<User>> findUserByEmailAndPassword(String email, String password) {
		Optional<User> optional = userDaoImp.findUserByEmailAndPassword(email, password);
		if (optional.isEmpty())
			throw new InvalidEmailOrPasswordException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Verified Successfully...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> deleteUserByUserId(int id) {
		Optional<User> optional = userDaoImp.findUserById(id);
		if (optional.isEmpty())
			throw new IdNotFoundException();
		userDaoImp.deleteUserById(id);
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Deleted Successfully...");
		structure.setBody("User Deleted Successfully...");
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> findUserByPhoneNumber(long phone) {
		Optional<User> optional = userDaoImp.findUserByPhoneNumber(phone);
		if (optional.isEmpty())
			throw new InvalidPhoneNumberException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User found Successfully...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> findUserByEmail(String email) {
		Optional<User> optional = userDaoImp.findUserByEmail(email);
		if (optional.isEmpty())
			throw new InvalidEmailException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User found Successfully...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<User>>> findAllUsers() {
		List<User> users = userDaoImp.findAllUsers();
		if (users.isEmpty())
			throw new NoUserFoundException();
		ResponseStructure<List<User>> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User found Successfully...");
		structure.setBody(users);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<User>>> findUserByRole(UserRole role) {
		List<User> users = userDaoImp.findUserByRole(role);
		if (users.isEmpty())
			throw new NoUserFoundException();
		ResponseStructure<List<User>> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User found Successfully...");
		structure.setBody(users);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<User>>> findUserByCategory(Category category) {
		List<User> users = userDaoImp.findUserByCategory(category);
		if (users.isEmpty())
			throw new NoUserFoundException();
		ResponseStructure<List<User>> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User found Successfully...");
		structure.setBody(users);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<User>>> findUserByStatus(UserStatus status) {
		List<User> users = userDaoImp.findUserByStatus(status);
		if (users.isEmpty())
			throw new NoUserFoundException();
		ResponseStructure<List<User>> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User found Successfully...");
		structure.setBody(users);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<LocalTime>>> findBatchTimingsOfUser(int userId) {
		Optional<User> optional = userDaoImp.findUserById(userId);
		if (optional.isEmpty())
			throw new IdNotFoundException();
		User user = optional.get();
		List<Batch> batchs = user.getBatchs();
		if (batchs.isEmpty())
			throw new NoBatchAssignedException();
		List<LocalTime> batchTimings = new ArrayList<>();
		System.out.println(batchs.stream().filter(batch -> (batch.getLoginTime()) != null)
				.map(batch -> batchTimings.add(batch.getLoginTime())).collect(Collectors.toList()));
		if (batchTimings.isEmpty())
			throw new NoBatchAssignedException();
		ResponseStructure<List<LocalTime>> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("Batch Timings of User Found Successfully...");
		structure.setBody(batchTimings);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> findUserByPhoneAndPassword(long phone, String password) {
		Optional<User> optional = userDaoImp.findUserByPhoneAndPassword(phone, password);
		if (optional.isEmpty())
			throw new InvalidPhoneNumberOrPasswordException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Verified Successfully...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> setUserStatusToInAcativeByUserId(int userId) {
		Optional<User> optional = userDaoImp.findUserById(userId);
		if (optional.isEmpty())
			throw new IdNotFoundException();
		User user = optional.get();
//		if (user.getUserStatus() == UserStatus.valueOf("ACTIVE"))
		user.setUserStatus(UserStatus.valueOf("IN_ACTIVE"));
//		else
//			user.setUserStatus(UserStatus.valueOf("ACTIVE"));
		user = userDaoImp.updateUser(user);
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("User Status Set to IN_ACTIVE Done  Successfully...");
		structure.setBody(user);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}
}
