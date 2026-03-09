package com.ashirwad.elc;

public class MOL {

	public void add(int a, int b) {
		IO.println(a+b);
	}
	public void add(int a ,int b,int c) {
		IO.println(a+b+c);
	}
	public void add(int a,double x) {
		IO.println(a-x);
	}
	
	void main() {
		
		
		int a=Integer.parseInt(IO.readln());
		int b=Integer.parseInt(IO.readln());
		int c=Integer.parseInt(IO.readln());
		double x=Integer.parseInt(IO.readln());
		
		 add(a,b);
		 add(a,b,c);
		 add(a,x);
	}
}
