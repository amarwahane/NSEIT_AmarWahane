package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.dao.OrderDao;
import com.example.orderservice.model.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao dao;

	@Override
	public String insertOrder(Order ord) {
		// TODO Auto-generated method stub
		dao.save(ord);
		return "Order added";
	}

	@Override
	public List<Order> displayAllOrder() {
		// TODO Auto-generated method stub
		
		
		return dao.findAll();
	}

	@Override
	public String deleteOrder(int oid) {
		// TODO Auto-generated method stub
		
		dao.deleteById(oid);
		
		return "Order delete";
	}

	@Override
	public List<Order> searchOrderByProductName(String pname) {
		// TODO Auto-generated method stub
		
		return dao.searchOrderByProductName(pname);
	}

	@Override
	public List<Order> searchPrductByOid(int oid) {
		// TODO Auto-generated method stub
		return dao.searchPrductByOid(oid);
	}

}
