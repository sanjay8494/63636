package com.xworkz.sanju;

public class Email {
	
	public int id;
	public long password;
	public long mobilenumber;
	public Company company=new Company("hp","raju");
	
	public Email() {
		super();
	}
	public void setEmail(int id,long password,long mobilenumber) {
		this.id=id;
		this.password=password;
		this.mobilenumber=mobilenumber;
	}
	//
	public void display() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobilenumber);
		
		
	}

}
