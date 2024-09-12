package org.jsp.app.entity;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int faculty_id;
	private String faculty_photo;
	private String office_hours;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Department> dept;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Course> course;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Users user;
	
}
