package com.ashirwad.elc;

import com.ashirwad.blc.Calculator;

public class ArithematicCalculator
{
	void main()
	{
		IO.println("enter value of a");
		int a = Integer.parseInt(IO.readln());
		IO.println("enter value of b");
		int b = Integer.parseInt(IO.readln());
		IO.println("ENTER AN OPERATION(+,-,*,/)");
		char op = IO.readln().charAt(0);
		switch (op) 
		{
		case '+' -> IO.println("SUM : "+Calculator.add(a, b));
		case '-' -> IO.println("SUB : "+Calculator.sub(a, b));
		case '*' -> IO.println("MUL : "+Calculator.mul(a, b));
		case '/' -> { if(b==0) 
		{
			System.err.println("Operation not possible");
		}
		else
			IO.println("DIV : "+Calculator.div(a, b));
		}
		default -> System.err.println("INVALID INPUT");
		}
	}
}

































































//
//
//import java.util.Scanner;
//import com.ashirwad.blc.Calculator;
//
//public class ArithematicCalculator {
//
//    public void main() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number 1: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Enter number 2: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Enter Operator (+ - * / %): ");
//        char op = sc.next().charAt(0);
//
//        double result = Calculator.calculate(a, b, op);
//
//        System.out.println("\nResult = " + result);
//    }
//}
