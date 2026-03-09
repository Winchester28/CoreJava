package com.ashirwad.blc;

public class Discount {
	public static double calculateDiscount(double billAmount)
	{
		
	    if(billAmount<0)
	    {
	    	System.err.println("Invalid Input");
	    	System.exit(0);
	    }
		
		else if (billAmount>=5000)
		{
			return billAmount-(billAmount*.20);
		}
		else if( billAmount <5000 && billAmount>=3000)
		{
			return billAmount-(billAmount*.15);
		}
		else if(billAmount < 3000 && billAmount >= 1000)
		{
			return billAmount-(billAmount*.10);
		}
		else
		{
			return billAmount-(billAmount*.05);
		}
		
		return billAmount;
		
	}

}
