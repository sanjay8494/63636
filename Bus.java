package com.xworkz.Encapsulation;

public class Bus {
	
	private String name="KSRTC";
	String colour;
	String driverName;
	char length;
	int noOfPeoples;
	int noOfWheels;
	int noOfSeats;
	int speed;
	long driverSalary;
	int driverExperiance;
	int capacity;
	
	public Bus(String colour, String driverName, char length, int noOfPeoples, int noOfWheels,

			 int noOfSeats, int speed, long driverSalary, int driverExperiance, int capacity) 
	{
		super();
		this.colour = colour;
		this.driverName = driverName;
		this.length = length;
		this.noOfPeoples = noOfPeoples;
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
		this.speed = speed;
		this.driverSalary = driverSalary;
		this.driverExperiance = driverExperiance;
		this.capacity = capacity;
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
		System.out.println(this.driverSalary);
		System.out.println(this.driverExperiance);
		System.out.println(this.capacity);
		
		
		
	}

}
