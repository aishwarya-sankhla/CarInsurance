package com.training.utils;
import java.util.*;

import com.training.beans.CarServices;
import com.training.beans.Estimate;
import com.training.beans.InsuranceDetails;
import com.training.beans.InsuranceRate;
import com.training.ifaces.DAO;
import com.training.impl.DAOImpl;
public class CalculateEstimate {
	private DAO dao;
	private List<Estimate> estimateList;
	public CalculateEstimate() {
		dao=new DAOImpl();
		estimateList = new ArrayList<>();
	}

	public  List<Estimate> calculate(String[] services){
		

		for (String serviceType : services) {
			System.out.println(serviceType);
			CarServices carServices=  dao.getCarServiceRate(serviceType);
			double labour = Double.parseDouble(carServices.getLabour());
		
			double claimedLabour = 0.0;
			double finalLabour = labour-claimedLabour;
		
			double plastic = Double.parseDouble(carServices.getPlastic());
			System.out.println(plastic);
			double claimedPlastic = 0.0;
			double finalPlastic = plastic-claimedPlastic;
		
		
			double metal = Double.parseDouble(carServices.getMetal());
			double claimedMetal = 0.0;
			double finalMetal = metal-claimedMetal;
			Estimate estimate = new Estimate(serviceType,claimedLabour, finalLabour, labour, 
					claimedMetal, finalMetal, metal, claimedPlastic, finalPlastic, plastic);
			estimateList.add(estimate);
		}
		return estimateList;
	}
	
	public  List<Estimate> calculate(String[] services, InsuranceDetails insuranceDetails, InsuranceRate insuranceRate){
		
		
		for (String serviceType : services) {
			System.out.println(serviceType);
			CarServices carServices=  dao.getCarServiceRate(serviceType);
			System.out.println(carServices);
			if(carServices.getCovered().equals("y")){
				double labour = Double.parseDouble(carServices.getLabour());
				System.out.println(labour);
				double claimedLabour = (insuranceRate.getLabour()/100)*labour;
				double finalLabour = labour-claimedLabour;
				
				double plastic = Double.parseDouble(carServices.getPlastic());
				System.out.println(plastic);
				double claimedPlastic = (insuranceRate.getPlastic()/100)*plastic;
				double finalPlastic = plastic-claimedPlastic;
				
				
				double metal = Double.parseDouble(carServices.getMetal());
				double claimedMetal = (insuranceRate.getMetal()/100)*metal;
				double finalMetal = metal-claimedMetal;
				
				Estimate estimate = new Estimate(serviceType,claimedLabour, finalLabour, labour, 
						claimedMetal, finalMetal, metal, claimedPlastic, finalPlastic, plastic);
				estimateList.add(estimate);
				
			}
			else{
				double labour = Double.parseDouble(carServices.getLabour());
				
				double claimedLabour = 0.0;
				double finalLabour = labour-claimedLabour;
				
				double plastic = Double.parseDouble(carServices.getPlastic());
				System.out.println(plastic);
				double claimedPlastic = 0.0;
				double finalPlastic = plastic-claimedPlastic;
				
				
				double metal = Double.parseDouble(carServices.getMetal());
				double claimedMetal = 0.0;
				double finalMetal = metal-claimedMetal;
				Estimate estimate = new Estimate(serviceType,claimedLabour, finalLabour, labour, 
						claimedMetal, finalMetal, metal, claimedPlastic, finalPlastic, plastic);
				estimateList.add(estimate);
			}
		}
		return estimateList;
		
	}
	
	public double calculateGrandTotal(InsuranceDetails insuranceDetails, List<Estimate> estimates){
		double maxCoverage = insuranceDetails.getMaxCoverage();
		double totalClaimableAmt =0.0;
		double totalAmt = 0.0;
		double grandTotal = 0.0;
		
		
		for (Estimate estimate : estimates) {
			totalAmt = totalAmt + estimate.getLabour()+estimate.getMetal()+estimate.getPlastic();
			totalClaimableAmt = totalClaimableAmt + estimate.getClaimedLabour()+estimate.getClaimedMetal()+estimate.getClaimedPlastic();
		}
		
		if(totalClaimableAmt>maxCoverage){
			grandTotal = totalAmt - maxCoverage;
		}
		else
			grandTotal = totalAmt - totalClaimableAmt;
		return grandTotal;
	}
	
	
	public double calculateGrandTotal(List<Estimate> estimates){
	
		
		double totalAmt = 0.0;
	
		
		
		for (Estimate estimate : estimates) {
			totalAmt = totalAmt + estimate.getLabour()+estimate.getMetal()+estimate.getPlastic();
			
		}
		

		return totalAmt;
	}
	
}
