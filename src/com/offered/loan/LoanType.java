package com.offered.loan;

public class LoanType 
{
	public static OfferedLoan getLoanType(LoanApplicant la)
	{
	    int civilScore=la.getCivilScore();	
	    
	    if(civilScore>=100)
	    {
	    	return new OfferedLoan(la,"Education Loan");
	    }
	    else if (civilScore>=200)
	    {
	    	return new OfferedLoan(la,"No Cost EMI");
	    }
	    else if (civilScore>=300)
	    {
	    	return new OfferedLoan(la,"Personal Loan");
	    }
	    else if (civilScore>=500 && civilScore<=700)
	    {
	    	return new OfferedLoan(la,"Home Loan");
	    }
	    else 
	    {
	    	return new OfferedLoan(la,"Unlimited Credit Card");
	    }
	 
	    
		
		
		
		
	}

}
