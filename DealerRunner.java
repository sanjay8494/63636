package com.xworkz;


import com.xworkz.Encapsulation.Dealer;
import com.xworkz.Encapsulation.Laptop;

public class DealerRunner {
	
public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		String colour="red";
		String name ="raju";
		String m =null;
		Laptop laptop =new Laptop(colour,5.5,'m',55,6,55,100,26000,2,120);
		laptop.display();
		

	}
}



	


