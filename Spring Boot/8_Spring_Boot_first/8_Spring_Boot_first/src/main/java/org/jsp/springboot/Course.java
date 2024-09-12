package org.jsp.springboot;

public class Course {
	private long id;
	private String name;
	private String platform;
	
	public Course() {
		super();
	}
	
	public Course(long id,String name,String platform) {
		super();
		this.id=id;
		this.name=name;
		this.platform=platform;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", platform=" + platform + "]";
	}
	
}
