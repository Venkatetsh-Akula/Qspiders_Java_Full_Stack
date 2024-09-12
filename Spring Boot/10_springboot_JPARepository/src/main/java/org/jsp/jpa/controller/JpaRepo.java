package org.jsp.jpa.controller;

import org.jsp.jpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepo extends JpaRepository<Course, Integer>{

}
