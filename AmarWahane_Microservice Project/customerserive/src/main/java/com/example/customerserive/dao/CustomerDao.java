package com.example.customerserive.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.customerserive.model.Customer;
import com.example.customerserive.model.OrderDto;


@Repository
@Transactional

public interface CustomerDao extends JpaRepository<Customer,Integer>{

	@Query("select c from Customer c.cname=?1")
	public List<Customer> searchCustomerByCustomerName(String cname);
	
	@Query("select c from Customer c.pname=?1")
	public List<Customer> searchCustromerByProduct(String pname);

	public List<OrderDto> searchOrderByOid(int oid);
	
	
	
}
