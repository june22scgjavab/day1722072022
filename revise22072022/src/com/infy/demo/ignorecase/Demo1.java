package com.infy.demo.ignorecase;

public class Demo1 {

public static void main(String[] args) {
  System.out.println(validateIdProof("Passport"));
  System.out.println(validateIdProof("Voterid"));
  

	}

	private static boolean validateIdProof(String string) {
	   
	
		
		return "passport".equalsIgnoreCase(string) || "voterid".equalsIgnoreCase(string);
	}

}
