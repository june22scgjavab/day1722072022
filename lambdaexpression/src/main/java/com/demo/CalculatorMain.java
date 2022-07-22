package com.demo;

public class CalculatorMain {

	public static void main(String[] args) {
	/*
		     Calculator calc=(n1,n2)->  n1+n2;
             System.out.println(calc.add(2, 3));
	*/
	
		   Calculator calc=(n1,n2)->{
           if(n1>0 && n2>0)
           
		   return n1+n2;
                     
        	return 0;
		   };
           System.out.println(calc.add(2, 3));
	
	}
}
