package org.jsp.springboot.jdbc;

import org.jsp.springboot.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository{
	@Autowired
	private JdbcTemplate code;
	private String insert=
			"""
			insert into course values(?,?,?)
			""";
	public void persist(Course course) {
		code.update(insert,course.getId(),course.getName(),course.getAuthor());
	}
	public void remove(int i) {
		code.update("delete from course where id=?",i);
	}
	public void merge(int i) {
		code.update("update course set name='venky' where id=?",i);
	}
	public Object find(int i) {
		return code.queryForObject("select * from course where id=?",new BeanPropertyRowMapper<>(Course.class),i);
	}
}
