package com.xworkz;

import com.xworkz.Encapsulation.Station;
import com.xworkz.Encapsulation.Train;

public class StationRunner {

	public static void main(String[] args) {
		
		Station station =new Station();
		String red = null;
		String banglore = null;
		String m = null;
		Train train =new Train(red, banglore,'m',245333,1348,12345,100,22,2,120);
		train.display();
		
		
		

	}

}
