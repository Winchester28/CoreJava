/**
 * 2. EvenOddSeparator
Easy
100 points
• 120 min suggested
Problem Description
Write a java program to print all even elements and odd elements 
separately from an array.

Enter number of elements: 7
Enter 7 elements:
1
2
3
4
5
6
7
Even elements are : 2 4 6 
Odd elements are : 1 3 5 7 

Examples
Example 1
Input:
7
1
2
3
4
5
6
7
Output:
Even elements are : 2 4 6 
Odd elements are : 1 3 5 7
 */


package com.ashirwad.array;

public class ArrayDemo4 {
	void main(){
        IO.println("Enter size of array :");
		int size=Integer.parseInt(IO.readln());
       try{
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(IO.readln());
        }
       IO.print("Even elements are : ");
       for(int i = 0;i<size;i++)
       {
        if(arr[i]%2==0)
        {
            IO.print(arr[i]+" ");
            
        }
        
       } 
       IO.println();
       IO.print("Odd elements are : ");
       for(int i = 0;i<size;i++){
        if(arr[i]%2!=0){
            IO.print(arr[i]+" ");
        }
       }

        
      
       } 
    catch (NegativeArraySizeException e){
        IO.println("Invalid Array size.");
            }
       
    }

}
