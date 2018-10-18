package com.training.ifaces;

import java.util.HashMap;
import java.util.List;

import com.training.beans.Car;
import com.training.beans.CarServices;
import com.training.beans.Customer;
import com.training.beans.Employee;
import com.training.beans.ServiceDetail;
import com.training.beans.ServiceLog;

public interface DAO {
	int addEmployee(Employee emp);
	int validateEmployee(String eid, String password);
	int addNewCustomer(Customer cust);
	List<Customer> getAllCustomers();
	List<Customer> getAllCustomersWithCars();
	List<Car> getCarsOfCustomer(int cid);
	List<CarServices> getServices();
	int addNewCar(String cid,Car car);
	int addNewService(ServiceDetail serviceDetail);
	CarServices getCarServiceRate(String serviceType);
	HashMap<String, List<ServiceLog>> getServiceLogByRegno(String regno);
	int updatePhone (Customer cust,String newPhone);
}
