package com.infy.demo.ignorecase;

public class Demo2 {

	public static void main(String[] args) {
	String pattern1="abc";
	System.out.println("abc ".matches(pattern1));  
	System.out.println("abc".matches(pattern1));
	String pattern2="^A.*"; //^ Start of a String where you want to match this pattern
	                        // . means any character which can be any alphabet,special character,
	                        // digits 
	                        // * 0 or more occurence of the preceeding character or meta character.
	                        // .* 0 or more occurance of any character
	System.out.println("A".matches(pattern2));
	System.out.println("Ab$".matches(pattern2));
	String pattern3="A.+"; // We have start with A and after that atleast we should have 1 
	                       // character or we can have more
	System.out.println("A".matches(pattern3));
	System.out.println("Ab".matches(pattern3));
	String pattern4="A.?"; // 0 or 1 after the uppercase A
	System.out.println("A".matches(pattern4));
	System.out.println("Ab".matches(pattern4));
	System.out.println("Abbnnvnb".matches(pattern4));
	String pattern5="^A[a-z]+$"; 
	System.out.println("Abbnnvnb".matches(pattern5));	
	System.out.println("Bbbnnvnb".matches(pattern5));	
	String pattern6="^[A-Z][a-z]+$";
	System.out.println("Bbbnnvnb".matches(pattern6));	
	System.out.println("Bbbnnvn4".matches(pattern6));	
	String pattern7="^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
	System.out.println("Hello".matches(pattern7));	
	String pattern8="^([A-Z][a-z]+)(\\s[A-Z][a-z]+)+$";
	System.out.println("Hello".matches(pattern8));	
	System.out.println("Hello World".matches(pattern8));	
	System.out.println("Hello World Bye".matches(pattern8));
	String pattern9="^([A-Z][a-z]{2,})(\\s[A-Z][a-z]+)+$";
	System.out.println("Hi World Bye".matches(pattern9));
	String pattern10="\\d{3}"; // No repeating character \\?!
	System.out.println("000".matches(pattern10));
	System.out.println("012".matches(pattern10));
	String pattern11="\\d{10}"; // No repeating character \\?!
	System.out.println("012".matches(pattern11));
	System.out.println("0123456789".matches(pattern11));
	String pattern12="[^a-z0-9][a-z]+";
	System.out.println("Aabc".matches(pattern12));
	System.out.println("aabc".matches(pattern12));
	String pattern13=".*Hello.*";
	System.out.println("Hi Hello bye".matches(pattern13));
	System.out.println("Hello bye".matches(pattern13));
	System.out.println("bye Hello".matches(pattern13));
	// ignoring the case
	// avoiding the repeated characters
	}

}
