package com.infy;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
// class Class {}
// Class cl=UserAuthentication.class
// class Employee {}
// Employee emp=new Employee();
// Object obj=new Object();
// Object obj=new Employee();

// This time we are catching the exception in the class or layer where we are not 
// supposed to catch the exception.
// That we are doing, so that if we want to log any error in this class or layer than we can do it here.
// But what about our way of handling exception where we are supposed to delegate the error to the UserInterface
// or tester class?
// just rethrow the exception from the catch block so that it is being handled in the UserInterface or
// tester class
public class UserAuthentication {
	
	Log logger = LogFactory.getLog(UserAuthentication.class);
	
	public void loginUser(String username, String password) throws Exception{
		try {
			if(username.isBlank() || password.isBlank()) {
				throw new Exception("Service.INVALID_CREDENTIALS");
			}
			logger.info(username+" logged in successfully");
		    } catch(Exception exception) {
			logger.error(exception.getMessage(), exception);
			throw exception;  // rethrowing  exception
		}
	}
}
