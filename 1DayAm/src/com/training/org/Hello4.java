package com.training.org;

import java.util.Scanner;

public class Hello4 {
	
	public static void main(String[] args) {
		
		Scanner ur=new Scanner(System.in);
		System.out.println("Please enter any Four Digit Number");
		int num =ur.nextInt();
		String str = Integer.toString(num);
		if(str.length() !=  4) {
			System.out.println("invalid number");
			return;
		}
		System.out.println(str.charAt(0)+"000+"+str.charAt(1)+"00+"+str.charAt(2)+"0+"+str.charAt(3)+" => "+num);
		
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("Addition of Four Digit Number is = " +sum);
		
		

	}

}
