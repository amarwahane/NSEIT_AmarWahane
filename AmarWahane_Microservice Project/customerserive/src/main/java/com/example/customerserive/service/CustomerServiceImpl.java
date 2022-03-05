package com.example.customerserive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerserive.dao.CustomerDao;
import com.example.customerserive.model.Customer;
import com.example.customerserive.model.OrderDto;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;
	
	@Autowired
	CustomerFeignProxy proxy;
	
	
	
	
	@Override
	public String insertCustomer(Customer cust) {
		// TODO Auto-generated method stub
		dao.save(cust);
		return "Customer Inserted";
	}

	@Override
	public List<Customer> displayAllCustomer() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

	@Override
	public String deleteCustomer(int pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
		return "Customer deleted";
	}

	@Override
	public List<Customer> searchCustomerByCustomerName(String cname) {
		// TODO Auto-generated method stub
		dao.searchCustomerByCustomerName(cname);
		return dao.searchCustomerByCustomerName(cname);
	}

	@Override
	public List<Customer> searchCustromerByProduct(String pname) {
		// TODO Auto-generated method stub
		return dao.searchCustromerByProduct(pname);
	}

	@Override
	public List<OrderDto> searchOrderByOid(int oid) {
		// TODO Auto-generated method stub
		return dao.searchOrderByOid(oid);
	}

}
