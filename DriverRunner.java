package com.xworkz;

import com.xworkz.Encapsulation.Auto;
import com.xworkz.Encapsulation.Driver;

public class DriverRunner {

	public static void main(String[] args) {
	
		Driver driver = new Driver();
		String red=null;
		String tiptur =null;
		String raju =null;
		Auto auto =new Auto(red, tiptur,'m',55,6,55,100,26000,2,120);
		auto.display();
		


	}

}
