package com.training.beans;


import java.util.List;

public class Customer {
	 private int cid; 
	 private String custName;
	 private String phone;
	 private List<Car> carList;
	public Customer() {
		super();
		
	}
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Customer(int cid, String custName, String phone) {
		super();
		this.cid = cid;
		this.custName = custName;
		this.phone = phone;
	}

	public Customer(String custName, String phone, List<Car> carList) {
		super();
		this.custName = custName;
		this.phone = phone;
		this.carList = carList;
	}
	
	
	public Customer(int cid, String custName, String phone, List<Car> carList) {
		super();
		this.cid = cid;
		this.custName = custName;
		this.phone = phone;
		this.carList = carList;
	}

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", phone=" + phone + ", carList=" + carList + "]";
	}
	  
}
