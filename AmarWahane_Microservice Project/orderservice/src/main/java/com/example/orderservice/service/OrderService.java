package com.example.orderservice.service;

import java.util.List;

import com.example.orderservice.model.Order;

public interface OrderService {
	
	public String insertOrder(Order ord);
	public List<Order> displayAllOrder();
	public String deleteOrder(int oid);
	
	public List<Order> searchOrderByProductName(String pname);
	
	public List<Order> searchPrductByOid(int oid);
	
	
	
	

}
