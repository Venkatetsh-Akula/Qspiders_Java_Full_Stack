package org.jsp.composite.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@EmbeddedId
	UserId id;
	private String name;
	private String password;
	public UserId getId() {
		return id;
	}
	public void setId(UserId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
