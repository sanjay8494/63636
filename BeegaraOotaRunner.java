package com.xworkz.sanju;

import com.xworkz.Inheritance.BeegaraOota;
import com.xworkz.Inheritance.Catering;

public class BeegaraOotaRunner {

	public static void main(String[] args) {
	
		Catering beegaraOota=new BeegaraOota("Dharshan",10,"nonVeg");
		System.out.println("ownerName :"+beegaraOota.ownerName);
		System.out.println("noOfWorkers :"+beegaraOota.noOfWorkers);
		System.out.println("type :"+beegaraOota.Type);



	}

}
