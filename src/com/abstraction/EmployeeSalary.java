package com.abstraction;

public class EmployeeSalary {

	public static void main(String[] args) {
		Employee emp = null;
		IO.println("Enter Your choice \n (1)Permanent Employee \n(2)Part Time Employee");
		int choice = Integer.parseInt(IO.readln());
		
		switch(choice) {
		case 1 -> {
					IO.println("Enter Name : ");
					String name=IO.readln();
					IO.println("Enter Id : " );
					int id=Integer.parseInt(IO.readln());
					IO.println("Enter Salary : ");
					double monthlySalary=Double.parseDouble(IO.readln());
					emp = new FullTimeEmployee(name,id,monthlySalary);
					IO.println(emp);
					IO.println("Employee Salary : "+emp.calculateSalary());
			}
		
		case 2 ->{
					IO.println("Enter Name : ");
					String name=IO.readln();
					IO.println("Enter Id : " );
					int id=Integer.parseInt(IO.readln());
					IO.println("Enter Hours : ");
					double hours = Double.parseDouble(IO.readln());
					IO.println("Enter Rate : ");
					double rate = Double.parseDouble(IO.readln());
					emp = new PartTimeEmployee(name,id,hours,rate);
					IO.println(emp);
					IO.println("Employee Salary"+emp.calculateSalary());
			
		}
		default ->IO.println("Invalid Input");
		
		}

	}

}	