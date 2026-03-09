package com.ashirwad.blc;

public class Honda 
{
	String model;
	int year;
	double price;
	
	public Honda(String model,int year,double price)
	{
		this.model=model;
		this.year=year;
		this.price=price;
		
	}

    public void validateCarYear()
    {
    	if (year<2010)
    	{
    		System.err.println("year must be greater than 2010");
//    		System.exit(0);
    	}
    	
    	
    }
    
    public void validateCarPrice()
    {
    	if (price<0)
    	{
    	System.err.println("Price must be a positive integer");
		System.exit(0);IO.println(toString());
    	}
    	
    }
	public String toString() {
		return "Honda [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
}
