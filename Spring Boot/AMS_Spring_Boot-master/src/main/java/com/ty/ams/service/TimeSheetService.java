package com.ty.ams.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.ty.ams.entity.TimeSheet;
import com.ty.ams.responsestructure.ResponseStructure;

public interface TimeSheetService {
	public ResponseEntity<ResponseStructure<TimeSheet>> saveTimeSheet(TimeSheet timeSheet, int userId);

	public ResponseEntity<ResponseStructure<TimeSheet>> updateTimeSheet(TimeSheet timeSheet);

	public ResponseEntity<ResponseStructure<TimeSheet>> findTimeSheetById(int id);

	public ResponseEntity<ResponseStructure<String>> deleteTimeSheetById(int id, int userId);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetsOfAllUsers();

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetOfUser(int userId);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetOfAYearOfUser(int year, int userId);

	public ResponseEntity<ResponseStructure<TimeSheet>> findTimeSheetByMonthNameOfUser(String month, int year,
			int userId);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetBetweenYearsOfUser(int startYear,
			int endYear, int userId);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetBetweenMonthsOfUser(String startMonth,
			String endMonth, int year, int userId);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetByMonthNameOfAllEmployees(String month,
			int year);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetOfUserOnCustomDates(String startMonth,
			int start_year, String endMonth, int end_year, int user_id);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetOnCustomDates(String startMonth,
			int start_year, String endMonth, int end_year);

	public ResponseEntity<ResponseStructure<List<TimeSheet>>> fetchCurrentMonthTimeSheet();
}
