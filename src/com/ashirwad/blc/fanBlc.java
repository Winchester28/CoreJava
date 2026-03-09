package com.ashirwad.blc;

public class fanBlc {
	String name;
	String coil;
	int wings;
	
	public void switchOn()
	{
		IO.println("It's relaxing,you are my best friend in summers "+name);
		IO.println(name+" also got "+wings+" wings and also has "+coil+" coil");
		
	}
	public void switchOff()
	{
		IO.println("Turn it on again ");
	}

}
