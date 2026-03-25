
//Different ways to create array and fetch elements using for each loop,for loop and toString method

package com.ashirwad.array;

import java.util.Arrays;

public class ArrayDemo2 {
	void main() {
	
int size =Integer.parseInt(IO.readln("Enter array size: "));
int []arr = new  int[size];
IO.println("Enter elements of array");

for(int i=0;i<size;i++){
 arr [i] =Integer.parseInt(IO.readln());
}

IO.println("Printed using for  loop :");

for(int i = 0; i<size;i++) {
	IO.println( arr[i]);
	
}

IO.println("printing array using for each loop :");

for(int a : arr) {
	IO.println(a);
}

IO.println("Printing array using toString method :"+Arrays.toString(arr));

IO.println("Elements at even index :");
for(int i = 0; i<size;i++) {
	if(i%2==0) {
		IO.println(arr[i]);
	}
}

}
}