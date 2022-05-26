package com.examples.java;

abstract class Shopping {
	Shopping(){
		System.out.println("Shopping is started...");
	}
	public void selectGoods() {
		System.out.println("Goods are selected throgh www.xyz.com");
	}

	public abstract void payment();

	public void shipment() {
		// code for shipment through DTDC courier
		System.out.println("shipment is through DTDC ");
	}
}

class CashShops extends Shopping{

	public void payment(){
		// code for cash payment;
		System.out.println("Payment is done through cash only");
  }
}

class CardShops extends Shopping{

	
	@Override
	public void payment() {
		System.out.println("Payment is done through cards only...");
		
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		CardShops shop1 = new CardShops();
		shop1.selectGoods();
		shop1.payment();
		shop1.shipment();
		CashShops shop2 = new CashShops();
		shop2.selectGoods();
		shop2.payment();
		shop2.shipment();

	}

}
