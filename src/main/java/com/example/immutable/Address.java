package com.example.immutable;

public class Address {
	
	String vill;
	String post;
	int pincode;
	
	Address()
	{
		
	}
	Address(String a,String b,int c)
	{
		this.vill=a;
		this.post=b;
		this.pincode=c;
	}
	
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [vill=" + vill + ", post=" + post + ", pincode=" + pincode + "]";
	}
	
}
