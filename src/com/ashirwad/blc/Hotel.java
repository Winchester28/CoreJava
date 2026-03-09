package com.ashirwad.blc;

public class Hotel {
	public static double calculateTotalAmount(double roomRate,int days)
	{
		
		return roomRate*days ;
				
	}
	public static double calculateDiscountedAmount(int days , double roomRate)
	{
		if(days<0)
		{
			System.err.println("Invalid Input");
			System.exit(0);
			
		}
		else if(days>=1 && days <= 2)
		{
			return (roomRate*days-(roomRate*days*.0));
		}
		else if (days >=3 && days <= 4)
		{
			return (roomRate*days-(roomRate*days*.05));
		}
		else if (days >=5 && days <= 9)
		{
			return (roomRate*days-(roomRate*days*.10));
		}
		else
		{
			return (roomRate*days-(roomRate*days*.20));
		}
		return roomRate;
		
		
		
	
	
		
	}
	

}
