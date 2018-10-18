package com.training.beans;

public class ServiceLog {
	/**
	 * Service Logs
	 * 	SERVICE_ID         NUMBER       
		SERVICE_TYPE       VARCHAR2(30) 
		SERVICE_DATE       VARCHAR2(20) 
		DELIVERY_DATE      VARCHAR2(20) 
		REGNO              VARCHAR2(12) 
	 */
	private int serviceId;
	private String serviceType;
	private String serviceDate;
	private String deliveryDate;
	private String regno;
	
	public ServiceLog(int serviceId, String serviceType, String serviceDate, String deliveryDate, String regno) {
		super();
		this.serviceId = serviceId;
		this.serviceType = serviceType;
		this.serviceDate = serviceDate;
		this.deliveryDate = deliveryDate;
		this.regno = regno;
	}
	public ServiceLog() {
		super();
	
	}
	@Override
	public String toString() {
		return "ServiceLog [serviceId=" + serviceId + ", serviceType=" + serviceType + ", serviceDate=" + serviceDate
				+ ", deliveryDate=" + deliveryDate + ", regno=" + regno + "]";
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
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
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	
}
