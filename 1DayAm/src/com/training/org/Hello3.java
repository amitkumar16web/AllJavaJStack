package com.training.org;

import java.util.Scanner;

public class Hello3 {
	
	public static void add() {
		Scanner ur=new Scanner(System.in);
		System.out.println("Please enter 1st No");
		int num1 =ur.nextInt();
		System.out.println("Please enter 2nd No");
		int num2 =ur.nextInt();
		System.out.println("Add= "+(num1+num2));
	}
	
	
	
	public static void sub(int a, int b) {
		System.out.println("sub= "+(a-b));
	}
	
	
	public static int mul() {
		Scanner ur=new Scanner(System.in);
		System.out.println("Please enter 1st No");
		int num1 =ur.nextInt();
		System.out.println("Please enter 2nd No");
		int num2 =ur.nextInt();
		return num1+num2;
	}
	
	
	public static int div(int a,int b) {
		return a/b;
	}
	
	
	

	public static void main(String[] args) {
		//1
		Hello3.add();
		
		
		
		//2
		Scanner ur=new Scanner(System.in);
		System.out.println("Please enter 1st No");
		int num1 =ur.nextInt();
		System.out.println("Please enter 2nd No");
		int num2 =ur.nextInt();
		Hello3.sub(num1, num2);
		
		
		
		// 3
		System.out.println(Hello3.mul());
		
		

		//4
		/*
		Scanner ur=new Scanner(System.in);
		System.out.println("Please enter 1st No");
		int num1 =ur.nextInt();
		System.out.println("Please enter 2nd No");
		int num2 =ur.nextInt();
		System.out.println(Hello3.div(num1,num2));
		*/
		
	}

}
