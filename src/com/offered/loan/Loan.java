package com.offered.loan;

public class Loan {
	void main()
	{
		
		
		LoanApplicant la=new LoanApplicant("Ashirwad", 300);
		
		OfferedLoan loanType = LoanType.getLoanType(la);
		
		IO.println(loanType);
		
		
	}

}
