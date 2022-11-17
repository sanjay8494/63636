package com.xworkz.logicals;

public class changeCase {

	public static void main(String[] args) {
		
		String ref1="Great Power";
		StringBuffer newref=new StringBuffer(ref1);
		for(int i=0;i<ref1.length();i++)
		{
			if(Character.isLowerCase(ref1.charAt(i)))
			{
				newref.setCharAt(i,Character.toUpperCase(ref1.charAt(i)));
			}
			else if(Character.isUpperCase(ref1.charAt(i))) {

	newref.setCharAt(i,Character.toLowerCase(ref1.charAt(i)));
	
}
		}
		
      System.out.println("String after conversion:"+newref);
	}

}
