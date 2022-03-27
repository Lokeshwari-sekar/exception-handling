package com.ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) 
	{
		int a=10, b=0;
		int arr[]=new int[5];
		try {
			System.out.println("try block execution");
		    int  c=a/b;
		    System.out.println(c);
		    arr[6]=100;
		}
		catch(ArithmeticException e)
		{
			System.out.println("first catch block execution");
			
			e.printStackTrace();
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
