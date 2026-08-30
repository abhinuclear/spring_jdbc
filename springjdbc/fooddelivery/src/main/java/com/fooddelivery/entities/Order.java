package com.fooddelivery.entities;

public class Order {
	private int orderId;
	private String orderName;
	private String orderAddress;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	} 
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	
	
	public Order(String orderName, String orderAddress) {
		super();
		this.orderName = orderName;
		this.orderAddress = orderAddress;
	}
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderAddress=" + orderAddress + "]";
	}
	

}
