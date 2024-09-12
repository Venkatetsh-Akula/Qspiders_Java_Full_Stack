package org.jsp.app.version;

public class PersonV1 {
	
	private String personv1;

	public PersonV1(String personv1) {
		super();
		this.personv1 = personv1;
	}

	public PersonV1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return personv1;
	}

	public void setName(String personv1) {
		this.personv1 = personv1;
	}

	@Override
	public String toString() {
		return "PersonV1 [name=" + personv1 + "]";
	}
	
}
