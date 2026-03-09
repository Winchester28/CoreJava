package com.ashirwad.blc;

public class CorporateEmployee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	
	public void setCorporateEmployeeData(String fName,String lName,int id,double sal,int projects)
	{
		firstName=fName;
		lastName=lName;
		employeeId=id;
		salary=sal;
		noOfProject=projects;
	}
	public void calculateSalary()
	{
		if (noOfProject>5 && noOfProject<10)
		{
			salary+=5000;
		}
		else if(noOfProject>=10 && noOfProject<=20)
		{
			salary+=10000;
		}
		else if(noOfProject>20)
		{
			salary+=15000;
		}else {
			salary+=0;
		}
	}
	
    public void displayDetails()
    {
    	IO.println("First name\t : "+firstName);
    	IO.println("Last name \t : "+lastName);
    	IO.println("ID\t\t : "+employeeId);
    	IO.println("Projects   \t : "+noOfProject);
    	IO.println("Salary  \t\t : "+salary);
    	IO.println("--------------------------------------------------");
    	
    }
}
