package com.fooddelivery.entities;

public class Resturant {
	
	private int resturantId;
	private String resturantName;
	private String resturantAddress;
	
	
	public int getResturantId() {
		return resturantId;
	}
	public void setResturantId(int resturantId) {
		this.resturantId = resturantId;
	}
	public String getResturantName() {
		return resturantName;
	}
	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}
	public String getResturantAddress() {
		return resturantAddress;
	}
	public void setResturantAddress(String resturantAddress) {
		this.resturantAddress = resturantAddress;
	}
	
	public Resturant(int resturantID,String resturantName, String resturantAddress) {
		super();
		this.resturantId=resturantID;
		this.resturantName = resturantName;
		this.resturantAddress = resturantAddress;
	}
	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Resturant [resturantId=" + resturantId + ", resturantName=" + resturantName + ", resturantAddress="
				+ resturantAddress + "]";
	}
	
	
	

}
