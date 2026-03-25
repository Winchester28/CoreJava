/**1. MiddleElements
Easy
100 points
• 120 min suggested
Problem Description
Write a program to find the middle elements of a given array. 
If array is odd then print only the middle element, if array is even
then print both the middle elements.

Enter the number of elements: 5
Enter 5 elements:
1
2
3
4
5
Output is: 3

Examples
Example 1
Input:
5
1
2
3
4
5
Output:
Output is: 3*/


package com.ashirwad.array;

import java.util.Arrays;

public class ArrayDemo3 {
	void main(){
		IO.print("Enter size of array :");
        int size = Integer.parseInt(IO.readln());
        if(size<0){
            IO.println("Invalid Array size.");
            return;
        }
        int [] arr= new int[size];
        IO.println("Enter elements :");
        
        
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(IO.readln());
        }

        
            if(size%2==0){
                IO.print("Output is: "+Arrays.toString(arr[arr.length/2])+" "+arr[arr.length/2+1] );
                //IO.print(""+ arr.length/2+1);
            }
            else{
                IO.println("Output is: "+arr[arr.length/2]);
            }
        
    }

}
