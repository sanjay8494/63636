package com.xworkz.Encapsulation;

public class Aeroplane {
	
	private String name="KingFisher";
	String colour;
	String driverName;
	char length;
	long noOfPeoples;
	int noOfWheels;
	long noOfSeats;
	int speed;

	
	public Aeroplane(String colour, String driverName, char length, long noOfPeoples, int noOfWheels,

			 long noOfSeats,int speed) 
	{
		super();
		this.colour = colour;
		this.driverName = driverName;
		this.length = length;
		this.noOfPeoples = noOfPeoples;
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
		this.speed = speed;

	}
	public Aeroplane(String colour2, double d, char c, int i, int j, int k, int l, int m, int n, int o) {
		// TODO Auto-generated constructor stub
	}
	public String name()
	{
		return this.name;
	}
    void setname(String name)
	{
		this.name = name;
	}
	public void display()
	{
		System.out.println(this.colour);
		System.out.println(this.driverName);
		System.out.println(this.length);
		System.out.println(this.noOfPeoples);
		System.out.println(this.noOfWheels);
		System.out.println(this.noOfSeats);
		System.out.println(this.speed);
	
		
		
		
		
	}
	
		
	
	
	

}
