package com.ashirwad.blc;

public class Amployee {
	private int id;
	private String name;
	private double salary;
	public void setAmployeeDetails(int id , String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void calculateSalaryIncrement()
	{
		
		
		if (salary<50000)
		{
			IO.println("Incremet amount = "+(salary*0.10)); 
			salary+=(salary*0.1);
			
			
		}
		else if(salary<80000)
		{
			IO.println("Incremet amount = "+(salary*0.07));
			salary+=salary*.07;
			
	
			
		}
		else
		{
			IO.println("Incremet amount = "+(salary*0.05));
			salary+=salary*.05;
			
			
		}
	    IO.println("salary = "+this.salary);	
	    
	}
	
	public String toString() {
		return "Amployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
