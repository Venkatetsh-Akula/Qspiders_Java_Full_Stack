package org.jsp.app.version;

public class PersonV2 {
	private PersonFirstNameLastName personv2;

	public PersonV2(PersonFirstNameLastName personv2) {
		super();
		this.personv2 = personv2;
	}

	public PersonV2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PersonFirstNameLastName getV2() {
		return personv2;
	}

	public void setV2(PersonFirstNameLastName personv2) {
		this.personv2 = personv2;
	}

	@Override
	public String toString() {
		return "PersonV2 [personv2=" + personv2 + "]";
	}
	
}
