package org.jsp.app.helloworld;

public class HelloWorldBean {
	private String msg;
	public HelloWorldBean() {
		
	}
	public HelloWorldBean(String msg) {
		this.msg=msg;
	}
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + "]";
	}
}
