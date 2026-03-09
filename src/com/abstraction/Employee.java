package com.abstraction;

 public abstract class Employee {
	String name;
	int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	
abstract double calculateSalary(); 

}
  
 
 class FullTimeEmployee extends Employee{
	  
	 double monthlySalary;

	FullTimeEmployee(String name, int id,double monthlySalary) {
		super(name, id);
		this.monthlySalary=monthlySalary;
	}

	
	@Override
	public String toString() {
		return "FullTimeEmployee [monthlySalary=" + monthlySalary + ", name=" + name + ", id=" + id + "]";
	}


	@Override
	double calculateSalary() {
		
		return monthlySalary;
	}

	
	
	 
	 
 }
 
  class PartTimeEmployee extends Employee{

	double hours;
	double rate;
	PartTimeEmployee(String name, int id,double hours,double rate) {
		super(name, id);
		this.hours=hours;
		this.rate=rate;
		
	}

	@Override
	double calculateSalary() {
		double salaryTemp=hours*rate;
		return salaryTemp;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hours=" + hours + ", rate=" + rate + ", name=" + name + ", id=" + id + "]";
	}

	
	 
 }
