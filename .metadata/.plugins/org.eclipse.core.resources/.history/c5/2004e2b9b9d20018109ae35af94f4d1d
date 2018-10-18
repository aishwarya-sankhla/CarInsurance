package com.training.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;

import com.google.gson.Gson;
import com.training.beans.InsuranceDetails;
import com.training.beans.InsuranceRate;
import com.training.beans.LogClaimInfo;

public class InsuranceCall {

private  InsuranceDetails insuranceDetails;
private InsuranceRate insuranceRates;

private HttpURLConnection connection;
	
public int callClient(String regno){
	int result=1;
	URL url,url2;
	BufferedReader reader = null;
	try {
		
			url = new URL("http://localhost:8080/InsuranceRestService/rest/insurance/"+regno);
		
			connection = (HttpURLConnection) url.openConnection(); 
	        connection.setDoOutput(true); 
	        connection.setInstanceFollowRedirects(false); 
	        connection.setRequestMethod("GET");
	        
	     
	        reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        StringBuilder jsonStr = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	        	jsonStr.append(line);
	        }
	       
	        Gson gson = new Gson(); 
	        try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	        System.out.println(jsonStr);
	        insuranceDetails = gson.fromJson(jsonStr.toString(), InsuranceDetails.class);
	        if(insuranceDetails==null){
	        	return -1;
	        }
	        try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	     
	        
	    	url2 = new URL("http://localhost:8080/InsuranceRestService/rest/insurance/rates/"+insuranceDetails.getInsuranceType());
	    	connection = (HttpURLConnection) url2.openConnection(); 
	        connection.setDoOutput(true); 
	        connection.setInstanceFollowRedirects(false); 
	        connection.setRequestMethod("GET");
	        
	     
	        reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        StringBuilder jsonStr1 = new StringBuilder();
	        String line1;
	        while ((line1 = reader.readLine()) != null) {
	        	jsonStr1.append(line1);
	        }
	        	
	        insuranceRates = gson.fromJson(jsonStr1.toString(), InsuranceRate.class);
	        
	} catch (MalformedURLException e) {
	
			e.printStackTrace();
		
	} catch (ProtocolException e) {
		
			e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
	finally{
		try {
			reader.close();
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	return result;
}


public void registerClaim(String regno, String dateOfRequest, String serviceCenter){
	URL url;
	try {
		
		url = new URL("http://localhost:8080/InsuranceRestService/rest/insurance/logClaim");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setReadTimeout(10000);
		conn.setConnectTimeout(15000);
		conn.setRequestMethod("POST");
		conn.setDoInput(true);
		conn.setDoOutput(true);
	    
	    LogClaimInfo logClaimInfo = new LogClaimInfo(regno, dateOfRequest, serviceCenter);
	    Gson gson = new Gson();
	    String jsonStr = gson.toJson(logClaimInfo);
	    System.out.println(jsonStr);
	    OutputStream os = conn.getOutputStream();
	    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
	    writer.write(jsonStr.toString());
	    writer.close();
	    conn.connect();
	    System.out.println(conn.getResponseCode());
	    
	} catch (MalformedURLException e) {

		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
	
	
}

public InsuranceDetails getInsuranceDetails() {
	return insuranceDetails;
}

public InsuranceRate getInsuranceRates() {
	return insuranceRates;
}





}
