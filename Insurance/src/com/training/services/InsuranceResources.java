package com.training.services;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.training.beans.InsuranceInfo;
import com.training.beans.InsuranceType;
import com.training.beans.LogClaimInfo;
import com.training.ifaces.Dao;
import com.training.impl.DaoImpl;


@Path("/insurance")
public class InsuranceResources {
	
	private Dao dao;
	
	public InsuranceResources() {
		dao=new DaoImpl();
	}

	@GET
	@Path("/{regNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInsuranceDetails(@PathParam("regNo")  String regNo){
		InsuranceInfo info=dao.getInsuranceInfo(regNo);
		return Response.status(200).entity(info).build();
	}
	
	@GET
	@Path("rates/{insuranceType}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInsuranceTypeInfo(@PathParam("insuranceType")  String insuranceType){
		InsuranceType  insuranceTypeInfo=dao.getInsuranceTypeInfo(insuranceType);
		return Response.status(200).entity(insuranceTypeInfo).build();
	}
	
	
	@POST
	@Path("/logClaim")
	public void addClaimLog(String logClaimInfo){
		Gson gson = new Gson();
		gson.fromJson(logClaimInfo, LogClaimInfo.class);
		Logger log= Logger.getLogger("second");
		
		log.info(logClaimInfo);
	}
	

}
