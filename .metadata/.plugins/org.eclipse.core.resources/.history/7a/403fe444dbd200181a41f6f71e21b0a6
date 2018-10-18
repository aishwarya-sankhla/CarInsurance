package com.training.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.training.beans.Car;
import com.training.beans.CarServices;
import com.training.beans.Customer;
import com.training.beans.Employee;
import com.training.beans.ServiceDetail;
import com.training.beans.ServiceLog;
import com.training.ifaces.DAO;
import com.training.utils.DbConnection;


import java.util.*;

public class DAOImpl implements DAO{

	private Connection conn;
	public DAOImpl() {
		DbConnection dbConnection=new DbConnection();
		try {
			conn=dbConnection.getConnection();
		} catch (NamingException | SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public int addEmployee(Employee emp) {
		int status=0;
		String sql="insert into service_employee_ri values(?,?,?)";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, emp.getEid());
			pstm.setString(2, emp.getName());
			pstm.setString(3,emp.getPassword());
			status = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return status;
		
		
	}

	@Override
	public int validateEmployee(String eid,String password) {
		
		int status=0;
		String sql="select * from service_employee_ri where eid=?";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, eid);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				String pass = rs.getString("paswd");
				if(pass.equals(password))
					status=1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return status;
		
	}

	@Override
	public int addNewCustomer(Customer cust) {
		CallableStatement callableStatement = null;
		int status=0;
		//pname,email,cat1,contact_no,type1,statusout
		String sql = "{call newCustomerRi(?,?,?,?,?)}";
	
			try {
				callableStatement = conn.prepareCall(sql);

				callableStatement.setString(1, cust.getCustName());
				callableStatement.setString(2, cust.getPhone());
				
				String carModel = null;
				String carRegNo = null;
				List<Car> carList= cust.getCarList();
				for (Car car : carList) {
					carModel=car.getModelName();
					carRegNo= car.getRegno();
				}
				callableStatement.setString(3, carRegNo);
				callableStatement.setString(4, carModel);
				
				
				
				callableStatement.registerOutParameter(5, java.sql.Types.NUMERIC);
				callableStatement.execute();
				status = callableStatement.getInt(5);
				System.out.println(status);
		
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			finally{
				try {
					callableStatement.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		
			
	
		return status;
	}

	@Override
	public List<Customer> getAllCustomers() {
		String sql = "select distinct * from SERVICE_CUSTOMER_RI";
		List<Customer> custList= new ArrayList<>();
		try {
			PreparedStatement psmst = conn.prepareStatement(sql);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
				int cid = rs.getInt("cid");
				String custname = rs.getString("custname");
				String phone = rs.getString("phone");
				
				Customer cust = new Customer(cid, custname, phone);
				custList.add(cust);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return custList;
	}

	@Override
	public int addNewCar(String cid, Car car) {
		String sql = "insert into CUSTOMER_CARS_RI values(?,?,?)";
		int added=0;
		try {
			PreparedStatement psmst = conn.prepareStatement(sql);
			psmst.setString(1, cid);
			psmst.setString(2, car.getRegno());
			psmst.setString(3, car.getModelName());
			added = psmst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return added;
	}

	@Override
	public List<Customer> getAllCustomersWithCars() {
		
		String sql = "select * from SERVICE_CUSTOMER_RI NATURAL JOIN CUSTOMER_CARS_RI";
		List<Customer> custList= new ArrayList<>();
		
		try {
			PreparedStatement psmst = conn.prepareStatement(sql);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
				int cid = rs.getInt("cid");
				String custname = rs.getString("custname");
				String phone = rs.getString("phone");
				
				String regno=rs.getString("regno");
				String modelName=rs.getString("modelname");
				
				Car car = new Car(regno, modelName);
				int flag=0;
				for (Customer customer : custList) {
					if(customer.getCid()==cid){
						customer.getCarList().add(car);
						flag=1;
					}
				}
				if(flag==0){
					List<Car> carListForCust = new ArrayList<>();
					carListForCust.add(car);
 					Customer cust = new Customer(cid, custname, phone,carListForCust);
					custList.add(cust);
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return custList;
		
	}

	@Override
	public List<Car> getCarsOfCustomer(int cid) {
		String sql = "select CUSTOMER_CARS_RI.REGNO,CUSTOMER_CARS_RI.MODELNAME from CUSTOMER_CARS_RI where CID=?";
		List<Car> carList= new ArrayList<>();
		
		try {
			PreparedStatement psmst = conn.prepareStatement(sql);
			psmst.setInt(1, cid);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
		
		
				String regno=rs.getString("regno");
				String modelName=rs.getString("modelname");
				
				Car car = new Car(regno, modelName);
				carList.add(car);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return carList;
		
	}

	@Override
	public List<CarServices> getServices() {
		String sql = "select * from SERVICES_RI";
		List<CarServices> serviceList= new ArrayList<>();
		try {
			PreparedStatement psmst = conn.prepareStatement(sql);
			ResultSet rs = psmst.executeQuery();
			
			while(rs.next()){
				String serviceType = rs.getString("service_type");
				String plastic = rs.getString("plastic");
				String metal = rs.getString("metal");
				String labour = rs.getString("labour");
				String covered = rs.getString("covered");
				
				CarServices service = new CarServices(serviceType, plastic, metal, labour, covered);
				serviceList.add(service);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return serviceList;
	}

	@Override
	public int addNewService(ServiceDetail serviceDetail) {
		/*
		SERVICE_ID        
		SERVICE_TYPE       
		SERVICE_DATE       
		DELIVERY_DATE     
		REGNO
		*/       
		int status=0;
		String sql="insert into service_log_ri values(service_id_ri.nextval,?,?,?,?)";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, serviceDetail.getServiceType());
			pstm.setString(2, serviceDetail.getServiceDate());
			pstm.setString(3,serviceDetail.getEstimatedDelivery());
			pstm.setString(4, serviceDetail.getRegno());
			
			
			status = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

		return status;
	}

	@Override
	public CarServices getCarServiceRate(String serviceType) {
	/**	
		SERVICE_TYPE NOT NULL VARCHAR2(30) 
		COVERED               VARCHAR2(1)  
		PLASTIC               NUMBER       
		METAL                 NUMBER       
		LABOUR                NUMBER      
	**/	
		String sql = "select * from SERVICES_RI where SERVICE_TYPE=?";
		PreparedStatement pstm;
		CarServices carServices=null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, serviceType);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				String covered = rs.getString("COVERED");
				String plastic = rs.getString("PLASTIC");
				String metal = rs.getString("METAL");
				String labour = rs.getString("LABOUR");
				System.out.println(covered);
				carServices = new CarServices(serviceType, plastic, metal, labour, covered);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return carServices;
	}

	@Override
	public HashMap<String, List<ServiceLog>> getServiceLogByRegno(String regno) {
		/**
		 * Get services by regno
		 *  SERVICE_ID         NUMBER       
			SERVICE_TYPE       VARCHAR2(30) 
			SERVICE_DATE       VARCHAR2(20) 
			DELIVERY_DATE      VARCHAR2(20) 
			REGNO              VARCHAR2(12) 
		 */
		HashMap< String, List<ServiceLog>> serviceWithDate = new HashMap<>();
		String sql = "select * from SERVICE_LOG_RI where REGNO=? ORDER BY SERVICE_DATE";
		try {

			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, regno);
			ResultSet rs= pstm.executeQuery();
			while(rs.next()){
				int serviceId = rs.getInt("SERVICE_ID");
				String serviceType = rs.getString("SERVICE_TYPE");
				String deliveryDate = rs.getString("DELIVERY_DATE");
				String serviceDate = rs.getString("SERVICE_DATE");
				
				ServiceLog serviceLog = new ServiceLog(serviceId, serviceType, serviceDate, deliveryDate, regno);
				if(serviceWithDate.containsKey(serviceDate)){
					List<ServiceLog> serviceLogList = serviceWithDate.get(serviceDate);
					serviceLogList.add(serviceLog);
				}
				else{
					List<ServiceLog> serviceLogList = new ArrayList<>();
					serviceLogList.add(serviceLog);
					serviceWithDate.put(serviceDate, serviceLogList);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		return serviceWithDate;
	}

	@Override
	public int updatePhone(Customer cust, String newPhone) {
		String sql = "UPDATE SERVICE_CUSTOMER_Ri Set phone = ? where cid = ?";
		int updated = 0;
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, newPhone);
			pstm.setInt(2, cust.getCid());
			updated = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updated;
	}
	
}
