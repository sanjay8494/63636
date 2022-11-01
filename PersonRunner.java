package com.xworkz;

import com.xworkz.sanju.Address;
import com.xworkz.sanju.Company;
import com.xworkz.sanju.Email;
import com.xworkz.sanju.Job;
import com.xworkz.sanju.Location;
import com.xworkz.sanju.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.setEmail(null);
		person.display();
		//
		Email email1=new Email();
		
		Email email2=new Email();
		Email email3=new Email();
		Email email4=new Email();
		Email email5=new Email();
		
		Email[] mails= {email1,email2,email3,email4,email5};
		//
		
		
		Job job=new Job();
		job.display();
		//
		Company company=new Company();
		company.display();
		//
		Address address=new Address();
		address.display();
		//
		Location location=new Location();
		location.display();
		//
		
		
		
		

	}

}
