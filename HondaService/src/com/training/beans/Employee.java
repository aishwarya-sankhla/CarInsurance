package com.training.beans;

public class Employee {
	
	private String eid;
	private String name;
	private String password;
	public Employee(String eid, String name, String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.password = password;
	}
	public Employee() {
		super();
	
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
