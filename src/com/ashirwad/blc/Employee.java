package com.ashirwad.blc;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployee(int id,String name,double salary)
	{
		employeeId=id;
		employeeName=name;
		employeeSalary=salary;
	}
	
	public void getEmployee()
	{
		IO.println("I am "+employeeName+".My ID is "+employeeId+".My salary is "+employeeSalary);
	}
}
