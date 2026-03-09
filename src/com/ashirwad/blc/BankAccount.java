package com.ashirwad.blc;

public class BankAccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	
	public void setBankAccount(long acno,String name,double amount)
	{
		accountNumber=acno;
		accountHolderName = name;
		balance = amount;
		
	}
	
	public void getBankAccount()
	{
		IO.println("My Account no. is "+accountNumber+" I am "+accountHolderName+".My balance is "+balance);
	}

}
