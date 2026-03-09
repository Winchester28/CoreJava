package com.ashirwad.blc;

public class Bank {
	
	 
	 long accountNumber;
	 double currentBalance;
	 String customerName;
	 
	 static String bankName = "ICICI Bank";
	 static String bankAddress = "Ameerpet";
	 static String bankIFSCCode="ICI00127893";
	 
	 public void setCustomerDetails(String name,long accNumber,double balance)
	 {
		 if (balance<=0)
		 {
			 System.err.println("Invalid ");
			 System.exit(0);
		 }
		 accountNumber = accNumber;
		 currentBalance=balance;
		 customerName=name;
	 }
		 
	public void withdraw(double amount)
	{
		if (amount>currentBalance)
		{
			System.err.println("You have Insufficient Balance");
			System.exit(0);
		}
		
	}
	
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			System.err.println("Amount must not be 0 or less");
			System.exit(0);
		}
	}

	public double getCurrentBalance()
	{
		return currentBalance;
		
	}

	
	public String displayDetails() 
	{
		return "Bank [accountNumber=" + accountNumber + ", currentBalance=" + currentBalance + ", customerName="
				+ customerName + "]";
	}
		 

}
