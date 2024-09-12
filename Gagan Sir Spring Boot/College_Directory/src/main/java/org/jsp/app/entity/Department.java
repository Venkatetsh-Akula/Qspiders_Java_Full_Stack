package org.jsp.app.entity;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	private String dept_name;
	private String dept_description;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Student> student;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Faculty> faculty;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Administrator> administrator;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Course> course;
	
}
