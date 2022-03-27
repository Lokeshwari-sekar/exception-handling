package com.ExceptionHandling;

import java.util.Scanner;

public class UsingTRyCatchFinally 
{

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		a=sc.nextInt();
		
		System.out.println("Enter the second value");
		b=sc.nextInt();
		try//if the error comes it will work
		{
			System.out.println("try block");
		    c=a/b;
		}
		catch(ArithmeticException e)//
		{
			e.printStackTrace();
			System.out.println("catch block");
		
		}
		finally
		{
			
			System.out.println("finally block");
			sc.close();
		}
		
		
	}

}
