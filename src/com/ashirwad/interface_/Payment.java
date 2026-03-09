package com.ashirwad.interface_;

public interface Payment {
	 void  processPayment();
	 void  applyDiscount();

}

class CreditcardPayment implements Payment{
	@Override
	
	public void processPayment() {
		IO.println("Initiating credit card payment");
		
	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 10% discount for Credit Card payment");
		
	}
}

class UPIPayment implements Payment{
	@Override
	public void processPayment() {
		IO.println("Initiating UPI payment");
	}
	
	@Override
	public void applyDiscount() {
		IO.println("Applying 5% discount for UPI payment");
	}
}