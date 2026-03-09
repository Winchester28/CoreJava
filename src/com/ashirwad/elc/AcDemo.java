package com.ashirwad.elc;

import com.ashirwad.blc.Ac;

public class AcDemo {

	public static void main(String[] args) {
   		
		
		 int year=Integer.parseInt(IO.readln());
	     String nick=IO.readln();
		     
		     
		     Ac Lloyd = new Ac(year,nick);
		     
		     IO.println(Lloyd);
		     Lloyd.isAc();
		     
		 }


	}


