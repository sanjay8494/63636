package com.xworkz.sanju;

public class State {
	
	public String name;
	public String cm;
	public int nooftaluks;
	public int noofdistricts;
	
	public State(String name,String cm,int nooftaluks,int noofdistricts)
	{
		this.name=name;
		this.cm=cm;
		this.nooftaluks=nooftaluks;
		this.noofdistricts=noofdistricts;
		
				
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.cm);
		System.out.println(this.nooftaluks);
		System.out.println(this.noofdistricts);
	}
	
	

}
