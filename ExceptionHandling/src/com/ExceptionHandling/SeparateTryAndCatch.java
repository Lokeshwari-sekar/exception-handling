package com.ExceptionHandling;

public class SeparateTryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0, c;
		int arr[]=new int[5];
		try 
		{
			System.out.println("try block execution division part");
		    c=a/b;
		    System.out.println(c);
		    
		}
		catch(ArithmeticException e)
		{
			System.out.println("first catch block execution");
			
			e.printStackTrace();
		}
		try
		{
			System.out.println("try block execution array index part");
			arr[6]=100;
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println("second catch block execution");
			r.printStackTrace();
			
		}
		finally
		{
			System.out.println("finally block execution");
		}

	}

}
