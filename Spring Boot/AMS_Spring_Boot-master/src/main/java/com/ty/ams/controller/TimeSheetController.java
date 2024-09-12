package com.ty.ams.controller;

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
import com.ty.ams.entity.TimeSheet;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.service.TimeSheetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("timesheet")
public class TimeSheetController {

	@Autowired
	TimeSheetService timeSheetService;

	@Operation(description = "timesheet Object Will be Saved...", summary = "To Save timesheet Object to Database...")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Saved Successfully", responseCode = "201"),
			@ApiResponse(description = "Unable To Save timesheet To Database", responseCode = "409") })
	@PostMapping("/{userId}")
	public ResponseEntity<ResponseStructure<TimeSheet>> saveTimeSheet(@RequestBody TimeSheet timeSheet,
			@PathVariable int userId) {
		return timeSheetService.saveTimeSheet(timeSheet, userId);
	}

	@Operation(description = "timesheet Object Will be Updated...", summary = "To Update timesheet Object...")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Updated Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Updated timesheet To Database", responseCode = "409") })
	@PutMapping
	public ResponseEntity<ResponseStructure<TimeSheet>> updateTimeSheet(@RequestBody TimeSheet timeSheet) {
		return timeSheetService.updateTimeSheet(timeSheet);
	}

	@Operation(description = "timesheet Object Will be deleted...", summary = "To delete timesheet Object...")
	@ApiResponses(value = {
			@ApiResponse(description = "timesheet delete Successfully", responseCode = "204 "),
			@ApiResponse(description = "Unable To Updated timesheet To Database", responseCode = "404") })
	@DeleteMapping("/{id}/{userId}")
	public ResponseEntity<ResponseStructure<String>> deleteTimeSheet(@PathVariable int id, @PathVariable int userId) {
		return timeSheetService.deleteTimeSheetById(id, userId);
	}

	@Operation(description = "Fetching / Find timesheet by timesheetId", summary = "To Find timesheet Object By timesheetId...")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided timesheetId...", responseCode = "404") })
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<TimeSheet>> findTimeSheetById(@PathVariable int id) {
		return timeSheetService.findTimeSheetById(id);
	}

	@Operation(description = "Fetch all time sheets in data base", summary = "fetching all time timesheets from database")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheets", responseCode = "404") })
	@GetMapping
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheets() {
		return timeSheetService.findAllTimeSheetsOfAllUsers();
	}

	@Operation(description = "Fetching / Find all  timesheet by userId", summary = "fetch all timesheets of one user by using userId")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided userId...", responseCode = "404") })
	@GetMapping("byUserId/{userId}")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetOfUser(@PathVariable int userId) {
		return timeSheetService.findAllTimeSheetOfUser(userId);
	}

	@Operation(description = "Fetching / Find all  timesheets of user by year", summary = "fetch all timesheets of one user of a particular year")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("{year}/{userId}")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetOfAYearOfUser(@PathVariable int year,
			@PathVariable int userId) {
		return timeSheetService.findAllTimeSheetOfAYearOfUser(year, userId);
	}

	@Operation(description = "Fetching / Find timesheet of user by month and year", summary = "fetch  timesheet of one user of a particular month in a year")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("{month}/{year}/{userId}")
	ResponseEntity<ResponseStructure<TimeSheet>> findTimeSheetByMonthNameOfUser(@PathVariable String month,
			@PathVariable int year, @PathVariable int userId) {
		return timeSheetService.findTimeSheetByMonthNameOfUser(month, year, userId);
	}

	// from here

	@Operation(description = "Fetching / Find all  timesheets of user in between two years", summary = "it will return list of timesheets between two years of a user ")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("byYear/{startYear}/{endYear}/{userId}")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetBetweenYearsOfUser(
			@PathVariable int startYear, @PathVariable int endYear, @PathVariable int userId) {
		return timeSheetService.findAllTimeSheetBetweenYearsOfUser(startYear, endYear, userId);
	}

	@Operation(description = "Fetching / Find all  timesheets of user in between two months", summary = "it will return list of timesheets between two user specified months of a user ")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("byMonth/{startMonth}/{endMonth}/{year}/{userId}")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetBetweenMonthsOfUser(
			@PathVariable String startMonth, @PathVariable String endMonth, @PathVariable int year,
			@PathVariable int userId) {
		return timeSheetService.findAllTimeSheetBetweenMonthsOfUser(startMonth, endMonth, year, userId);
	}

	@Operation(description = "Fetching / Find all  timesheets of user in between two years", summary = "Retrieve time sheets of a specific user for a custom date range.")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("{startMonth}/{start_year}/{endMonth}/{end_year}/{userId}")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetOfUserOnCustomDates(String startMonth,
			int start_year, String endMonth, int end_year, int user_id) {
		return timeSheetService.findTimeSheetOfUserOnCustomDates(startMonth, start_year, endMonth, end_year, user_id);
	}

	@Operation(description = "Retrieve time sheets within a custom date range", summary = "Get time sheets for a specified date range")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("{startMonth}/{start_year}/{endMonth}/{end_year}")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetOnCustomDates(String startMonth,
			int start_year, String endMonth, int end_year) {
		return timeSheetService.findTimeSheetOfUserOnCustomDates(startMonth, start_year, endMonth, end_year, end_year);
	}

	@Operation(description = "Retrieve time sheets for the current month", summary = " Get time sheets for the currently ongoing month")
	@ApiResponses(value = { @ApiResponse(description = "timesheet Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find timesheet for Provided user...", responseCode = "404") })
	@GetMapping("current")
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> fetchCurrentMonthTimeSheet() {
		return timeSheetService.fetchCurrentMonthTimeSheet();
	}
}
