package com.xworkz;

import com.xworkz.Encapsulation.Mobile;
import com.xworkz.Encapsulation.Brand;

public class BrandRunner {
	
public static void main(String[] args) {
		
		Brand brand = new Brand();
		String colour="blue";
		String weight =null;
		String m =null;
		Mobile mobile =new Mobile(colour, 0.5,128,8,6.44,4200,64,23000,2,4.4);
		mobile.display();
	
		

	}

}
