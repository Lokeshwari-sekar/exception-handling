package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		/*String name;
		int age;
		float salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		age=sc.nextInt();
	    System.out.println("Enter the name: ");
		name=sc.nextLine();
	    System.out.println("Enter the salary: ");
		salary=sc.nextFloat();
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		sc.close();*/
		String name="";
		int age=0;
		float sal=0.0f;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		//or
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name");

		name = br.readLine();
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter sal");
		sal=Float.parseFloat(br.readLine());

		System.out.println("Details of Employee");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("sal="+sal);

		}




		
		
		
		

	}


