package com.example.customerserive.service;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-service", url="http://localhost:8072/")
public interface CustomerFeignProxy {
	
	@GetMapping("comment/oid/{oid}")
	public List<Order> findProductByPid(@PathVariable int oid);
	
	@GetMapping("/getmicro2")
	  public String getMicro2Instance();
		
		

}
