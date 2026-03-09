
/**
 * SafeStringLength
 
Easy
Core Java • Exception Basics • unchecked exceptions
20 Points
Description
You are tasked with implementing a safe method to calculate the length of a string in Java. The program must handle null references gracefully.

Implement the following method:
public int safeLength(String s)

Rules
Return the length of the string s.
If s is null, catch the exception and return 0.
For non-null strings, return their actual length.
This program demonstrates exception handling, specifically how to handle NullPointerException safely.

Input Format
A single string s.
The string may be non-empty, empty, or "null" (which should be treated as a null reference).

Output Format
A single integer representing the length of the string:
For valid non-null strings → return the length of the string.
For null strings → return 0.
Examples
Example 1:

Input

hello
Output

5
Example 2:

Input

JavaLab
Output

7
Explanation

The safeLength method safely computes the length of a string:
Non-null strings: Returns s.length().
Empty strings: Returns 0 since "" has length 0.
Null strings: Caught by try-catch → returns 0 instead of throwing NullPointerException.
Literal "null" input: Converted to actual null before calling safeLength.
*/

package com.ashirwad.exception_handling;

public class ExceptionSafeStringLengthP1 {
        public static void main(String[] args) {
            String s=IO.readln();
             if(s.equals("null")){
            s = null;
        }
            ExceptionSafeStringLengthP1 m = new ExceptionSafeStringLengthP1();
          
           IO.println(m.safeLength(s));
        }
        public  int safeLength(String s){
            try{
                //  s =IO.readln();
                return s.length();
            }
            catch(Exception e){
                return 0;
            }
        }
}

