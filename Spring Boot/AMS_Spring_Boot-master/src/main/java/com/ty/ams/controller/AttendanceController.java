package com.ty.ams.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.ams.entity.Attendance;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.serviceimp.AttendanceServiceImp;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	AttendanceServiceImp service;
	
	@Operation(description = "Attendance Object Will be Saved...", summary = "To Save Attendance object to the Database...")
	@ApiResponses(value = { @ApiResponse(description = "Attendance Saved Successfully", responseCode = "201"),
			@ApiResponse(description = "Unable To Save Attendance To Database", responseCode = "409") })
	@PostMapping("/{timesheetId}")
	public ResponseEntity<ResponseStructure<Attendance>> saveAttendance(@RequestBody Attendance attendance, @PathVariable int timesheetId) {
		return service.saveAttendance(attendance, timesheetId);
	}
	
	@Operation(description = "To find the attendance based on the Id", summary = "To find the Attendance Object from the data base")
	@ApiResponses(value = {@ApiResponse(description = "Attendance Updated Successfully", responseCode = "302"),
			@ApiResponse(description = "Unable to find the Attendance", responseCode = "302")})
	@GetMapping("/{attendanceId}")
	public ResponseEntity<ResponseStructure<Attendance>> findAttendanceById(@PathVariable int attendanceId) {
		return service.findAttandanceById(attendanceId);
	}
	
	@Operation(description = "To update the Attendance Object", summary = "To find the Attendance Object from the data base and to update")
	@ApiResponses(value = {@ApiResponse(description = "Attendance found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable to Update", responseCode = "204")})
	@PutMapping
	public ResponseEntity<ResponseStructure<Attendance>> updateAttendance(@RequestBody Attendance attendance){
		return service.updateAttandance(attendance) ;
	}
	
	@Operation(description = "To Delete the Attendance Object", summary = "To find the Attendance Object from the data base and to delete")
	@ApiResponses(value = {@ApiResponse(description = "Attendance deleted Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable to deleted", responseCode = "204")})
	@DeleteMapping("/{attendanceId}")
	public ResponseEntity<ResponseStructure<Attendance>> deleteAttendance(@PathVariable int attendanceId) {
		return service.deleteAttandance(attendanceId);
	}
	
	@Operation(description = "To find the attendance based on the status", summary = "To find the attendance based on the status and to return in the form of list")
	@ApiResponses(value = {@ApiResponse(description = "Attendances Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable Find Attendance", responseCode = "204")})
	@GetMapping("/status/{attendanceStatus}")
	public ResponseEntity<ResponseStructure<List<Attendance>>> findAllAttendanceByStatus(@PathVariable String attendanceStatus){
		return service.findAllAttendanceByAttendanceStatus(attendanceStatus) ;
	}
	
	@Operation(description = "To find the attendance based on the Date", summary = "To find the attendance based on the Date and to return in the form of list")
	@ApiResponses(value = {@ApiResponse(description = "Attendances Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable Find Attendance", responseCode = "204")})
	@GetMapping("/date/{date}")
	public ResponseEntity<ResponseStructure<List<Attendance>>> findAllAttendanceByDate(@PathVariable LocalDate date){
		return service.findAllAttendenceByDate(date) ;
	}
	
	@Operation(description = "To find the attendance based on the status and Date", summary = "To find the attendance based on the Status and Date and to return in the form of list")
	@ApiResponses(value = {@ApiResponse(description = "Attendances Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable Find Attendance", responseCode = "204")})
	@GetMapping("/status/{attendanceStatus}/{date}")
	public ResponseEntity<ResponseStructure<List<Attendance>>> findAllAttendanceByStatusAndDate(@PathVariable String attendanceStatus, @PathVariable LocalDate date){
		return service.findAllAttendanceByAttendanceStatusAndDate(attendanceStatus, date) ;
	}
	
}
