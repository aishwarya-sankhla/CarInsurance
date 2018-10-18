package com.training.beans;

public class LogClaimInfo {
	
	@Override
	public String toString() {
		return "LogClaimInfo [regno=" + regno + ", dateOfRequest=" + dateOfRequest + ", serviceCenter=" + serviceCenter
				+ "]";
	}
	/**
	 * This is to store calls made to insurance comapany
	 */
	
	private String regno;
	private String dateOfRequest;
	private String serviceCenter;
	
	
	
	public LogClaimInfo() {
		super();
	
	}
	public LogClaimInfo(String regno, String dateOfRequest, String serviceCenter) {
		super();
		this.regno = regno;
		this.dateOfRequest = dateOfRequest;
		this.serviceCenter = serviceCenter;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getDateOfRequest() {
		return dateOfRequest;
	}
	public void setDateOfRequest(String dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}
	public String getServiceCenter() {
		return serviceCenter;
	}
	public void setServiceCenter(String serviceCenter) {
		this.serviceCenter = serviceCenter;
	}

}
