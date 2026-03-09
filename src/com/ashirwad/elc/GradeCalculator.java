package com.ashirwad.elc;

import com.ashirwad.blc.Student;

public class GradeCalculator {
void main()
{
	IO.println("Enter marks of student : ");
	double grade = Double.parseDouble(IO.readln());
	IO.println("Grade of the entered student is : "+Student.calculateGrade(grade));
}
}
