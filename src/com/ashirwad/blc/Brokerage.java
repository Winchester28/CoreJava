package com.ashirwad.blc;

public class Brokerage {
	double areaOfFlat;
	String location;
	double rent;
	String societyName;
	String propertyType;
	
	public void setBrokerage(double size,String loc,double pay,String name,String type)
	{
		IO.println("What is the size of flat : ");
				
		areaOfFlat=size;
		location=loc;
		rent=pay;
		societyName=name;
		propertyType=type;
	}
	public void getBrokerage()
	{
		IO.println("We have a vacant flat in "+societyName+","+location+" having a great area of "+areaOfFlat+"sq.ft"+" It is available for "+propertyType+".You can move to this happy place just for Rs."+rent+" only.");
	}
	

}
