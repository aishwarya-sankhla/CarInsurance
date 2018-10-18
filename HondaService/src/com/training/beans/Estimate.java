package com.training.beans;

public class Estimate {
	
	private String serviceType;
	
	private double claimedLabour;
	private double finalLabour;
	private double labour;
	
	private double claimedMetal;
	private double finalMetal;
	private double metal;

	private double claimedPlastic;
	private double finalPlastic;
	private double plastic;
	public Estimate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Estimate(String serviceType, double claimedLabour, double finalLabour, double labour, double claimedMetal,
			double finalMetal, double metal, double claimedPlastic, double finalPlastic, double plastic) {
		super();
		this.serviceType = serviceType;
		this.claimedLabour = claimedLabour;
		this.finalLabour = finalLabour;
		this.labour = labour;
		this.claimedMetal = claimedMetal;
		this.finalMetal = finalMetal;
		this.metal = metal;
		this.claimedPlastic = claimedPlastic;
		this.finalPlastic = finalPlastic;
		this.plastic = plastic;
	}
	public double getClaimedLabour() {
		return claimedLabour;
	}
	public void setClaimedLabour(double claimedLabour) {
		this.claimedLabour = claimedLabour;
	}
	public double getFinalLabour() {
		return finalLabour;
	}
	public void setFinalLabour(double finalLabour) {
		this.finalLabour = finalLabour;
	}
	public double getLabour() {
		return labour;
	}
	public void setLabour(double labour) {
		this.labour = labour;
	}
	public double getClaimedMetal() {
		return claimedMetal;
	}
	public void setClaimedMetal(double claimedMetal) {
		this.claimedMetal = claimedMetal;
	}
	public double getFinalMetal() {
		return finalMetal;
	}
	public void setFinalMetal(double finalMetal) {
		this.finalMetal = finalMetal;
	}
	public double getMetal() {
		return metal;
	}
	public void setMetal(double metal) {
		this.metal = metal;
	}
	public double getClaimedPlastic() {
		return claimedPlastic;
	}
	public void setClaimedPlastic(double claimedPlastic) {
		this.claimedPlastic = claimedPlastic;
	}
	public double getFinalPlastic() {
		return finalPlastic;
	}
	public void setFinalPlastic(double finalPlastic) {
		this.finalPlastic = finalPlastic;
	}
	public double getPlastic() {
		return plastic;
	}
	public void setPlastic(double plastic) {
		this.plastic = plastic;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	@Override
	public String toString() {
		return "Estimate [claimedLabour=" + claimedLabour + ", finalLabour=" + finalLabour + ", labour=" + labour
				+ ", claimedMetal=" + claimedMetal + ", finalMetal=" + finalMetal + ", metal=" + metal
				+ ", claimedPlastic=" + claimedPlastic + ", finalPlastic=" + finalPlastic + ", plastic=" + plastic
				+ "]";
	}

	

	

	
}
