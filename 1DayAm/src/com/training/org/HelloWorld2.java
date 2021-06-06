package com.training.org;

import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		Scanner ur=new Scanner(System.in);
		System.out.println("Please enter 1st No");
		int num1 =ur.nextInt();
		System.out.println("Please enter 2nd No");
		int num2 =ur.nextInt();
		System.out.println("Add= "+(num1+num2));
		System.out.println("Sub= "+(num1-num2));
		System.out.println("Mul= "+(num1*num2));
		System.out.println("Div= "+(num1/num2));
		

	}

}
