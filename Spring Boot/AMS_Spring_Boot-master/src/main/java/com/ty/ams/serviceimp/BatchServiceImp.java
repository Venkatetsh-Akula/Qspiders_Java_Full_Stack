package com.ty.ams.serviceimp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.ams.dao.BatchDao;
import com.ty.ams.daoimp.UserDaoImp;
import com.ty.ams.entity.Batch;
import com.ty.ams.entity.User;
import com.ty.ams.exceptionclasses.batch.BatchCodeNotFoundException;
import com.ty.ams.exceptionclasses.batch.BatchIdNotFoundException;
import com.ty.ams.exceptionclasses.batch.BatchesNotPresentException;
import com.ty.ams.exceptionclasses.batch.NoSuchBatchModeFoundException;
import com.ty.ams.exceptionclasses.batch.StartedDateInvalidException;
import com.ty.ams.exceptionclasses.batch.SubjectNameNotFoundExcpetion;
import com.ty.ams.exceptionclasses.user.IdNotFoundException;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.service.BatchService;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

@Service
public class BatchServiceImp implements BatchService {

	@Autowired
	private BatchDao batchDao;

	@Autowired
	private UserDaoImp userDaoImp;

	@Override
	public ResponseEntity<ResponseStructure<Batch>> findBatchById(int batchId) {
		Optional<Batch> optional = batchDao.findBatchById(batchId);
		if (optional.isEmpty())
			throw new BatchIdNotFoundException();

		ResponseStructure<Batch> responseStructure = new ResponseStructure<Batch>();
		responseStructure.setBody(optional.get());
		responseStructure.setMessage("Batch found Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Batch>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<Batch>> saveBatch(Batch batch) {
		ResponseStructure<Batch> responseStructure = new ResponseStructure<Batch>();
		responseStructure.setBody(batchDao.saveBatch(batch));
		responseStructure.setMessage("Batch created Successfully");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Batch>>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<Batch>> updateBatch(Batch batch) {
		ResponseStructure<Batch> responseStructure = new ResponseStructure<Batch>();
		responseStructure.setBody(batchDao.updateBatch(batch));
		responseStructure.setMessage("Batch Updated Successfully");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Batch>>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> deleteBatch(int batchId) {
		Optional<Batch> optional = batchDao.findBatchById(batchId);
		if (optional.isEmpty())
			throw new BatchIdNotFoundException();
		Batch batch = optional.get();
		batch.setBatchStatus(BatchStatus.COMPLETED);
		batchDao.updateBatch(batch);
		ResponseStructure<String> responseStructure = new ResponseStructure();
		responseStructure.setBody("");
		responseStructure.setMessage("Batch Deleted Successfully");
		responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
		return new ResponseEntity<ResponseStructure<String>>(responseStructure, HttpStatus.NO_CONTENT);

	}
//		if (optional.get() != null) {
//			Batch batch = optional.get();
//			User u = batch.getUser();
//			if (u != null) {
//				List<Batch>  batchs= u.getBatchs();
//				Iterator<Batch> i=batchs.iterator();
//				while(i.hasNext()) {
//					Batch b=i.next();
//					if (b.getBatchCode() == batch.getBatchCode())
//						i.remove();
//				}
//batchs.removeIf(b -> b.getBatchCode() == batch.getBatchCode());

//				u.setBatchs(batchs);
//				userDaoImp.updateUser(u);
//			}
//
//			batchDao.deleteBatch(batchId);
//			ResponseStructure<String> responseStructure = new ResponseStructure();
//			responseStructure.setBody("");
//			responseStructure.setMessage("Batch Deleted Successfully");
//			responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
//			return new ResponseEntity<ResponseStructure<String>>(responseStructure, HttpStatus.NO_CONTENT);
//		} else {
//			return null;
//		}
//	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findAllBatchs() {
		List<Batch> batchs = batchDao.findAllBatchs();
		if (batchs.isEmpty())
			throw new BatchesNotPresentException();
		ResponseStructure<List<Batch>> responseStructure = new ResponseStructure();
		responseStructure.setBody(batchs);
		responseStructure.setMessage("All Batches are Fetched Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Batch>>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<Batch>> findBatchByBatchCode(String batchCode) {
		Batch batch = batchDao.findBatchByBatchCode(batchCode);
		if (batch == null)
			throw new BatchCodeNotFoundException();
		ResponseStructure<Batch> responseStructure = new ResponseStructure();
		responseStructure.setBody(batch);
		responseStructure.setMessage("Batch Fetched  By BatchCode Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Batch>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBySubjectName(String subjectName) {
		List<Batch> batchs = batchDao.findBatchBySubjectName(subjectName);
		if (batchs.isEmpty())
			throw new SubjectNameNotFoundExcpetion();
		ResponseStructure<List<Batch>> responseStructure = new ResponseStructure();
		responseStructure.setBody(batchs);
		responseStructure.setMessage("Batches Fetched  By BatchName Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Batch>>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBySubjectNameAndBatchStatus(String subjectName,
			BatchStatus status) {
		List<Batch> batchs = batchDao.findBatchBySubjectNameAndBatchStatus(subjectName, status);
		if (batchs.isEmpty())
			throw new SubjectNameNotFoundExcpetion();
		ResponseStructure<List<Batch>> responseStructure = new ResponseStructure();
		responseStructure.setBody(batchs);
		responseStructure.setMessage("Batchs Fetched  By BatchName and BatchStatus Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Batch>>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchByStartedDate(LocalDate startDate) {
		List<Batch> batchs = batchDao.findBatchByStartedDate(startDate);
		if (batchs.isEmpty())
			throw new StartedDateInvalidException();
		ResponseStructure<List<Batch>> responseStructure = new ResponseStructure();
		responseStructure.setBody(batchs);
		responseStructure.setMessage("Batchs Fetched  By StartDate Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Batch>>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchByBatchMode(BatchMode mode) {
		List<Batch> batchs = batchDao.findBatchByBatchMode(mode);
		if (batchs.isEmpty())
			throw new NoSuchBatchModeFoundException();
		ResponseStructure<List<Batch>> responseStructure = new ResponseStructure();
		responseStructure.setBody(batchs);
		responseStructure.setMessage("Batchs Fetched  By BatchMode Successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Batch>>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchByUserIdAndBatchStatus(int userId,
			BatchStatus status) {
		Optional<User> optional = userDaoImp.findUserById(userId);
		if (optional.isEmpty())
			throw new IdNotFoundException();
		List<Batch> batchs = optional.get().getBatchs();
		ResponseStructure<List<Batch>> responseStructure = new ResponseStructure<>();
		responseStructure.setBody(batchs.stream().filter(b -> (b.getBatchStatus() + "").equals(status.toString()))
				.collect(Collectors.toList()));
		responseStructure.setMessage("All Batches Found For The BatchStatus : " + status);
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBetweenDates(LocalDate startDate,
			LocalDate endDate) {
		List<Batch> batchs = batchDao.findByBatchStartDateBetween(startDate, endDate);
		if (!batchs.isEmpty()) {
			ResponseStructure<List<Batch>> responseStructure = new ResponseStructure();
			responseStructure.setBody(batchs);
			responseStructure.setMessage("Batchs Fetched  By BatchStartDate and BatchEndDate Successfully");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<List<Batch>>>(responseStructure, HttpStatus.OK);
		}
		return null;
	}
//	@Override
//	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBetweenDates(LocalDate fromDate, LocalDate toDate) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
