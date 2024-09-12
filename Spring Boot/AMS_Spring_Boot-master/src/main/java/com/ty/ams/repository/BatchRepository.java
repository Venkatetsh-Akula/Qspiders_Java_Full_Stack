package com.ty.ams.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.ams.entity.Batch;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

public interface BatchRepository extends JpaRepository<Batch, Integer> {

	Batch findByBatchCode(String batchCode);

//	@Query("select b from Batch b where b.subjectName=:subjectName")
	List<Batch> findBySubjectName(String subjectName);

//	@Query("select b from Batch b where b.subjectName=:subjectName and b.batchStatus=:status")
	List<Batch> findBySubjectNameAndBatchStatus(String subjectName, BatchStatus status);

	List<Batch> findByBatchStartDate(LocalDate StartDate);

	List<Batch> findByBatchMode(BatchMode mode);

//	@Query("select b from Batch b where b.user.userId=?1 and b.batchStatus=?2")
//	List<Batch> findBatchByUserIdAndBatchStatus(int userId, BatchStatus status);
	List<Batch> findByUserUserIdAndBatchStatus(int userId, BatchStatus batchStatus);

	List<Batch> findByBatchStartDateBetween(LocalDate startDate, LocalDate endDate);
//	List<Batch> findBatchBetweenDates(LocalDate fromDate, LocalDate toDate);

}
