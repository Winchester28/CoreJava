package com.ashirwad.loop;

public class WhileLoop1toN {
	public static void main(String [] args) {
		int counter=1;
		int range = Integer.parseInt(IO.readln("Enter range :"));
		while(counter<=range) {
			IO.println(counter);
			counter++;
		}
	}

}
