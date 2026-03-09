package com.ashirwad.blc;

public class Scholar {
	
	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	
	public void setScholarData(int id,String name,int marks)
	{
		studentId=id;
		studentName=name;
		studentMarks=marks;
		
	}

	public void getScholarData()
	{
		IO.println("Name of student : "+studentName);
		IO.println("Id :"+studentId);
		IO.println("Marks scored : "+studentMarks);
		IO.println("Grade obtained : "+studentGrade);
	}
	
	public void getGrade()
	{
		if(studentMarks>90)
		{
			studentGrade='A';
		}
		else if(studentMarks>81)
		{
			studentGrade='B';
		}
		else if(studentMarks>71)
		{
			studentGrade='C';
		}
		else if(studentMarks>61)
		{
			studentGrade='D';
		}
		else
		{
			studentGrade='E';
		}
	}
}
