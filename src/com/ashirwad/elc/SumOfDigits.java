package com.ashirwad.elc;

import com.ashirwad.blc.Digits;

public class SumOfDigits {
	void main()
	{
		int a = Integer.parseInt(IO.readln());
		int b = Integer.parseInt(IO.readln());
		
		IO.println("Sum of digits is : "+Digits.getSum(a, b));
		
		
	}

}
