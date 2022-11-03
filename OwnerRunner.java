package com.xworkz;

import com.xworkz.Encapsulation.Car;
import com.xworkz.Encapsulation.Owner;

public class OwnerRunner {

	public static void main(String[] args) {
		
		Owner owner = new Owner();
		String red=null;
		String tiptur =null;
		String raju =null;
		Car car =new Car(red, tiptur,'m',55,6,55,100,26000,2,120);
		car.display();
		

	}
	

	}


