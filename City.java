package com.xworkz.sanju;

public class City {
	
	public String name;
	public String oldname;
	public int number;
	public String capitalCity;
	
	public City(String name,String oldname,int number,String capitalCity)
	{
		this.name=name;
		this.oldname=oldname;
		this.number=number;
		this.capitalCity=capitalCity;

	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.oldname);
		System.out.println(this.number);
		System.out.println(this.capitalCity);
	}

}
