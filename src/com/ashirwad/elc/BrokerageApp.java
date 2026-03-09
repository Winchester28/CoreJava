package com.ashirwad.elc;

import com.ashirwad.blc.Brokerage;

public class BrokerageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Brokerage flat_1 = new Brokerage();
         flat_1.setBrokerage(1200, "Gurgaon", 32000.00, "DLF", "Rental");
         flat_1.getBrokerage();
         
         Brokerage flat_2 = new Brokerage();
         flat_2.setBrokerage(890, "Faridabad", 25000, "Ashiana", "Rental");
         flat_2.getBrokerage();
	}

}
