package com.ty.ams.daoimp;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.ams.dao.BatchDao;
import com.ty.ams.entity.Batch;
import com.ty.ams.repository.BatchRepository;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

@Repository
public class BatchDaoImp implements BatchDao {

	@Autowired
	private BatchRepository batchRepository;

	@Override
	public Optional<Batch> findBatchById(int batchId) {
		return batchRepository.findById(batchId);
	}

	@Override
	public Batch saveBatch(Batch batch) {
		return batchRepository.save(batch);
	}

	@Override
	public Batch updateBatch(Batch batch) {
		return batchRepository.save(batch);
	}

	@Override
	public void deleteBatch(int batchId) {
		batchRepository.deleteById(batchId);
	}

	@Override
	public List<Batch> findAllBatchs() {
		return batchRepository.findAll();
	}

	@Override
	public Batch findBatchByBatchCode(String batchCode) {
		return batchRepository.findByBatchCode(batchCode);
	}

	@Override
	public List<Batch> findBatchBySubjectName(String subjectName) {
		return batchRepository.findBySubjectName(subjectName);
	}

	@Override
	public List<Batch> findBatchBySubjectNameAndBatchStatus(String subjectName, BatchStatus status) {
		return batchRepository.findBySubjectNameAndBatchStatus(subjectName, status);
	}

	@Override
	public List<Batch> findBatchByStartedDate(LocalDate startDate) {
		return batchRepository.findByBatchStartDate(startDate);
	}

	@Override
	public List<Batch> findBatchByBatchMode(BatchMode mode) {
		return batchRepository.findByBatchMode(mode);
	}

//	@Override
//	public List<Batch> findBatchByUserIdAndBatchStatus(int userId, BatchStatus status) {
//		return batchRepository.findBatchByUserIdAndBatchStatus(userId, status);
//	}

	@Override
	public List<Batch> findByBatchStartDateBetween(LocalDate startDate, LocalDate endDate) {
		return batchRepository.findByBatchStartDateBetween(startDate, endDate);
	}

	@Override
	public List<Batch> findByUserUserIdAndBatchStatus(int userId, BatchStatus batchStatus) {
		return batchRepository.findByUserUserIdAndBatchStatus(userId, batchStatus);
	}

}
