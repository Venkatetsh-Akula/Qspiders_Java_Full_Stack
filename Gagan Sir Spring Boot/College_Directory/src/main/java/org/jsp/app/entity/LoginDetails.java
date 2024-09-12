package org.jsp.app.entity;

import org.jsp.app.enums.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDetails {
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
}
