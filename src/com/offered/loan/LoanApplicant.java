package com.offered.loan;

public class LoanApplicant 
{
	private String applicantName;
	private int civilScore;
	
	public LoanApplicant(String applicantName, int civilScore) {
		super();
		this.applicantName = applicantName;
		this.civilScore = civilScore;
	}
	public String getApplicantName() 
	{
		return applicantName;
	}
	public void setApplicantName(String applicantName) 
	{
		this.applicantName = applicantName;
	}
	public int getCivilScore() 
	{
		return civilScore;
	}
	public void setCivilScore(int civilScore)
	{
		this.civilScore = civilScore;
	}
	@Override
	public String toString() {
		return "LoanApplicant [applicantName=" + applicantName + ", civilScore=" + civilScore + "]";
	}
	
}
