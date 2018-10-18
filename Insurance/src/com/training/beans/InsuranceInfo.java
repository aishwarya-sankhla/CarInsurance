package com.training.beans;

public class InsuranceInfo {
	private String regNo;
	private String policyNo;
	private String model;
	private double maxCoverage;
	private String insuranceType;
	
	
	public InsuranceInfo(String regNo, String policyNo, String model, double maxCoverage, String insuranceType) {
		super();
		this.regNo = regNo;
		this.policyNo = policyNo;
		this.model = model;
		this.maxCoverage = maxCoverage;
		this.insuranceType = insuranceType;
	}


	public InsuranceInfo() {
		super();
	
	}


	@Override
	public String toString() {
		return "InsuranceInfo [policyNo=" + policyNo + ", model=" + model + ", maxCoverage=" + maxCoverage
				+ ", insuranceType=" + insuranceType + "]";
	}

	

	public String getRegNo() {
		return regNo;
	}


	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}


	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getMaxCoverage() {
		return maxCoverage;
	}
	public void setMaxCoverage(double maxCoverage) {
		this.maxCoverage = maxCoverage;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
}
