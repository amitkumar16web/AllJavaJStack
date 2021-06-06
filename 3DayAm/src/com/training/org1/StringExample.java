package com.training.org1;

public class StringExample {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("HEllo");
		sb.append("String");
		
		System.out.println(sb);
		
		sb.insert(1, "NEW");
		System.out.println(sb);
		
		
		
		sb.replace(1,3,"JAVA");
		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);
		
		// String class
		
//		String s1="Hello String";
//		char ch[]= {'s','t','r','i','n','g'};
//		
//		String s2=new String(ch);
//		
//		String s3=new String("Example string");
//		
//		System.out.println(s3.length());
//		
//		System.out.println(s3.concat("New STring"));
//		
//		System.out.println(s3.indexOf('a'));
//		
//		System.out.println(s3.charAt(0));
//		
//		System.out.println(s3.hashCode());
//		System.out.println(s3);
//				
				
		
		
	}

}




