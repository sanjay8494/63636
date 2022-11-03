package com.xworkz.Encapsulation;

public class Bike {
	
	private String name="KTM";
	String colour;
	double weight;
	char length;
	int noOfPeoples;
	int noOfWheels;
	double mileage;
	int speed;
	double price;
	int models ;
	int capacity;
	
	public Bike(String colour, double weight, char length, int noOfPeoples, int noOfWheels,

			 double mileage, int speed, double price, int models, int capacity) 
	{
		super();
		this.colour = colour;
		this.weight = weight;
		this.length = length;
		this.noOfPeoples = noOfPeoples;
		this.noOfWheels = noOfWheels;
		this.mileage = mileage;
		this.speed = speed;
		this.price = price;
		this.models = models;
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
		System.out.println(this.weight);
		System.out.println(this.length);
		System.out.println(this.noOfPeoples);
		System.out.println(this.noOfWheels);
		System.out.println(this.mileage);
		System.out.println(this.speed);
		System.out.println(this.price);
		System.out.println(this.models);
		System.out.println(this.capacity);
		
		
		
	}


}
