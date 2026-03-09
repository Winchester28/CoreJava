package com.ashirwad.loop;
//
public class PrimeNumber {
// void main() {
//	 
//	 int a = Integer.parseInt(IO.readln());
//	
//	 for(int i = 2;i<a;i++) {
//		 if(a%i==0) {
//			 IO.println("no. is com");
//			 
//		 }
//		 else {
//			 IO.println("prm");
//		 }
//	 }
// }
//}
void main() {

    while(true) {

        int a = Integer.parseInt(IO.readln());

        if(a == -1) {   // stop condition
            break;
        }

        boolean isPrime = true;

        if(a <= 1) {
            isPrime = false;
        }

        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            IO.println("Prime");
        } else {
            IO.println("Composite");
        }
    }
}}