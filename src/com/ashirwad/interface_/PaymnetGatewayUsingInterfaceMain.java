package com.ashirwad.interface_;

public class PaymnetGatewayUsingInterfaceMain {
	public static void main(String[] args) {
	
	//Payment p = PaymentGateway.initiatePayment("CreditCard");
	Payment p = PaymentGateway.initiatePayment("CreditCard");
	IO.println(p);
	}

}
