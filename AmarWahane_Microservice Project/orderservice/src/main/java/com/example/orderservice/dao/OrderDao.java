package com.example.orderservice.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.orderservice.model.Order;

@Repository
@Transactional
public interface OrderDao extends JpaRepository<Order,Integer> {
	
	@Query("select o from Order o.pname=?1")
	public List<Order> searchOrderByProductName(String pname);
	
	@Query("select o from Order o.oid=?1")
	public List<Order> searchPrductByOid(int oid);

}
