package com.ExceptionHandling;

import java.util.Scanner;

public class UsingArrayException {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<a.length+1;i++)
		{
			try
			{
			a[i]=sc.nextInt();

			
			}
		    catch(ArrayIndexOutOfBoundsException e)
		     {
		    	System.out.println("catch block");
			     e.printStackTrace();
		     }
		
		}
		System.out.println("other statements after try block");
		sc.close();	

	}

}
