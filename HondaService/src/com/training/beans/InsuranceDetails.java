package com.training.beans;

public class InsuranceDetails {
	private String insuranceType;
	private double maxCoverage;
	private String model;
	private String policyNo;
	private String regNo;
	public InsuranceDetails() {
		super();

	}
	public InsuranceDetails(String insuranceType, double maxCoverage, String model, String policyNo, String regNo) {
		super();
		this.insuranceType = insuranceType;
		this.maxCoverage = maxCoverage;
		this.model = model;
		this.policyNo = policyNo;
		this.regNo = regNo;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	@Override
	public String toString() {
		return "InsuranceDetails [insuranceType=" + insuranceType + ", maxCoverage=" + maxCoverage + ", model=" + model
				+ ", policyNo=" + policyNo + ", regNo=" + regNo + "]";
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public double getMaxCoverage() {
		return maxCoverage;
	}
	public void setMaxCoverage(double maxCoverage) {
		this.maxCoverage = maxCoverage;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
}