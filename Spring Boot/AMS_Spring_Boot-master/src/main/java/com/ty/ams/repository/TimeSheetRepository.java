package com.ty.ams.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.ams.entity.TimeSheet;

public interface TimeSheetRepository extends JpaRepository<TimeSheet, Integer> {
	@Query("select t from TimeSheet t where t.timesheetId=:id")
	Optional<TimeSheet> findBytimesheet_id(int id);
}
