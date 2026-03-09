package com.ashirwad.blc;

public class Calculator{
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double sub(double a,double b)
	{
		return a-b;
	}
	public static double mul(double a,double b)
	{
		return a*b;
	}
	public static double div(double a,double b)
	{
		return a/b;
	}
	
	
}






































































//public class Calculator {
//	public static String getCalculator (double a, double b)
//	{
//		String result = switch() 
//		{
//		case '+' -> a+b;
//		case '-'-> yield (a-b);
//		case '/'-> a/b;
//		case '*'-> a*b;
//		case '%'-> a%b;
//        default -> IO.println("input");		
//		};
//	}
//
//}


//public class Calculator {
//
//    public static double calculate(double a, double b, char op) {
//
//        return switch (op) {
//            case '+' -> a + b;
//            case '-' -> a - b;
//            case '*' -> a * b;
//            case '/' -> {
//                if (b == 0) {
//                    System.err.println("❌ Cannot divide by zero!");
//                    yield 0;
//                }
//                yield a / b;
//            }
//            case '%' -> a % b;
//            default -> {
//                System.err.println("❌ Invalid Operator!");
//                yield 0;
//            }
//        };
//    }
//}
