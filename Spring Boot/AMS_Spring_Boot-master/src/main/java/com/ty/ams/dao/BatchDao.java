package com.ty.ams.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.ty.ams.entity.Batch;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

public interface BatchDao {

	Optional<Batch> findBatchById(int batchId);

	Batch saveBatch(Batch batch);

	Batch updateBatch(Batch batch);

	void deleteBatch(int batchId);

	List<Batch> findAllBatchs();

	Batch findBatchByBatchCode(String batchCode);

	List<Batch> findBatchBySubjectName(String subjectName);

	List<Batch> findBatchBySubjectNameAndBatchStatus(String subjectName, BatchStatus status);

	List<Batch> findBatchByStartedDate(LocalDate startDate);

	List<Batch> findBatchByBatchMode(BatchMode mode);

	List<Batch> findByUserUserIdAndBatchStatus(int userId, BatchStatus batchStatus);
//	List<Batch> findBatchByUserIdAndBatchStatus(int userId, BatchStatus status);

	List<Batch> findByBatchStartDateBetween(LocalDate startDate, LocalDate endDate);
//	List<Batch> findBatchBetweenDates(LocalDate fromDate, LocalDate toDate);

}
