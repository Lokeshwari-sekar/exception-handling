package com.ExceptionHandling;

import java.util.Scanner;

public class CustomEx
{

	public static void main(String[] args)
	{
		String firstname=null,lastname=null;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your first name");
			sc.next();
			firstname=sc.nextLine();
			if(firstname==null)
			{
				System.out.println("error occured int the firstname");
			}
			else
			{
				System.out.println("First name is"+firstname);
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		try
		{
			System.out.println("Enter your second name");
			lastname=sc.nextLine();
			if(lastname==null)
			{
				System.out.println("second name is null ");
			}
			else {

				System.out.println("Last name is"+lastname);
			}
		}
		catch(NullPointerException r)
		{
			r.printStackTrace();
		}

sc.close();
	}

}
