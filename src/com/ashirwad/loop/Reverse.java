package com.ashirwad.loop;

public class Reverse {
	void main() {
int a = Integer.parseInt(IO.readln());
 //String a = IO.readln();

while(a>0) {
	int finalNumber = a%10;
	IO.print(finalNumber);
	 a=a/10;
	
	}
  }
}