package com.training.beans;

public class CarServices {
	private String serviceType;
	private String plastic;
	private String metal;
	private String labour;
	private String covered;
	public CarServices() {
		super();
	}
	public CarServices(String serviceType, String plastic, String metal, String labour, String covered) {
		super();
		this.serviceType = serviceType;
		this.plastic = plastic;
		this.metal = metal;
		this.labour = labour;
		this.covered = covered;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getPlastic() {
		return plastic;
	}
	public void setPlastic(String plastic) {
		this.plastic = plastic;
	}
	public String getMetal() {
		return metal;
	}
	public void setMetal(String metal) {
		this.metal = metal;
	}
	public String getLabour() {
		return labour;
	}
	public void setLabour(String labour) {
		this.labour = labour;
	}
	public String getCovered() {
		return covered;
	}
	public void setCovered(String covered) {
		this.covered = covered;
	}
	@Override
	public String toString() {
		return "CarServices [serviceType=" + serviceType + ", plastic=" + plastic + ", metal=" + metal + ", labour="
				+ labour + ", covered=" + covered + "]";
	}
	
	
}