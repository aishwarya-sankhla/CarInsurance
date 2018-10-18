package com.training.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.beans.Car;
import com.training.beans.Customer;
import com.training.beans.Employee;
import com.training.beans.Estimate;
import com.training.beans.EstimateWithTotal;
import com.training.beans.InsuranceDetails;
import com.training.beans.InsuranceRate;
import com.training.beans.ServiceDetail;
import com.training.client.InsuranceCall;
import com.training.ifaces.DAO;
import com.training.impl.DAOImpl;
import com.training.utils.CalculateEstimate;


@Path("/service")
public class ServiceResources {
	
	
	private DAO dao;
	public ServiceResources() {
		 dao=new DAOImpl();
	}

	@POST
	@Path("reg")
	public void addEmployee(@FormParam("name") String name, @FormParam("eid") String eid, @FormParam("password") String password, @Context HttpServletRequest request, @Context HttpServletResponse response ){

		Employee emp=new Employee(eid, name, password);
		int status = dao.addEmployee(emp);
		if(status==1){

			  try {
				  request.getSession().setAttribute("message", "");
				  response.sendRedirect("/MarutiServiceCenter/login.jsp");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		else{
			try {
				request.getSession().setAttribute("message", "try again");
				response.sendRedirect("/MarutiServiceCenter/index.jsp");
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	@POST
	@Path("login")
	public void loginEmployee(@FormParam("eid") String eid, @FormParam("password") String password, @Context HttpServletRequest request, @Context HttpServletResponse response ){
	
		
		int status = dao.validateEmployee(eid, password);
		if(status==1){
			
			  try {
				  request.getSession().setAttribute("validated", "yes");
				  response.sendRedirect("/MarutiServiceCenter/mainpage.jsp");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		else{
			try {
				response.sendRedirect("/MarutiServiceCenter/login.jsp");
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}		
		
	}
	
	
	
	@POST
	@Path("addcust")
	public void registerName(@FormParam("custName") String custName, @FormParam("phone") String phone,@FormParam("regno") String regno ,@FormParam("modelName") String modelName, @Context HttpServletRequest request, @Context HttpServletResponse response){
		Car car = new Car(regno, modelName);
		List<Car> carList = new ArrayList<>();
		carList.add(car);
		Customer cust = new Customer(custName, phone, carList);
		int status = dao.addNewCustomer(cust);
		if(status==1){
			  try {
				  response.sendRedirect("/MarutiServiceCenter/mainpage.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				response.sendRedirect("/MarutiServiceCenter/login.jsp");
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
		
	}
	
	@POST
	@Path("addcar")
	public void addCar(@FormParam("customers") String cid, @FormParam("regno") String regno,@FormParam("modelName") String modelName , @Context HttpServletRequest request, @Context HttpServletResponse response){
		Car car = new Car(regno, modelName);
		int status = dao.addNewCar(cid, car);
		if(status==1){
			  try {
				  response.sendRedirect("/MarutiServiceCenter/mainpage.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				response.sendRedirect("/MarutiServiceCenter/login.jsp");
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	@GET
	@Path("getallcust")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCustomer(){
		
		return Response.status(200).entity(dao.getAllCustomers()).build();
		
	}
	
	
	
	//Retrieve Customer Details which includes the car details
	@GET
	@Path("getservices")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getServices(){
		
		return Response.status(200).entity(dao.getServices()).build();
		
	}
	
	//retreive all cars for the cid
	@GET
	@Path("getcustcars/{cid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCustomerWithCars(@PathParam(value = "cid") int cid){
		
		return Response.status(200).entity(dao.getCarsOfCustomer(cid)).build();
		
	}
	
	@POST
	@Path("addservice")
	public void addService(@FormParam("customers") String cid, @FormParam("regno") String regno,@FormParam("service") List<String> services, @FormParam("estimatedDelivery") String estimatedDelivery ,@FormParam("serviceDate") String serviceDate, @FormParam("claimStatus") String claimStatus){
	
		
		for (String serviceType : services) {
			ServiceDetail serviceDetail =new ServiceDetail(serviceType, serviceDate, estimatedDelivery, regno);
			dao.addNewService(serviceDetail);
		}
		if(claimStatus.equals("y")){
			System.out.println("--------------------------------------");
			InsuranceCall insuranceCall = new InsuranceCall();
			insuranceCall.registerClaim(regno, serviceDate, "Maruti Service" );
		}
	
	}
	
	@GET
	@Path("getestimate/{regno}/{claimStatus}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEstimate(@QueryParam("services") String services,@PathParam("regno") String regno, @PathParam("claimStatus") String claimStatus){
		String[] serviceArray = services.split(",");
		CalculateEstimate calculateEstimate = new CalculateEstimate();
		List<Estimate> est;
		double grandTotal;
		double maxClaimable=0.0;
		EstimateWithTotal estimateWithTotal = null;
		if(claimStatus.equals("y")){
			InsuranceCall insuranceCall = new InsuranceCall();
			if(insuranceCall.callClient(regno)!=-1){
				InsuranceDetails insuranceDetails =  insuranceCall.getInsuranceDetails();
				InsuranceRate insuranceRate =  insuranceCall.getInsuranceRates();
				maxClaimable = insuranceDetails.getMaxCoverage();
				est = calculateEstimate.calculate(serviceArray, insuranceDetails, insuranceRate);
				
				grandTotal=calculateEstimate.calculateGrandTotal(insuranceDetails, est);
				estimateWithTotal = new EstimateWithTotal(est,maxClaimable , grandTotal);
				
				
			}
			else{
				est = calculateEstimate.calculate(serviceArray);
				grandTotal= calculateEstimate.calculateGrandTotal( est);
				estimateWithTotal = new EstimateWithTotal(est,grandTotal);
			}
		}
		else{
			est = calculateEstimate.calculate(serviceArray);
			grandTotal =calculateEstimate.calculateGrandTotal(est);
			estimateWithTotal = new EstimateWithTotal(est,grandTotal);
		}
		
		return Response.status(200).entity(estimateWithTotal).build();
		
		
	}
	
	/**
	 * Service records by regno
	 */
	@GET
	@Path("servicerecs/{regno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getServiceByReg(@PathParam("regno") String regno){
		
		return Response.status(200).entity(dao.getServiceLogByRegno(regno)).build();
		
	}
	
	/**
	 * update phone number of a customer
	 */
	@PUT
	@Path("updatePhone")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateDonor(Customer customer,@QueryParam("newPhone") String newPhone){
		int updated = dao.updatePhone(customer, newPhone);
		if(updated ==1){
			return Response.status(200).build();
		}
		else{
			return Response.status(400).build();
		}
		
	}
	
}
