package com.ty.ams.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.http.ResponseEntity;

import com.ty.ams.entity.User;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.util.UserRole;
import com.ty.ams.util.UserStatus;

public interface UserService {

	ResponseEntity<ResponseStructure<User>> saveUser(User user);

	ResponseEntity<ResponseStructure<User>> updateUser(User user);

	ResponseEntity<ResponseStructure<User>> findUserById(int userId);

	ResponseEntity<ResponseStructure<User>> findUserByEmpId(String empId);

	ResponseEntity<ResponseStructure<User>> findUserByEmailAndPassword(String email, String password);

	ResponseEntity<ResponseStructure<String>> deleteUserByUserId(int id);

	ResponseEntity<ResponseStructure<User>> findUserByPhoneNumber(long phone);

	ResponseEntity<ResponseStructure<User>> findUserByEmail(String email);

	ResponseEntity<ResponseStructure<List<User>>> findAllUsers();

	ResponseEntity<ResponseStructure<List<User>>> findUserByRole(UserRole role);

	ResponseEntity<ResponseStructure<List<User>>> findUserByCategory(Category category);

	ResponseEntity<ResponseStructure<List<User>>> findUserByStatus(UserStatus status);

	ResponseEntity<ResponseStructure<List<LocalTime>>> findBatchTimingsOfUser(int userId);

	ResponseEntity<ResponseStructure<User>> findUserByPhoneAndPassword(long phone, String password);

	ResponseEntity<ResponseStructure<User>> setUserStatusToInAcativeByUserId(int userId);

}
