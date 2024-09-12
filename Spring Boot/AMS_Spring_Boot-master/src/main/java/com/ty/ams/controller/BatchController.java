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

import com.ty.ams.entity.Batch;
import com.ty.ams.responsestructure.ResponseStructure;
import com.ty.ams.service.BatchService;
import com.ty.ams.util.BatchMode;
import com.ty.ams.util.BatchStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/batch")
public class BatchController {
	@Autowired
	private BatchService batchService;

	@Operation(description = "Batch Object will be saved..", summary = "To Save Batch Object to Database..")
	@ApiResponses(value = { @ApiResponse(description = "Batch saved Successfully", responseCode = "201"),
			@ApiResponse(description = "Unable To Save Batch To Database", responseCode = "409") })
	@PostMapping
	public ResponseEntity<ResponseStructure<Batch>> saveBatch(@RequestBody Batch batch) {
		return batchService.saveBatch(batch);
	}

	@Operation(description = "Fetching / Find Batch by batchId", summary = "To Find Batch Object By batchId...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided batchId...", responseCode = "404") })
	@GetMapping("/{batchId}")
	public ResponseEntity<ResponseStructure<Batch>> findBatchById(@PathVariable int batchId) {
		return batchService.findBatchById(batchId);
	}

	@Operation(description = "Batch Object Will be Updated...", summary = "To Update Batch Object...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Updated Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Updated Batch To Database", responseCode = "409") })
	@PutMapping
	public ResponseEntity<ResponseStructure<Batch>> updateBatch(@RequestBody Batch batch) {
		return batchService.updateBatch(batch);
	}

	@Operation(description = "Deleting Batch by batchId", summary = "To Delete Batch Object By batchId...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Deleted Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Delete Batch for Provided batchId...", responseCode = "404") })
	@DeleteMapping("/{batchId}")
	public ResponseEntity<ResponseStructure<String>> deleteBatch(@PathVariable int batchId) {
		return batchService.deleteBatch(batchId);
	}

	@Operation(description = "Fetch / Find All Batches in the Database...", summary = "To Fetch All The Batches From The Database")
	@ApiResponses(value = { @ApiResponse(description = "All Batches Found Successfully...", responseCode = "200"),
			@ApiResponse(description = "No Batches Found in Database...", responseCode = "200"),
			@ApiResponse(description = "Unable to find All Batches...", responseCode = "404") })
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Batch>>> findAllBatchs() {
		return batchService.findAllBatchs();
	}

	@Operation(description = "Fetching / Find Batch by BatchCode", summary = "To Find Batch Object By BatchCode...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided BatchCode...", responseCode = "404") })
	@GetMapping("/batchcode/{batchCode}")
	public ResponseEntity<ResponseStructure<Batch>> findBatchByBatchCode(@PathVariable String batchCode) {
		return batchService.findBatchByBatchCode(batchCode);
	}

	@Operation(description = "Fetching / Find Batch by SubjectName", summary = "To Find Batch Object By SubjectName...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided SubjectName...", responseCode = "404") })
	@GetMapping("/subjectname/{subjectName}")
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBySubjectName(@PathVariable String subjectName) {
		return batchService.findBatchBySubjectName(subjectName);
	}

	@Operation(description = "Fetching / Find Batch by SubjectName And BatchStatus", summary = "To Find Batch Object By SubjectName And BatchStatus...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided SubjectName And BatchStatus...", responseCode = "404") })
	@GetMapping("/subjectname-name/{subjectName}/{status}")
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBySubjectNameAndBatchStatus(
			@PathVariable String subjectName, @PathVariable BatchStatus status) {
		return batchService.findBatchBySubjectNameAndBatchStatus(subjectName, status);
	}

	@Operation(description = "Fetching / Find Batch by StartDate", summary = "To Find Batch Object By StartDate...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided StartDate...", responseCode = "404") })
	@GetMapping("/startdate/{startDate}")
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchByStartedDate(@PathVariable LocalDate startDate) {
		return batchService.findBatchByStartedDate(startDate);
	}

	@Operation(description = "Fetching / Find Batch by Batch Mode", summary = "To Find Batch Object By Batch Mode...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided Batch Mode...", responseCode = "404") })
	@GetMapping("/mode/{mode}")
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchByBatchMode(@PathVariable BatchMode mode) {
		return batchService.findBatchByBatchMode(mode);
	}

	@Operation(description = "Fetching / Find Batch by UserId And BatchStatus", summary = "To Find Batch Object By UserId And BatchStatus...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided UserId And BatchStatus...", responseCode = "404") })
	@GetMapping("/userid-status/{userId}/{status}")
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchByUserIdAndBatchStatus(@PathVariable int userId,
			@PathVariable BatchStatus status) {

		return batchService.findBatchByUserIdAndBatchStatus(userId, status);
	}

	@Operation(description = "Fetching / Find Batch by FromDate And ToDate", summary = "To Find Batch Object By FromDate And ToDate...")
	@ApiResponses(value = { @ApiResponse(description = "Batch Found Successfully", responseCode = "200"),
			@ApiResponse(description = "Unable To Find Batch for Provided UserId And FromDate And ToDate...", responseCode = "404") })
	@GetMapping("/fromdate-todate/{fromDate}/{toDate}")
	public ResponseEntity<ResponseStructure<List<Batch>>> findBatchBetweenDates(@PathVariable LocalDate fromDate,
			@PathVariable LocalDate toDate) {
		return batchService.findBatchBetweenDates(fromDate, toDate);
	}
}
