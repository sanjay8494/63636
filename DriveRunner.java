package com.xworkz.Encapsulation;

public class DriveRunner {
	
public static void main(String[] args) {
		
		Drive drive = new Drive();
		String colour="red";
		String name ="raju";
		String m =null;
		Aeroplane aeroplane =new Aeroplane (colour,5.5,'m',55,6,55,100,260,2,120);
		aeroplane.display();
}
		

}
