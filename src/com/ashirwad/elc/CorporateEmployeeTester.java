package com.ashirwad.elc;

import com.ashirwad.blc.CorporateEmployee;

public class CorporateEmployeeTester {

	public static void main(String[] args) {
		
           CorporateEmployee Jack = new CorporateEmployee();
           Jack.setCorporateEmployeeData("Jack", "Daniels", 52, 89000, 20);
           Jack.calculateSalary();
           Jack.displayDetails();
           
           CorporateEmployee Eva= new CorporateEmployee();
           Eva.setCorporateEmployeeData("Eva","Adam" ,53, 70000, 15);
           Eva.calculateSalary();
           Eva.displayDetails();
           
           CorporateEmployee Chris= new CorporateEmployee();
           Chris.setCorporateEmployeeData("Chris","Nolan" ,56, 75000, 5);
           Chris.calculateSalary();
           Chris.displayDetails();
	}

}
