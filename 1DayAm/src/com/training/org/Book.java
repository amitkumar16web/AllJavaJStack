package com.training.org;

public class Book {
	
	private String name;
	private String author;
	private int qty;
	private double price;
	
	public Book() {
		System.out.println("Default constructor is called");
	}
	
	public Book(String name,String author,int qty, double price) {
		System.out.println("Parameterised constructor is called");
		this.name=name;
		this.author=author;
		this.qty= qty;
		this.price=price;
	}
	
    public void showBook() {
		System.out.println(name);
		System.out.println(author);
		System.out.println(qty);
		System.out.println(price);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
	//	Book obj = new Book("Sir","java",1,1000);
	//	obj.showBook();
		// using Arraylist
		
	}

}
