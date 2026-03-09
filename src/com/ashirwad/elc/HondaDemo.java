package com.ashirwad.elc;

import com.ashirwad.blc.Honda;

public class HondaDemo {

	public static void main(String[] args) 
	{
		IO.print("Enter Car Model\t\t\t : ");
		String model = IO.readln();
		IO.print("Enter car manufacturing year\t : ");
		int year=Integer.parseInt(IO.readln());
		IO.print("Enter car Price\t\t\t : ");
		double price=Double.parseDouble(IO.readln());
		
		
		Honda Civic=new Honda(model,year,price);
		Civic.validateCarYear();
		Civic.validateCarPrice();
		
		
		IO.println(Civic.toString());

	}

}
