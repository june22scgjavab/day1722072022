package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class ReduceImpl {

	public static void main(String[] args) {
		
		  List<Book> bookList=Arrays.asList(new Book[] {
		    		 new Book(1,"Java",500),
		    		 new Book(2,"Html",100),
		    		 new Book(3,"Asp.net",100), 
		     });
		  int numbers[]= {2,3,4,5,6};
		OptionalInt sum=Arrays.stream(numbers).reduce((a,v)->a+v);
		System.out.println(sum.getAsInt());
		
		OptionalDouble sum2=bookList.stream().mapToDouble(Book::getPrice).reduce((add,value)->add+value);
        System.out.println(sum2.getAsDouble());

        Optional<String> stringConcat= bookList.stream().map(Book::getTitle).reduce((addStr,value)->addStr+","+value);
	    System.out.println(stringConcat.get());
	
	 
	} 

}
