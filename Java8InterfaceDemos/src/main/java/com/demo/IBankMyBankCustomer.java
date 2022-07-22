package com.demo;

public interface IBankMyBankCustomer {

	   void depositMoney();       //abstract methods
	   void withdrawlMoney();     //abstract methods
	   default double rateOfInterest()   //default method
	   {
		   return 10.5;
	   }
	  
	   static String bankName()   //static method
	   {
		   return "MyPiggy Bank";
	   }
	   
}
