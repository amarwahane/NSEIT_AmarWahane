package com.example.customerserive.model;

import javax.persistence.Id;

public class OrderDto {
	
	int oid;
	
	int cid;
	
	String pname;
	
	int price;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(int oid, int cid, String pname, int price) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.pname = pname;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
