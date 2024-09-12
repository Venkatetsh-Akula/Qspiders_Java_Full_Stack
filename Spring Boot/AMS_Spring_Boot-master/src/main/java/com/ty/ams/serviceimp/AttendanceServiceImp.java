package com.ty.ams.serviceimp;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ty.ams.daoimp.AttendanceDaoImp;
import com.ty.ams.daoimp.TimeSheetDaoImp;
import com.ty.ams.entity.Attendance;
import com.ty.ams.entity.TimeSheet;
import com.ty.ams.exceptionclasses.user.AttendanceNotFoundException;
import com.ty.ams.exceptionclasses.user.AttendanceNotFoundWithTheEnterdDate;
import com.ty.ams.exceptionclasses.user.UnableToCreateAttendance;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.service.AttendanceService;
import com.ty.ams.util.AttendanceStatus;

@Service
public class AttendanceServiceImp implements AttendanceService {

	@Autowired
	private AttendanceDaoImp dao;
	
	@Autowired
	private TimeSheetDaoImp timeSheetDao ;

	@Override
	public ResponseEntity<ResponseStructure<Attendance>> saveAttendance(Attendance attendance, int timesheetId) {
		
		TimeSheet timeSheet = timeSheetDao.findBytimesheet_id(timesheetId).get() ;
		
		if (attendance != null && timeSheet != null) {

			ResponseStructure<Attendance> response = new ResponseStructure<Attendance>();
			response.setStatusCode(HttpStatus.CREATED.value());
			response.setMessage(HttpStatus.CREATED.getReasonPhrase());
			response.setBody(attendance);
			timeSheet.getAttendences().add(attendance) ;
			dao.saveAttendance(attendance);
			return new ResponseEntity<ResponseStructure<Attendance>>(response, HttpStatus.CREATED);
		}
		throw new UnableToCreateAttendance();
	}

	@Override
	public ResponseEntity<ResponseStructure<Attendance>> findAttandanceById(int id) {

		if (dao.findById(id).get() != null) {
			ResponseStructure<Attendance> response = new ResponseStructure<Attendance>();
			response.setStatusCode(HttpStatus.FOUND.value());
			response.setMessage(HttpStatus.FOUND.getReasonPhrase());
			response.setBody(dao.findById(id).get());
			System.out.println(dao.findById(id));
			return new ResponseEntity<ResponseStructure<Attendance>>(response, HttpStatus.FOUND);
		}
		throw new AttendanceNotFoundException();
	}

	@Override
	public ResponseEntity<ResponseStructure<Attendance>> updateAttandance(Attendance attendance) {

		if (attendance != null) {

			ResponseStructure<Attendance> response = new ResponseStructure<Attendance>();
			response.setStatusCode(HttpStatus.OK.value());
			response.setMessage(HttpStatus.OK.getReasonPhrase());
			response.setBody(attendance);
			dao.saveAttendance(attendance);
			return new ResponseEntity<ResponseStructure<Attendance>>(response, HttpStatus.OK);
		}
		throw new AttendanceNotFoundException();
	}

	@Override
	public ResponseEntity<ResponseStructure<Attendance>> deleteAttandance(int id) {

		Optional<Attendance> delAttendance = dao.findById(id);

		if (delAttendance.get() != null) {
			ResponseStructure<Attendance> response = new ResponseStructure<Attendance>();
			response.setStatusCode(HttpStatus.NO_CONTENT.value());
			response.setMessage(HttpStatus.NO_CONTENT.getReasonPhrase());
//			response.setBody(delAttendance.get());
			dao.deleteAttendance(id);
			return new ResponseEntity<ResponseStructure<Attendance>>(response, HttpStatus.NO_CONTENT);
		}
		throw new AttendanceNotFoundException();
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Attendance>>> findAllAttendanceByAttendanceStatus(String status) {
		
		if (dao.findAllAttendanceByAttendanceStatus(AttendanceStatus.valueOf(status.toUpperCase())) != null) {
			ResponseStructure<List<Attendance>> response = new ResponseStructure<List<Attendance>>();
			response.setStatusCode(HttpStatus.OK.value());
			response.setMessage(HttpStatus.OK.getReasonPhrase());
			response.setBody(dao.findAllAttendanceByAttendanceStatus(AttendanceStatus.valueOf(status.toUpperCase())));

			return new ResponseEntity<ResponseStructure<List<Attendance>>>(response, HttpStatus.OK);
		}
		throw new AttendanceNotFoundException();
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Attendance>>> findAllAttendenceByDate(LocalDate date) {

		if (dao.findAllAttendenceByDate(date) != null) {
			ResponseStructure<List<Attendance>> response = new ResponseStructure<List<Attendance>>();
			response.setStatusCode(HttpStatus.OK.value());
			response.setMessage(HttpStatus.OK.getReasonPhrase());
			response.setBody(dao.findAllAttendenceByDate(date));
			return new ResponseEntity<ResponseStructure<List<Attendance>>>(response, HttpStatus.OK);
		}
		throw new AttendanceNotFoundWithTheEnterdDate();
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Attendance>>> findAllAttendanceByAttendanceStatusAndDate(
			String status, LocalDate date) {

		if (dao.findAllAttendanceByAttendanceStatusAndDate(AttendanceStatus.valueOf(status.toUpperCase()) , date) != null) {
			ResponseStructure<List<Attendance>> response = new ResponseStructure<List<Attendance>>() ;
			response.setStatusCode(HttpStatus.OK.value());
			response.setMessage(HttpStatus.OK.getReasonPhrase());
			response.setBody(dao.findAllAttendanceByAttendanceStatusAndDate(AttendanceStatus.valueOf(status.toUpperCase()), date));
			return new ResponseEntity<ResponseStructure<List<Attendance>>>(response, HttpStatus.OK);
		}
		throw new AttendanceNotFoundWithTheEnterdDate();
	}

}
