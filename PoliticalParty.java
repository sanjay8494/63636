package com.xworkz.Encapsulation.Inheritance;

public class PoliticalParty {
	

	public String name;
	public int members;
	public String symbol;

	public PoliticalParty(String name, int members, String symbol) {
		super();
		this.name = name;
		this.members = members;
		this.symbol = symbol;
	}
public void display()
{
	System.out.println("name of party  "+ this.name);
	System.out.println("members of party  "+ this.members);
	System.out.println("name of symbol  "+ this.symbol);
}

}
