package com.demo.lambdarevise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaRevise {

	private static List<String> names=new ArrayList<>();
	private static Map<String,String> studentDetails;
	
	static {
		//
		
		names.add("Ajay");
		names.add("Rajan");
		names.add("Ravinder");
		//names=Arrays.asList(new String[] {"Ajay","Rahul","Zuben","Ravinder"});
		studentDetails=new HashMap<String,String>();
		studentDetails.put("Ajay","Delhi");
		studentDetails.put("Rahul","Chennai");
		studentDetails.put("Zuben","Mumbai");
		}
	
	public static void displayNames()
	{
		//names.forEach(System.out::println);
		names.forEach(name->System.out.println(name));
	}
	
	public static void displayNamesAddress()
	{
		studentDetails.forEach((key,value)->System.out.println("Key:"+key+"\t"+"value:"+value));
	}
	
	public static void sortByName()
	{
		 Collections.sort(names,(name1,name2)->name2.compareTo(name1)); //descending sort
	     names.forEach(System.out::println);
	}
	
	public static void sortByLengthIfSameSortAlphabetically()
	{
		 Collections.sort(names,(name1,name2)->{
			 if(name1.length()>name2.length())
				 {
			          return 1;
				 }
			 else if(name1.length()<name2.length())
			 {
				    return -1;
			 }
			 else
			 {
				 return name1.compareTo(name2);
			 }
		 
		 }
				 );
	names.forEach(System.out::println);		
	}
	
	public static void removeNamesGreaterThan6Characters(String name)
	{
	   names.removeIf(nm->nm.equalsIgnoreCase(name) && nm.length()>6);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		removeNamesGreaterThan6Characters("ravinder");
		names.forEach(System.out::println);
	}

}
