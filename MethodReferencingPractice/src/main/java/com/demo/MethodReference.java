package com.demo;

public class MethodReference {

	public static void saySomething()
	{
		System.out.println("Hello, this is static method");
	}
	public static void main(String[] args) {
		Sayable sayble=MethodReference::saySomething;
        sayble.say();
	}

}
