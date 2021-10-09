package com.example.singleton;

public class Address {
	
	String hno;
	String town;
	int pincode;
	
	public Address(String a,String b,int c)
	{
		this.hno=a;
		this.town=b;
		this.pincode=c;
	}
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
