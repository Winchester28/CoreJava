/**
 4. ReverseArray
Easy
100 points
• 120 min suggested
Problem Description
Write a program to reverse an array without using an additional
array?

Enter number of elements: 5
Enter 5 elements:
1
2
3
4
5
Output as: 5 4 3 2 1 

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
Output as: 5 4 3 2 1
 */

package com.ashirwad.array;

public class ArrayDemo6 {
	 void main(){
	     IO.println("Enter size of array :");   
		 int size=Integer.parseInt(IO.readln());
	       try{
	        int [] arr = new int[size];

	        for(int i=0;i<size;i++){
	            arr[i]=Integer.parseInt(IO.readln());
	        }
	        
	        IO.print("Output as: ");
	        
	        for(int i=(arr.length-1);i>=0;i--){
	            IO.print(arr[i]+" ");
	            }
	       } 
	    catch (NegativeArraySizeException e){
	        IO.println("Invalid Array size.");
	            }
	       
	    }

}
