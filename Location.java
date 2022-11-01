package com.xworkz.sanju;

public class Location {
	
	public String name;
	public int number;
	public City city=new City("banglore","banglore",99,"");
	public State state=new State("karnataka","karnataka",150,120);
	public Country country=new Country("india","banglore","city",9876);
	
	public Location()
	{
		super();
	}
	public Location(String name, int number)
	{
		this.name=name;
		this.number=number;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.number);
		System.out.println(state.name);
		System.out.println(state.cm);
		System.out.println(state.nooftaluks);
		System.out.println(state.noofdistricts);
		System.out.println(city.name);
		System.out.println(city.oldname);
		System.out.println(city.number);
		System.out.println(city.capitalCity);
		System.out.println(country.name);
		System.out.println(country.presidentName);
		System.out.println(country.flagColour);
		System.out.println(country.noOfPeoples);
		
	}

}
