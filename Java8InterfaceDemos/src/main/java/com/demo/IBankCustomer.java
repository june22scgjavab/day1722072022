package com.demo;

// Java 8 interfaces

public interface IBankCustomer {

	   void depositMoney();       //abstract methods
	   void withdrawlMoney();     //abstract methods
	   default double rateOfInterest()   //default method
	   {
		   return 4.5;
	   }
	  
	   static String bankName()   //static method
	   {
		   return "Allinz Bank";
	   }
	   
	  
}
