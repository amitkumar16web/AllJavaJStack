package com.a4;

class Machine{
	public void start() {
		System.out.println("Machine is started");
	}
}


class Laptop extends Machine{
	@Override
	public void start() {
		System.out.println("Laptop is started");
	}
	
	public void stop() {
		System.out.println("Laptop is stopped");
	}
}



public class MethodOverridingExample {
	public static void main(String[] args) {
		Machine machine=new Machine();
		machine.start();
		
		Laptop laptop=new Laptop();
		laptop.start();
		laptop.stop();
		
		
	//	Machine machine1=new Machine();
		//Laptop laptop1=(Laptop)machine1;
		
		
		
		
		
		
		
	}
}
