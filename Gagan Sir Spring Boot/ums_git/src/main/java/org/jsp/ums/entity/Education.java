package org.jsp.ums.entity;

import org.jsp.ums.util.HighestQualification;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educationId;
	private String qualification;
	private String universityName;
	private double percentage;
	private int completionYear;
	@Enumerated(EnumType.STRING)
	private HighestQualification highestQualification;

	@ManyToOne
	private User user;
}
