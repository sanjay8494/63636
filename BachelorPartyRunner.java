package com.xworkz.sanju;

import com.xworkz.Inheritance.BachelorParty;
import com.xworkz.Inheritance.Party;

public class BachelorPartyRunner {

	public static void main(String[] args) {
		
		 Party bachelorParty=new BachelorParty("omkarsir","rajajinagar","wines");
			System.out.println("boyName :"+bachelorParty.boyName);
			System.out.println("place :"+bachelorParty.place);
			System.out.println("type :"+bachelorParty.Type);

	}

}
