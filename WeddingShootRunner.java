package com.xworkz.sanju;

import com.xworkz.Inheritance.PreWeddingShoot;
import com.xworkz.Inheritance.WeddingShoot;

public class WeddingShootRunner {

	public static void main(String[] args) {
		
		PreWeddingShoot  weddingShoot =new WeddingShoot ("omkar","mamatha","ooty");
		System.out.println("boy name :"+weddingShoot .boyName);
		System.out.println("girlName:"+weddingShoot  .girlName);
		System.out.println("location :"+weddingShoot .location);
		

	}

}
