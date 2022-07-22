package com.demo;

public class CalculatorApp {

	public static void main(String[] args) {
		
		/* Calculator calc=(num1,num2)->num1+num2; */
       Calculator calc=(num1,num2)->{
    	   if(num1>0 && num2>0)
    		   return num1+num2;
    	 return 0;  
       };
		
		System.out.println(calc.add(2,3));
	}

}
