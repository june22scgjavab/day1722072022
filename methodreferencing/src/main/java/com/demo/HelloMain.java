package com.demo;

public class HelloMain {

	public static void main(String[] args) {
		
		IHelloReference hello=Hello::new;
		hello.getHello("Welcome");

	}

}
