package com.training.beans;

public class InsuranceType {
	private double plastic;
	private double metal;
	private double labour;
	private String insuranceType;
	public InsuranceType(double plastic, double metal, double labour, String insuranceType) {
		super();
		this.plastic = plastic;
		this.metal = metal;
		this.labour = labour;
		this.insuranceType = insuranceType;
	}
	public InsuranceType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPlastic() {
		return plastic;
	}
	public void setPlastic(double plastic) {
		this.plastic = plastic;
	}
	public double getMetal() {
		return metal;
	}
	public void setMetal(double metal) {
		this.metal = metal;
	}
	public double getLabour() {
		return labour;
	}
	public void setLabour(double labour) {
		this.labour = labour;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	@Override
	public String toString() {
		return "InsuranceType [plastic=" + plastic + ", metal=" + metal + ", labour=" + labour + ", insuranceType="
				+ insuranceType + "]";
	}
	
	
}
