package com.employee.polymorphism;

public class EmployeeSystem
{
    public void main(){
    int choice = Integer.parseInt(IO.readln());
    int employeeId= Integer.parseInt(IO.readln());
    String employeeName=IO.readln();
    double employeeSalary= Double.parseDouble(IO.readln());
    int contractDuration=Integer.parseInt(IO.readln());
    switch(choice)
    {
    case 1 -> {Employee emp=new PermanentEmployee( employeeId,employeeName, employeeSalary);
                IO.println(emp);}
    case 2 -> {Employee emp=new ContractEmployee( employeeId,employeeName, employeeSalary, contractDuration);
                IO.println(emp);}
    default -> IO.println("Invalid Choice");
    }
    }
}



class Employee
{
    protected int employeeId;
    protected String employeeName;
    protected double employeeSalary;

    public Employee(int employeeId,String employeeName,double employeeSalary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }

}
class PermanentEmployee extends Employee
{
   
	double providentFund;
 
    public PermanentEmployee(int employeeId, String employeeName,double employeeSalary){
    super (employeeId,employeeName,employeeSalary);
    this.providentFund =   employeeSalary * 0.12;
    
    
 }     
    
    public String toString()
    {
        return "PermanentEmployee [employeeId =" + employeeId + " employeeName="+employeeName+"employeeSalary="+employeeSalary+" providentFund="+providentFund + "]";
    }
    public void netSalary()
    {
        double netSalary= employeeSalary+providentFund;
        IO.println(netSalary);
    }
}

class ContractEmployee extends Employee
{
    protected int contractDuration;

    public ContractEmployee(int employeeId,String employeeName,double employeeSalary,int contractDuration)
    {
        super(employeeId,employeeName,employeeSalary);
        this.contractDuration=contractDuration;
    }

    public String toString()
    {
        return "ContractEmployee [employeeId="+employeeId+", employeeName="+employeeName+", employeeSalary="+employeeSalary+", contractDuration="+contractDuration+" years]";
    }
}