package com.training.org4;

class Student{
	String name;
	int rollNo;
	static String cllgName;
	
	
	static int counter=0;
	
	
	public Student(String name) {
		this.name=name;
		this.rollNo=setRollNo();
	}
	
	static int setRollNo() {
		counter++;
		return counter;
	}
	
	
	static void setCllgName(String name) {
		cllgName=name;
	}
	
	void showStudentInfo() {
		System.out.println("Name > "+this.name);
		System.out.println("Roll no> "+this.rollNo);
		System.out.println("col name> "+cllgName);
	}
	
}



public class StaicExample {

	
	public static void main(String[] args) {
		Student.setCllgName("Noida");
		
		Student s1=new Student("Gagandeep");
		Student s2=new Student("Rahul");
		
		s1.showStudentInfo();
		s2.showStudentInfo();
	}
}



