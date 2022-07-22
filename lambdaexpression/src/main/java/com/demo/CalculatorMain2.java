package com.demo;

public class CalculatorMain2 {

	public static void main(String[] args) {
	
		   Calculator calc=new Calculator() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			   
			   
		   };
           System.out.println(calc.add(3, 4));
	}

}
