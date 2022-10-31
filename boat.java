package com.xworkz.copy.boot;

public class boat {
	public String companyName;
	public String name;
	public boolean type;
	public String owner;
	public String color;

	public boat() {
		System.out.println("sanju hodaa ");
	}
	public boat(String companyName){
		this.companyName=companyName;
		System.out.println("==============");
		
	}
	public boat(String companyName,boolean type){
		this.companyName=companyName;
		this.type=type;
		System.out.println("==============");
		
		}
	public boat(String companyName,boolean type,String owner){
		this.companyName=companyName;
		this.type=type;
		System.out.println("==============");
	}
	public boat(String companyName,boolean type,String owner,String color){
		this.companyName=companyName;
		this.type=type;
		System.out.println("==============");
	}
	public boat(String companyName,boolean type,String owner,String color,String name){
		this.companyName=companyName;
		this.type=type;
		System.out.println("==============");
	}
}
