package com.xworkz.sanju;

public class Country {
	
	public String name;
	public String presidentName;
	public String flagColour;
	public long noOfPeoples;
	
	public Country(String name, String presidentName,String flagColour,long noOfPeoples)
	{
		this.name=name;
		this.presidentName=presidentName;
		this.flagColour=flagColour;
		this.noOfPeoples=noOfPeoples;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.presidentName);
		System.out.println(this.flagColour);
		System.out.println(this.noOfPeoples);
		
	}
	

}
