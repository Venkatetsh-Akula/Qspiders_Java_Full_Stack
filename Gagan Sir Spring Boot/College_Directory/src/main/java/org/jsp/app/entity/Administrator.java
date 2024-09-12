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
public class Administrator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int administrator_id;
	private String administrator_photo;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Department> dept;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Users user;
		
}
