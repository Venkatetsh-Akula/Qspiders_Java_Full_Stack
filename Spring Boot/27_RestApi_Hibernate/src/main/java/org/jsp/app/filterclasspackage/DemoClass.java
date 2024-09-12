package org.jsp.app.filterclasspackage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//class level ignore
@JsonIgnoreProperties("field1")
public class DemoClass {
	private String field1;
	
	//field level ignore
	@JsonIgnore
	private String field2;
	private String field3;
	public DemoClass(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	public DemoClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	@Override
	public String toString() {
		return "DemoClass [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
	}
}
