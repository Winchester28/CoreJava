package com.ashirwad.blc;

public class Student {
	public static String calculateGrade(double grade)
	{
		
		if (grade<0)
		{
			System.err.println("Invalid Input");
			System.exit(0);
		}
	    else if (grade>=90)
		{
			
			return "A+";
		} 
		else if (grade<90 && grade>=75)
		{
			return "A";
		}
		else if (grade<75 && grade >=60)
		{
			return "b";
		}
		else if (grade<60 && grade >= 40)
		{
			return"c";
		}
		else if (grade<40 && grade>=0)
		{
			return "fail";
		}
		return null;
		
	}

}
