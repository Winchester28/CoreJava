package com.ashirwad.elc;

import com.ashirwad.blc.Omployee;

public class OmployeeMain {

	public static void main(String[] args) 
	{
		IO.print("Enter first name :");
		String firstName= IO.readln();
		IO.print("Enter last name :");
		String lastName= IO.readln();
		IO.print("Enter employeeId  :");
		int employeeId=Integer.parseInt(IO.readln());
		IO.print("No. of projects :");
		int NoOfProject=Integer.parseInt(IO.readln());
		
		
		Omployee O1=new Omployee(firstName,lastName,employeeId,NoOfProject);
		IO.print("Enter base salary : ");
		double salary = Double.parseDouble(IO.readln());
		O1.calculateSalary(salary);
		IO.println(O1.toString());
		

	}

}
