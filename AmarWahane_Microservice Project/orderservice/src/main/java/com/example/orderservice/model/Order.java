package com.example.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//use to tell tht class has table form of data
@Entity
//use to give table name 
@Table(name="order")
public class Order {
	
	int oid;
	int cid;
	String productName;
	
	int price;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int oid, int cid, String productName, int price) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.productName = productName;
		this.price = price;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
