package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberStreamDemo {

	public static void main(String args[])
	{
		int numbers[]= {2,3,10,20,5};
		IntStream numberStream=Arrays.stream(numbers);
		// System.out.println(numberStream.sum());   //terminal operation
		//System.out.println(numberStream.count());  //terminal operation
	    //System.out.println(numberStream.filter(n->n%2==0).sum());        //filter is the intermediate operation and sum is the terminal operation
		//System.out.println(numberStream.filter(n->n%2==0).count()); 
		//numberStream.filter(n->n%2==0).forEach(System.out::println);
		// sum up those numbers which are even and more than 2
		System.out.println(numberStream.filter(n->(n>2 && n%2==0)).sum());
		
		/*
		 * List<Integer> numberList=new ArrayList<>(); numberList.add(2);
		 * numberList.add(4);
		 */
		
		List<Integer> numberList=Arrays.asList(new Integer[] {5,7,8,10,20});
	    Stream<Integer> numberStreamList=numberList.stream();
		
		
		
		
	}
}
