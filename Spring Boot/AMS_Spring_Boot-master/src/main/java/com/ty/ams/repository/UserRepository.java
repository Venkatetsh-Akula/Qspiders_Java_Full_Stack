package com.ty.ams.repository;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.ams.entity.User;
import com.ty.ams.util.UserRole;
import com.ty.ams.util.UserStatus;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmpId(String empId);

	List<User> findByUserRole(UserRole role);

	List<User> findByUserCategory(Category category);

	Optional<User> findByPhone(long phone);

	Optional<User> findByEmail(String email);

	List<User> findByUserStatus(UserStatus status);

	Optional<User> findByEmailAndPassword(String email, String password);

	Optional<User> findByPhoneAndPassword(long phone, String password);

//	@Query("select u from User u where u.userStatus = 1?")
//	Optional<List<User>> findAllActiveUsers();

}
