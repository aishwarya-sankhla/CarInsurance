package com.training.beans;


public class ServiceDetail {
	private String serviceType;
	private String serviceDate;
	private String estimatedDelivery;
	private String regno;
	public ServiceDetail() {
		super();
	
	}
	public ServiceDetail(String serviceType, String serviceDate, String estimatedDelivery, String regno) {
		super();
		this.serviceType = serviceType;
		this.serviceDate = serviceDate;
		this.estimatedDelivery = estimatedDelivery;
		this.regno = regno;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getEstimatedDelivery() {
		return estimatedDelivery;
	}
	public void setEstimatedDelivery(String estimatedDelivery) {
		this.estimatedDelivery = estimatedDelivery;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	
	
}
