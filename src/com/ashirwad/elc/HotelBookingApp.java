package com.ashirwad.elc;

import com.ashirwad.blc.Hotel;

public class HotelBookingApp {
void main()
{
	IO.println("Enter Customer Name");
	String customerName = IO.readln();
	
	IO.println("Hotel Name");
	String hotelName =IO.readln();
	
	IO.println("Enter Room Rate per Day");
	double roomRate=Double.parseDouble(IO.readln());
	
	IO.println("Enter number of days stayed");
	int days=Integer.parseInt(IO.readln());
	
	double tot_Amount=  Hotel.calculateTotalAmount(roomRate, days);
	double dis_Amount=  Hotel.calculateDiscountedAmount(days, roomRate);

	IO.println("------ HOTEL BOOKING SUMMA}RY ------");
	IO.println("Customer Name\t\t: " + customerName);
	IO.println("Hotel Name\t\t: " + hotelName);
	IO.println("Room Rate (per day)\t: " + roomRate);
	IO.println("Days Stayed\t\t: " + days);
	IO.println("Total Amount\t\t: " +tot_Amount );
	IO.println("Amount after Discount\t: " + dis_Amount);
	IO.println("------------------------------------");

}
}












//mne kse likha tha
//IO.println("------HOTEL BOOKING SUMMARY------");
//IO.println("Customer Name		:"+customerName);
//IO.println("Hotel Name		:"+hotelName);
//IO.println("Room Rate (per day)			:"+roomRate);
//IO.println("Days Stayed			:"+days);
//IO.println("Total Amount		:"+Hotel.calculateTotalAmount(roomRate, days));
//IO.println("Amount after Discount		:"+Hotel.calculateDiscountedAmount(days, roomRate)	);
//
