package org.jsp.demo.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Department  {
	@Id
	@EmbeddedId
	private DepartmentCompositeKey dc;
	private String dname;
	private String loc;
	public void setDepartmentCompositeKeys(DepartmentCompositeKey dc) {
		this.dc=dc;
	}
	public DepartmentCompositeKey getDepartmentCompositeKeys() {
		return dc;
	}
	public void setDname(String dname) {
		this.dname=dname;
	}
	public String getDname() {
		return dname;
	}
	public void setLoc(String loc) {
		this.loc=loc;
	}
	public String getLoc() {
		return loc;
	}
	
}
