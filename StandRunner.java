package com.xworkz;

import com.xworkz.Encapsulation.Bus;
import com.xworkz.Encapsulation.Stand;

public class StandRunner {
	public static void main(String[] args) {
		
		Stand stand = new Stand();
		String colour="red";
		String name ="raju";
		String m =null;
		Bus bus =new Bus(colour, name,'m',55,6,55,100,26000,2,120);
		bus.display();
		

	}

}
