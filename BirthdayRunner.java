package com.xworkz.sanju;

import com.xworkz.Inheritance.Birthday;
import com.xworkz.Inheritance.Invitation;

public class BirthdayRunner {

	public static void main(String[] args) {
		
		Invitation birthday=new Birthday(5,2,"function");
		System.out.println("size :"+birthday.size);
		System.out.println("noOfSheets :"+birthday.noOfSheets);
		System.out.println("type :"+birthday.Type);

	}

}
