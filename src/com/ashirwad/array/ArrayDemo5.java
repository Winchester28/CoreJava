/**3. FirstLastSum
Easy
100 points
• 120 min suggested
Problem Description
Write a program to add the last and first element of a given array.


Enter the number of elements in the array: 5
Enter 5 elements:
1
2
3
4
5
Output: 6

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
Output: 6
*/


package com.ashirwad.array;

public class ArrayDemo5 {
    void main(){
    		IO.println("Enter size of array :");
        int size = Integer.parseInt(IO.readln());
        try{
            int [] arr = new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(IO.readln()); 
        }

        IO.println( "Output: "+(arr[0] + arr[arr.length-1]));
        }

        catch(NegativeArraySizeException e){
            IO.println("Invalid Array size.");
        }
    }

}
