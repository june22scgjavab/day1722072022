package com.demo;

public class CustomerMain {

	public static void main(String[] args) {
		
		IBankCustomer customer=new Customer();
		customer.depositMoney();
		customer.withdrawlMoney();
		System.out.println(customer.rateOfInterest());  // accessing the default method of the interface
		System.out.println(IBankCustomer.bankName());
				

	}

}
