package com.xworkz.copy.boot;

public class boatRunner {

	public static void main(String[] args) {
		boat boat1 =new boat();
		System.out.println(boat1.name="ramyaa");
		System.out.println(boat1.companyName="altrapromax");
		System.out.println(boat1.owner="pinky");
		System.out.println(boat1.color="brown");
		System.out.println(boat1.type);
		
		boat1.name="bluetooth";
		boat1.companyName="boat";
		boat1.owner="sanju";
		boat1.color="blue";
		boat1.type= true;
		
		
		System.out.println(boat1.name);
		System.out.println(boat1.companyName);
		System.out.println(boat1.owner);
		System.out.println(boat1.color);
		System.out.println(boat1.type);
	
		
		
				

	}

}
