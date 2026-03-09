package com.ashirwad.blc;



public class Omployee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int NoOfProject;
	
	public Omployee(String firstName,String lastName,int employeeId,int NoOfProject)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.NoOfProject=NoOfProject;
	}
	 
	public void calculateSalary(double salary)
	{
		
		
		if(NoOfProject>5 && NoOfProject<10)
		{
			salary+=5000;
		}
		else if(NoOfProject>=10 && NoOfProject<20)
		{
			salary+=10000;
		}
		else if(NoOfProject>=20)
		{
			salary+=15000;
		}
		else
		{
			salary+=0;
		}
		this.salary=salary;	
		IO.println("Incremented Salary :"+salary);
		
	}

	
	public String toString() {
		return "Omployee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}
	
	
	

}
