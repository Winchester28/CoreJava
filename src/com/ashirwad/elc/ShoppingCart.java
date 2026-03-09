package com.ashirwad.elc;

import com.ashirwad.blc.Discount;

public class ShoppingCart
{
void main()
{
	IO.println("Enter the bill amount to get discount");
	double billAmount = Double.parseDouble(IO.readln());
	IO.println("Your bill after discount is : "+Discount.calculateDiscount(billAmount));
}
}
