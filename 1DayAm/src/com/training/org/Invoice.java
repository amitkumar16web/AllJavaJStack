package com.training.org;

public class Invoice {
	
	private int id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public Invoice() {
		System.out.println("Default constructor is called");
	}
	
	public Invoice(int id,String desc,int qty,double unitPrice) {
		System.out.println("Parameterised constructor is called");
		this.id=id;
		this.desc=desc;
		this.qty= qty;
		this.unitPrice=unitPrice;
	}
	
	public void getTotal() {
		
		double ret =qty*unitPrice;
		System.out.println(ret);
		
		
	}
public void showInvoice() {
		
		
		System.out.println(id);
		System.out.println(desc);
		System.out.println(qty);
		System.out.println(unitPrice);
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		Invoice e1=new Invoice(67,"first..",4,2);
		
		e1.getTotal();
		e1.showInvoice();

	}

}
