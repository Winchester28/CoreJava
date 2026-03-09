package com.employee.management.system;



public class EmployeeDemo 
{
    void main()
    {
        int employeeNumber = Integer.parseInt(IO.readln());
        String employeeName = IO.readln();
        double employeeSalary = Double.parseDouble(IO.readln());
        double increment = Double.parseDouble(IO.readln());

      
         Employee e=new Employee(employeeNumber, employeeName, employeeSalary);
         double sal=e.getEmployeeSalary()+increment;
         e.setEmployeeSalary(sal);
         String res= e.getEmployeeDesignation(sal);
         IO.println(e);
         IO.println(res);
         
    

        
    }
}

class Employee
{
    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeNumber, String employeeName, double employeeSalary)
    {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNumber()
    {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary)
    {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation(double updatedSalary)
    {
        if (updatedSalary == 120000)
        {
            return "Employee is a HR Manager.";
        }
        else if (updatedSalary == 90000)
        {
            return "Employee is a Developer.";
        }
        else if (updatedSalary == 60000)
        {
            return "Employee is a Designer.";
        }
        else
        {
            return "Employee is a Tester.";
        }
    }

    public String toString()
    {
        return "--- Updated Employee Details ---"
                + "\nEmployee Number : " + employeeNumber
                + "\nEmployee Name   : " + employeeName
                + "\nEmployee Salary : " + employeeSalary;
    }
}
