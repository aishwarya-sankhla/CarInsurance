package com.training.beans;
import java.util.*;

public class EstimateWithTotal {
	private List<Estimate> allEstimate;
	private double maxClaimable;
	
	public EstimateWithTotal() {
		super();
		
	}
	

	public EstimateWithTotal(List<Estimate> allEstimate, double maxClaimable, double grandTotal) {
		super();
		this.allEstimate = allEstimate;
		this.maxClaimable = maxClaimable;
		this.grandTotal = grandTotal;
	}

	public EstimateWithTotal(List<Estimate> allEstimate, double grandTotal) {
		super();
		this.allEstimate = allEstimate;
		this.grandTotal = grandTotal;
	}
	
	@Override
	public String toString() {
		return "EstimateWithTotal [allEstimate=" + allEstimate + ", grandTotal=" + grandTotal + "]";
	}
	
	public double getMaxClaimable() {
		return maxClaimable;
	}

	public void setMaxClaimable(double maxClaimable) {
		this.maxClaimable = maxClaimable;
	}
	private double grandTotal;
	public List<Estimate> getAllEstimate() {
		return allEstimate;
	}
	public void setAllEstimate(List<Estimate> allEstimate) {
		this.allEstimate = allEstimate;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
}
