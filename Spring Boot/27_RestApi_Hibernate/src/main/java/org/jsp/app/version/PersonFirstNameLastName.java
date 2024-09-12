package org.jsp.app.version;

public class PersonFirstNameLastName {
	
	private String firstname;
	
	private String lastname;
	
	public PersonFirstNameLastName(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public PersonFirstNameLastName() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "PersonFirstNameLastName [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
