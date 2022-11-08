package com.xworkz.sanju;

import com.xworkz.Inheritance.DJ;
import com.xworkz.Inheritance.Festival;

public class FestivalRunner {

	public static void main(String[] args) {

		 DJ festival=new Festival("Gagan","JBL","square");
		System.out.println("ownerName :"+festival.ownerName);
		System.out.println("company :"+festival.company);
		System.out.println("type :"+festival.Type);


	}

}
