package com.demo;


// we need to override the abstract methods

// If the two interfaces have same default method which a class is implementing , than we need to override the default method in the class
// Either you ovveride from the first interface or the second interface
// or you write your own overridden implementation

public class Customer implements IBankCustomer,IBankMyBankCustomer {

	
	@Override
	public void depositMoney() {
	 System.out.println("I am the deposit");

	}

	@Override
	public void withdrawlMoney() {
		System.out.println("I am the withdrawl");

	}

	/*
	 * @Override public double rateOfInterest() { // TODO Auto-generated method stub
	 * return IBankMyBankCustomer.super.rateOfInterest(); }
	 */

/*	@Override
	public double rateOfInterest() {
		// TODO Auto-generated method stub
		return IBankCustomer.super.rateOfInterest();
	}
*/
	
	@Override
	public double rateOfInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}




