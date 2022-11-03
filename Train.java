package com.xworkz.Encapsulation;

public class Train {
	
	private String name="Gol Gumbaz Express";
	String colour;
	String driverName;
	char length;
	long noOfPeoples;
	long noOfWheels;
	long noOfSeats;
	int speed;
	int coaches;
	int engine;
	int capacity;
	
	public Train(String colour, String driverName, char length, long noOfPeoples, long noOfWheels,

			 long noOfSeats, int speed, int coaches, int engines, int capacity) 
	{
		super();
		this.colour = colour;
		this.driverName = driverName;
		this.length = length;
		this.noOfPeoples = noOfPeoples;
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
		this.speed = speed;
		this.coaches = coaches;
		this.engine = engine;
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
		System.out.println(this.coaches);
		System.out.println(this.engine);
		System.out.println(this.capacity);
		
		
		
		
	}
	
		
	
	
	

}
