package com.example.customerserive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerserive.model.Customer;
import com.example.customerserive.model.OrderDto;
import com.example.customerserive.service.CustomerFeignProxy;
import com.example.customerserive.service.CustomerService;




@RestController
@RequestMapping("/customer")
public class CustomerSreviceController {
	
	
	
	@Autowired
	CustomerService service;
	
	@PostMapping("/add")
	public String addPost(@RequestBody Customer cust) {
		
		return service.insertCustomer(cust);
		
	}
	
	@GetMapping("/all")
	public List<Customer> showAll(){
		return service.displayAllCustomer();
		
	}
	@DeleteMapping("/delete/{cid}")
	public String deletePost(@PathVariable("cid") int cid) {
		
		return service.deleteCustomer(cid);
		
	}
	@GetMapping("/cname/{cname}")
	public List<Customer> searchCustomerByCustomerName(@PathVariable("cname") String cname){
		return service.searchCustomerByCustomerName(cname);
		
	}
	@GetMapping("/pname/{pname}")
	public List<Customer> searchCustromerByProduct(@PathVariable("pname") String pname){
		return service.searchCustromerByProduct(pname);
		
	}
	
	@GetMapping("/order/{oid}")
	public List<OrderDto> findByOid(@PathVariable("oid")int oid){
		
		return service.searchOrderByOid(oid);
	}
	
	
	
}
