package com.ashirwad.elc;

import com.ashirwad.blc.Amployee;

public class AmployeeFinal {

	public static void main(String[] args) {

     Amployee A1=new Amployee();
     IO.print("Enter id\t\t");
     int id=Integer.parseInt(IO.readln());
     IO.print("Enter name\t");
     String name= IO.readln();
     IO.print("Enter salary\t");
     double salary=Double.parseDouble(IO.readln());
     
     A1.setAmployeeDetails(id,name,salary);
     A1.calculateSalaryIncrement();
     IO.println(A1.toString());

	}

}
