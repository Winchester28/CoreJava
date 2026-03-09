package com.offered.loan;

public class OfferedLoan {
	private LoanApplicant loanApplicant; // Has -A property
	private String loanType;

	public OfferedLoan(LoanApplicant loanApplicant, String loanType) {
		super();
		this.loanApplicant = loanApplicant;
		this.loanType = loanType;
	}

	public LoanApplicant getLoanApplicant() {
		return loanApplicant;
	}

	public void setLoanApplicant(LoanApplicant loanApplicant) {
		this.loanApplicant = loanApplicant;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String toString() {
		return "OfferedLoan [loanApplicant=" + loanApplicant + ", loanType=" + loanType + "]";
	}

}
