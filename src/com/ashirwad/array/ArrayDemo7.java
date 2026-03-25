/**
 * 5. SearchElement
Easy
100 points
• 120 min suggested
Problem Description
Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found


Enter number of elements: 7
Enter 7 elements:
1
4
3
5
2
6
5

Enter the element to search: 5
Element found at index: 3

Test Case 1:-
7  //-> Array Size
1
4
3
5
2
6
5
5  //->element to search: 5

Expected Output :-

Element found at index: 3

Examples
Example 1
Input:
7
1
4
3
5
2
6
5
5
Output:
Element found at index: 3
 */

package com.ashirwad.array;

public class ArrayDemo7 {
	   void main(){
	       IO.println("Enter size of array :"); 
		   int size=Integer.parseInt(IO.readln());
	       try{
	        int [] arr = new int[size];

	        for(int i=0;i<size;i++){
	            arr[i]=Integer.parseInt(IO.readln());
	        }
	        
	        int search = Integer.parseInt(IO.readln());
	        for(int i=0;i<size;i++){
	            if(arr[i]==search){
	                IO.println("Element found at index: "+ i);
	                break;
	            }
	        }
	    } 
	    
	catch (NegativeArraySizeException e){
	        IO.println("Invalid Array size.");
	        }
	    }

}
