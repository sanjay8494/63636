package com.xworkz.Encapsulation.Inheritance;

public class Prasanth extends Director  {
	
	public String gender;
	 
	 
	public Prasanth(String name, String type, int noOfMovies,String head) {
		super(name, type, noOfMovies);
		this.gender=gender;
		
	}
 public void display()
 {
	 super.display();       
	 
	 
	 System.out.println("Director gender is  "+this.gender);
 }

}
