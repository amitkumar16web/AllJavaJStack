package com.training.org;

import java.util.Scanner;

public class MethodExample {

	public static void addition() {
		System.out.println("Hello Welcome to JAVA Programming");

		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=myObj.nextInt();
		int num2=myObj.nextInt();
		
		System.out.println("Addition of numbers is "+(num1+num2));
	
	}
	
	public static void substraction(int a,int b) {
		
		System.out.println("sub "+(a-b));
		
	}
	
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		char ch='y';
		do
		{
			System.out.println("1] Addition\n2] Subtraction\n3] Multiplication\n4] Division\n\nEnter your choice");
			int choice=myObj.nextInt();
			
			switch(choice) {
			case 1:
					addition();
					break;
			case 2:
					System.out.println("Enter two numbers");
					int num1=myObj.nextInt();
					int num2=myObj.nextInt();
					
					substraction(num1,num2);
					
					break;
						
				
			}
			System.out.println("Do you want to continue.....y/n");
			ch=myObj.next().charAt(0);
		}while(ch=='y'||ch=='Y');
			
		if(ch=='n'||ch=='N') {
			System.out.println("Thank you visit again");
		}

	}

}
