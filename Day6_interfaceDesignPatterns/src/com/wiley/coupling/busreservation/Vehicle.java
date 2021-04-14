package com.wiley.coupling.busreservation;

public interface Vehicle {

	default  void  put() {System.out.println("Private Function in Interfacess");}
	public  default void get()  // defining a method
	{
		put();
		func1();
	}
	public void move(); //declaration
	
	static void func1() {System.out.println("i am static");}
}