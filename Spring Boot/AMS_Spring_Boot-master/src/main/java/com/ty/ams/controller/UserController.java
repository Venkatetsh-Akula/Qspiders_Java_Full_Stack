package com.ty.ams.controller;

import java.time.LocalTime;
import java.util.List;
import java.util.Locale.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ty.ams.entity.User;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.serviceimp.UserServiceImp;
import com.ty.ams.util.UserRole;
import com.ty.ams.util.UserStatus;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserServiceImp userServiceImp;

	@Operation(description = "User Object Will be Saved...", summary = "To Save User Object to Database...")
	@ApiResponses(value = { @ApiResponse(description = "User Saved Successfully", responseCode = "201"),
			@ApiResponse(description = "Unable To Save User To Database", responseCode = "409") })
	@PostMapping
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return userServiceImp.saveUser(user);
	}

	@Operation(description = "User Object Will be Updated...", summary = "To Update User Object...")
	@ApiResponses(value = { @ApiResponse(description = "User Updated Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Updated User To Database", responseCode = "409") })
	@PutMapping
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user) {
		return userServiceImp.updateUser(user);
	}

	@Operation(description = "Fetching / Find User by userId", summary = "To Find User Object By userID...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided userId...", responseCode = "404") })
	@GetMapping("/{userId}")
	public ResponseEntity<ResponseStructure<User>> findUserById(@PathVariable int userId) {
		return userServiceImp.findUserById(userId);
	}

	@Operation(description = "Fetching / Find User by empId", summary = "To Find User Object By empId...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided empId...", responseCode = "404") })
	@GetMapping("/empid/{empId}")
	public ResponseEntity<ResponseStructure<User>> findUserByEmpId(String empId) {
		return userServiceImp.findUserByEmpId(empId);
	}

	@Operation(description = "User Login validation / Verification, By Username or Password, username will be either Phone Number or Email and password", summary = "User Verification By Credentials ie.. Username and Password username can be Email or Phone Number")
	@ApiResponses(value = { @ApiResponse(description = "User Verification Successfull...", responseCode = "200"),
			@ApiResponse(description = "User Verification Failed, Invalid Credentials", responseCode = "404") })
	@PostMapping("/verify")
	public ResponseEntity<ResponseStructure<User>> veryfyUserByCredentials(@RequestParam String username,
			@RequestParam String password) {
		return userServiceImp.verifyUserByCredentials(username, password);
	}

	@Operation(description = "Deleting User by userId", summary = "To Delete User Object By userId...")
	@ApiResponses(value = { @ApiResponse(description = "User Deleted Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Delete User for Provided userId...", responseCode = "404") })
	@DeleteMapping("/{userId}")
	public ResponseEntity<ResponseStructure<String>> deleteUserByUserId(@PathVariable int userId) {
		return userServiceImp.deleteUserByUserId(userId);
	}

	@Operation(description = "Fetching / Find User by phone number", summary = "To Find User Object By phone number...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided Phone Number...", responseCode = "404") })
	@GetMapping("/phone/{phone}")
	public ResponseEntity<ResponseStructure<User>> findUserByPhoneNumber(@PathVariable long phone) {
		return userServiceImp.findUserByPhoneNumber(phone);
	}

	@Operation(description = "Fetching / Find User by email", summary = "To Find User Object By email...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided email...", responseCode = "404") })
	@GetMapping("/email/{email}")
	public ResponseEntity<ResponseStructure<User>> findUserByEmail(@PathVariable String email) {
		return userServiceImp.findUserByEmail(email);
	}

	@Operation(description = "Fetch / Find All Users in the Database...", summary = "To Fetch All The Users From The Database")
	@ApiResponses(value = { @ApiResponse(description = "All Users Found Successfully...", responseCode = "200"),
			@ApiResponse(description = "No Users Found in Database...", responseCode = "200"),
			@ApiResponse(description = "Unable to find All Users...", responseCode = "404") })
	@GetMapping("/all")
	public ResponseEntity<ResponseStructure<List<User>>> findAllUsers() {
		return userServiceImp.findAllUsers();
	}

	@Operation(description = "Fetching / Find User by UserRole", summary = "To Find User Object By UserRole...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided UserRole...", responseCode = "404") })
	@GetMapping("/role/{role}")
	public ResponseEntity<ResponseStructure<List<User>>> findUserByRole(@PathVariable UserRole role) {
		return userServiceImp.findUserByRole(role);
	}

	@Operation(description = "Fetching / Find User by UserCategory", summary = "To Find User Object By UserCategory...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided UserCategory...", responseCode = "404") })
	@GetMapping("/category/{category}")
	public ResponseEntity<ResponseStructure<List<User>>> findUserByCategory(@PathVariable Category category) {
		return userServiceImp.findUserByCategory(category);
	}

	@Operation(description = "Fetching / Find User by UserStatus", summary = "To Find User Object By UserStatus...")
	@ApiResponses(value = { @ApiResponse(description = "User Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find User for Provided UserStatus...", responseCode = "404") })
	@GetMapping("/status/{status}")
	public ResponseEntity<ResponseStructure<List<User>>> findUserByStatus(@PathVariable UserStatus status) {
		return userServiceImp.findUserByStatus(status);
	}

	@Operation(description = "Get Batch Timings Of A User by userId", summary = "Fetch / Find Batch Timings Of A User by userId")
	@ApiResponses(value = { @ApiResponse(description = "Batch Timings Fetched Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable to fetch the Batch Timings of user", responseCode = "404") })
	@GetMapping("/timings/{userId}")
	public ResponseEntity<ResponseStructure<List<LocalTime>>> findBatchTimingsOfUser(@PathVariable int userId) {
		return userServiceImp.findBatchTimingsOfUser(userId);
	}

	@Operation(description = "UserStatus Will Updaed to IN_ACTIVE", summary = "UserStatus Will Updaed to IN_ACTIVE")
	@ApiResponses(value = {
			@ApiResponse(description = "User Status Updated Successfully to IN_ACTIVE", responseCode = "200"),
			@ApiResponse(description = "Can't Update UserStatus To IN_ACTIVE", responseCode = "404") })
	@PatchMapping("/{userId}")
	public ResponseEntity<ResponseStructure<User>> setUserStatusToInAcativeByUserId(@PathVariable int userId) {
		return userServiceImp.setUserStatusToInAcativeByUserId(userId);

	}

}
