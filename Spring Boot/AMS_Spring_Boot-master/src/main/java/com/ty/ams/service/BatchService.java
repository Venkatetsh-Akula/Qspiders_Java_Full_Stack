package com.ty.ams.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ty.ams.entity.Batch;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

public interface BatchService {
	ResponseEntity<ResponseStructure<Batch>> findBatchById(int batchId);

	ResponseEntity<ResponseStructure<Batch>> saveBatch(Batch batch);

	ResponseEntity<ResponseStructure<Batch>> updateBatch(Batch batch);

	ResponseEntity<ResponseStructure<String>> deleteBatch(int batchId);

	ResponseEntity<ResponseStructure<List<Batch>>> findAllBatchs();

	ResponseEntity<ResponseStructure<Batch>> findBatchByBatchCode(String batchCode);

	ResponseEntity<ResponseStructure<List<Batch>>> findBatchBySubjectName(String subjectName);

	ResponseEntity<ResponseStructure<List<Batch>>> findBatchBySubjectNameAndBatchStatus(String subjectName,
			BatchStatus status);

	ResponseEntity<ResponseStructure<List<Batch>>> findBatchByStartedDate(LocalDate startDate);

	ResponseEntity<ResponseStructure<List<Batch>>> findBatchByBatchMode(BatchMode mode);

	ResponseEntity<ResponseStructure<List<Batch>>> findBatchByUserIdAndBatchStatus(int userId, BatchStatus status);

	ResponseEntity<ResponseStructure<List<Batch>>> findBatchBetweenDates(LocalDate fromDate, LocalDate toDate);
}
