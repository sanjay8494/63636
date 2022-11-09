package com.xworkz.Encapsulation.Inheritance;

public class Director {
	

	public String name;
	public String type;
	public int noOfMovies;

	public Director(String name, String type,int noOfMovies) {
		super();
		this.name = name;
		this.type = type;
		this.noOfMovies = noOfMovies;
	}
public void display()
{
	System.out.println("name of director  "+ this.name);
	System.out.println("type of director  "+ this.type);
	System.out.println("noOfMovies of director  "+ this.noOfMovies);
}

}
