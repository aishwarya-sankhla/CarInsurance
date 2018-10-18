package com.training.beans;

public class InsuranceRate {
	private String insuranceType;
	private double labour;
	private double plastic;
	private double metal;
	public InsuranceRate() {
		super();
	}
	@Override
	public String toString() {
		return "InsuranceRate [insuranceType=" + insuranceType + ", labour=" + labour + ", plastic=" + plastic
				+ ", metal=" + metal + "]";
	}
	public InsuranceRate(String insuranceType, double labour, double plastic, double metal) {
		super();
		this.insuranceType = insuranceType;
		this.labour = labour;
		this.plastic = plastic;
		this.metal = metal;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public double getLabour() {
		return labour;
	}
	public void setLabour(double labour) {
		this.labour = labour;
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
	
	
}
