package com.ty.ams.serviceimp;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ty.ams.dao.TimeSheetDao;
import com.ty.ams.dao.UserDao;
import com.ty.ams.entity.TimeSheet;
import com.ty.ams.entity.User;
import com.ty.ams.exceptionclasses.timesheet.TimeSheetAlreadyExists;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.service.TimeSheetService;

@Service
public class TimeSheetServiceImp implements TimeSheetService {

	@Autowired
	TimeSheetDao timeSheetDao;

	@Autowired
	UserDao userDao;

	@Override
	public ResponseEntity<ResponseStructure<TimeSheet>> saveTimeSheet(TimeSheet timeSheet, int userId) {
		Optional<User> optionalUser = userDao.findUserById(userId);
		ResponseStructure<TimeSheet> responseStructure = new ResponseStructure<>();
		if (optionalUser.isPresent()) {
//			LocalDate currentDate = LocalDate.now();
			List<TimeSheet> listOfTimeSheets = optionalUser.get().getTimeSheets();
			if (listOfTimeSheets != null) {
				Optional<TimeSheet> timesheet = listOfTimeSheets.stream().filter(
						sheet -> (sheet.getStart_date().getMonthValue() == timeSheet.getStart_date().getMonthValue()
								&& sheet.getStart_date().getYear() == timeSheet.getStart_date().getYear()))
						.findAny();
				if (timesheet.isPresent()) {
					throw new TimeSheetAlreadyExists();
				} else {
					User user = optionalUser.get();
					int month = timeSheet.getStart_date().getMonthValue();
					int year = timeSheet.getStart_date().getYear();
					if (month == 12) {
						month = 1;
						year += 1;
						timeSheet.setEnd_date(LocalDate.parse(year + "-0" + month + "-" + 25));
					} else if (month >= 1 && month <= 9) {
						month += 1;
						timeSheet.setEnd_date(LocalDate.parse(year + "-0" + month + "-" + 25));
					} else {
						month += 1;
						timeSheet.setEnd_date(LocalDate.parse(year + "-" + month + "-" + 25));
					}
					timeSheetDao.saveTimeSheet(timeSheet);
					user.getTimeSheets().add(timeSheet);
					userDao.saveUser(user);
					responseStructure.setBody(timeSheet);
					responseStructure.setMessage("time sheet created successfully");
					responseStructure.setStatusCode(HttpStatus.CREATED.value());
					return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
				}
			} else {
				User user = optionalUser.get();
				timeSheetDao.saveTimeSheet(timeSheet);
				user.getTimeSheets().add(timeSheet);
				userDao.saveUser(user);
				responseStructure.setBody(timeSheet);
				responseStructure.setMessage("time sheet created successfully");
				responseStructure.setStatusCode(HttpStatus.CREATED.value());
				return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
			}
		} else {
			responseStructure.setBody(timeSheet);
			responseStructure.setMessage("time sheet was not created ");
			responseStructure.setStatusCode(HttpStatus.CONFLICT.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.CONFLICT);
		}

	}

	@Override
	public ResponseEntity<ResponseStructure<TimeSheet>> updateTimeSheet(TimeSheet timeSheet) {
		ResponseStructure<TimeSheet> responseStructure = new ResponseStructure<>();
		Optional<TimeSheet> optional = timeSheetDao.findBytimesheet_id(timeSheet.getTimesheetId());
		if (optional.isPresent()) {
			timeSheetDao.updateTimeSheet(optional.get());
			responseStructure.setBody(optional.get());
			responseStructure.setMessage("time sheet updated successfully ");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<TimeSheet>>(responseStructure, HttpStatus.OK);
		} else {
			responseStructure.setMessage("time sheet not found");
			responseStructure.setBody(null);
			responseStructure.setStatusCode(HttpStatus.CONFLICT.value());
			return new ResponseEntity<ResponseStructure<TimeSheet>>(responseStructure, HttpStatus.CONFLICT);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<TimeSheet>> findTimeSheetById(int id) {
		ResponseStructure<TimeSheet> responseStructure = new ResponseStructure<>();
		Optional<TimeSheet> sheet = timeSheetDao.findTimeSheetById(id);
		if (sheet.isPresent()) {
			responseStructure.setMessage("time sheet fetched successfully ");
			responseStructure.setBody(sheet.get());
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<TimeSheet>>(responseStructure, HttpStatus.OK);
		} else {
			responseStructure.setMessage("time sheet not found");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructure.setBody(null);
			return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> deleteTimeSheetById(int id, int userId) {
		ResponseStructure<String> responseStructure = new ResponseStructure<>();
		try {
			User user = userDao.findUserById(userId).get();
			user.getTimeSheets().remove(timeSheetDao.findTimeSheetById(id).get());
			userDao.updateUser(user);
			timeSheetDao.deleteTimeSheetById(id);
		} catch (Exception e) {
			responseStructure.setMessage("time sheet not found");
			responseStructure.setBody("FAILED");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
		}
		responseStructure.setMessage("time sheet deleted successfully");
		responseStructure.setBody("SUCCESS");
		responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
		return new ResponseEntity<>(responseStructure, HttpStatus.NO_CONTENT);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetsOfAllUsers() {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			List<TimeSheet> timeSheets = timeSheetDao.findAllTimeSheets();
			responseStructure.setBody(timeSheets);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("FAILED TO FETCH");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetOfUser(int userId) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			List<TimeSheet> timeSheets = timeSheetDao.findAllTimeSheetByUserId(userId);
			responseStructure.setBody(timeSheets);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("User Not Found With the id : " + userId);
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetOfAYearOfUser(int year, int userId) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			List<TimeSheet> listOfTimeSheets = timeSheetDao.findAllTimeSheetByUserId(userId);
			List<TimeSheet> timesheetOfYear = null;
			if (listOfTimeSheets != null) {
				timesheetOfYear = listOfTimeSheets.stream()
						.filter(timeSheet -> timeSheet.getStart_date().getYear() == year).collect(Collectors.toList());
			}
			responseStructure.setBody(timesheetOfYear);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<TimeSheet>>>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("User Not Found With the id : " + userId);
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<TimeSheet>> findTimeSheetByMonthNameOfUser(String month, int year,
			int userId) {
		ResponseStructure<TimeSheet> responseStructure = new ResponseStructure<>();
		Optional<TimeSheet> optTimeSheet = null;
		try {
			Optional<User> optUser = userDao.findUserById(userId);
			if (optUser.isPresent()) {
				User user = optUser.get();
				List<TimeSheet> timeSheets = user.getTimeSheets();
				optTimeSheet = timeSheets.stream()
						.filter(timeSheet -> timeSheet.getStart_date().getMonth()
								.getDisplayName(TextStyle.FULL, Locale.getDefault()).equalsIgnoreCase(month)
								&& timeSheet.getStart_date().getYear() == year)
						.findAny();
			}
			responseStructure.setMessage("time sheet fetched successfully ");
			responseStructure.setBody(optTimeSheet.get());
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<TimeSheet>>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setMessage("time sheet not found");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetBetweenYearsOfUser(int startYear,
			int endYear, int userId) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			User user = userDao.findUserById(userId).get();
			List<TimeSheet> timeSheets = user.getTimeSheets().stream()
					.filter(timeSheet -> timeSheet.getStart_date().getYear() >= startYear
							&& timeSheet.getStart_date().getYear() <= endYear)
					.collect(Collectors.toList());
			responseStructure.setBody(timeSheets);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<TimeSheet>>>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("FAILED TO FETCH");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);

		}

	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findAllTimeSheetBetweenMonthsOfUser(String startMonth,
			String endMonth, int year, int userId) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			User user = userDao.findUserById(userId).get();
			List<TimeSheet> timeSheets = user.getTimeSheets().stream()
					.filter(timeSheet -> timeSheet.getStart_date().getYear() == year
							&& timeSheet.getStart_date().getMonth().getValue() >= Month
									.valueOf(startMonth.toUpperCase()).getValue()
							&& timeSheet.getStart_date().getMonth().getValue() <= Month.valueOf(endMonth.toUpperCase())
									.getValue())
					.collect(Collectors.toList());
			responseStructure.setBody(timeSheets);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<TimeSheet>>>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("FAILED TO FETCH");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetByMonthNameOfAllEmployees(String month,
			int year) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			List<TimeSheet> timeSheets = timeSheetDao.findAllTimeSheets().stream()
					.filter(timeSheet -> timeSheet.getStart_date().getMonth().getValue() == Month
							.valueOf(month.toUpperCase()).getValue() && timeSheet.getStart_date().getYear() == year)
					.collect(Collectors.toList());
			if (!timeSheets.isEmpty()) {
				responseStructure.setBody(timeSheets);
				responseStructure.setMessage(" FETCHED SUCCESSFULLY");
				responseStructure.setStatusCode(HttpStatus.OK.value());
				return new ResponseEntity<>(responseStructure, HttpStatus.OK);
			} else {
				responseStructure.setBody(new ArrayList<>());
				responseStructure.setMessage(
						"time sheet with respect to month :" + month + " and year:" + year + "\n not presented");
				responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
				return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("FAILED TO FETCH");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetOfUserOnCustomDates(String startMonth,
			int start_year, String endMonth, int end_year, int userId) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			User user = userDao.findUserById(userId).get();
			List<TimeSheet> timeSheets = user.getTimeSheets().stream().filter(
					timesheet -> timesheet.getStart_date().getMonth().getValue() == Month.valueOf(startMonth).getValue()
							&& timesheet.getStart_date().getYear() == start_year
							&& timesheet.getEnd_date().getMonth().getValue() == Month.valueOf(endMonth).getValue()
							&& timesheet.getEnd_date().getYear() == end_year)
					.collect(Collectors.toList());
			responseStructure.setBody(timeSheets);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<TimeSheet>>>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("FAILED TO FETCH");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);
		}

	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> findTimeSheetOnCustomDates(String startMonth,
			int start_year, String endMonth, int end_year) {
		ResponseStructure<List<TimeSheet>> responseStructure = new ResponseStructure<>();
		try {
			List<TimeSheet> timeSheets = timeSheetDao.findAllTimeSheets().stream().filter(
					timesheet -> timesheet.getStart_date().getMonth().getValue() == Month.valueOf(startMonth).getValue()
							&& timesheet.getStart_date().getYear() == start_year
							&& timesheet.getEnd_date().getMonth().getValue() == Month.valueOf(endMonth).getValue()
							&& timesheet.getEnd_date().getYear() == end_year)
					.collect(Collectors.toList());

			responseStructure.setBody(timeSheets);
			responseStructure.setMessage(" FETCHED SUCCESSFULLY");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<TimeSheet>>>(responseStructure, HttpStatus.OK);
		} catch (Exception e) {
			responseStructure.setBody(new ArrayList<>());
			responseStructure.setMessage("FAILED TO FETCH");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<>(responseStructure, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TimeSheet>>> fetchCurrentMonthTimeSheet() {
		LocalDate currentDate = LocalDate.now();
		return findTimeSheetByMonthNameOfAllEmployees(String.valueOf(currentDate.getMonth()), currentDate.getYear());

	}
}