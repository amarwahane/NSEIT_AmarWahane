package com.example.customerserive.service;

import java.util.List;

import com.example.customerserive.model.Customer;
import com.example.customerserive.model.OrderDto;


public interface CustomerService {
	
	public String insertCustomer(Customer cust);
	public List<Customer> displayAllCustomer();
	public String deleteCustomer(int pid);
	public List<Customer> searchCustomerByCustomerName(String cname);
	public List<Customer> searchCustromerByProduct(String pname);
	
	public List<OrderDto> searchOrderByOid(int oid);
	

}
