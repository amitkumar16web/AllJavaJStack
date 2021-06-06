package com.a2;

abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape constructor is called");
		this.color=color;
		
	}
	
	public String getColor() {
		return color;
		
	}
}



class Circle extends Shape{

	double radious;
	
	public Circle(String color,double radious) {
		super(color);
		System.out.println("Circle is called");
		this.radious=radious;
	}
	
	@Override
	double area() {
		
		return Math.PI * Math.pow(radious,2);
	}

	@Override
	public String toString() {
		
		return "Circle color is"+super.getColor()+"And area is "+area();
	}
	
}




public class AbstractClassExample {
	
	public static void main(String[] args) {
	
		Shape s1=new Circle("Red",2.2);
		System.out.println(s1);
		
		
	}

}

