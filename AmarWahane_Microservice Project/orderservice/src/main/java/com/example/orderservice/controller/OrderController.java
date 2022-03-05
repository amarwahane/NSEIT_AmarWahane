package com.example.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.orderservice.model.Order;
//import com.example.commentservice.service.CommentService;
import com.example.orderservice.service.OrderService;

@RestController
@RequestMapping("/comment")


public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping("/all")
	public List<Order> showAll(){
		return service.displayAllOrder();
	}
	
	@PostMapping("/add")
	public String addOrder(@RequestBody Order ord) {
		return service.insertOrder(ord);
	}
	
	@DeleteMapping("/delete/{oid}")
	public String deleteorder(@PathVariable("oid") int oid) {
		return service.deleteOrder(oid);
	}
	
	@GetMapping("/commenter/{pname}")
	public List<Order> searchOrderByProductName(@PathVariable("pname") String productName) {
			return service.searchOrderByProductName(productName);
	}
	
	@GetMapping("/pid/{oid}")
	public List<Order> searchPrductByOid(@PathVariable("oid") int oid) {
			return service.searchPrductByOid(oid);
	}
	
}
