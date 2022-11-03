package com.xworkz.Encapsulation;

public class Laptop {
	
	private String brand="HP";
	String colour;
	double weight;
	int storage;
	int ram;
	double display;
	long battery;
	int camera;
	double price;
	int models ;
	double ratings;
	
	public Laptop(String colour, double weight, int storage, int ram, double display,

			 long battery, int camera, double price, int models, double ratings) 
	{
		super();
		this.colour = colour;
		this.weight = weight;
		this.storage = storage;
		this.ram = ram;
		this.display = display;
		this.battery = battery;
		this.camera = camera;
		this.price = price;
		this.models = models;
		this.ratings = ratings;
	}
	public String brand()
	{
		return this.brand;
	}
    void setbrand(String brand)
	{
		this.brand = brand;
	}
	public void display()
	{
		System.out.println(this.colour);
		System.out.println(this.weight);
		System.out.println(this.storage);
		System.out.println(this.ram);
		System.out.println(this.display);
		System.out.println(this.battery);
		System.out.println(this.camera);
		System.out.println(this.price);
		System.out.println(this.models);
		System.out.println(this.ratings);
		
		
		
	}



}


