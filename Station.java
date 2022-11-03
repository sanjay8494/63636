package com.xworkz.Encapsulation;

public class Station {
	
	public Train Train;
	
	public void Train(Train train)
	{
		System.out.println(Train.colour);
		System.out.println(Train.driverName);
		System.out.println(Train.length);
		System.out.println(Train.noOfPeoples);
		System.out.println(Train.noOfWheels);
		System.out.println(Train.noOfSeats);
		System.out.println(Train.speed);
		System.out.println(Train.coaches);
		System.out.println(Train.engine);
		System.out.println(Train.capacity);
		Train.setname("Vishnamanava Express");
		System.out.println("modifing : "+ Train.name());
		
		
		
	}

}
