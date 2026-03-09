package com.ashirwad.interface_;

public class PaymentGateway {
	public static   Payment initiatePayment(String paymentType) {
		//public    Payment initiatePayment(String paymentType) {
		
		switch (paymentType) {
		case "CreditCard" -> {
			IO.println("Initiating Credit Card payment");
			return new CreditcardPayment();
		}
		case "UPI" -> {
			IO.println("Initiating UPI payment");
			return new UPIPayment();
		}
		default -> {
			IO.println("Invalid payment type selected!");
			
			return null;
		}
		}
	}

}
