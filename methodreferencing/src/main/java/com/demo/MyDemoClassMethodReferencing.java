package com.demo;

public class MyDemoClassMethodReferencing {

	public static void helloWorld()
	{
		System.out.println("Hello World !!! ");
	}
	
	public static void main(String[] args) {
		
		ReferencingInterface reference=MyDemoClassMethodReferencing::helloWorld;
        reference.messsage();
	}

}
