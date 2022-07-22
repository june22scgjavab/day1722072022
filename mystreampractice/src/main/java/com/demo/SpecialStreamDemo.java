package com.demo;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SpecialStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stream.iterate(20,n->n+2).limit(5).forEach(System.out::println);
	
	  List<Book> bookList=Arrays.asList(new Book[] {
	    		 new Book(1,"Java",500),
	    		 new Book(2,"Html",100),
	    		 new Book(3,"Asp.net",100), 
	     });
	DoubleSummaryStatistics summary=bookList.stream().mapToDouble(Book::getPrice).summaryStatistics();
   System.out.println(summary.getAverage());

Optional<Book> optional=bookList.stream().filter(book->book.getTitle().equals("JavaScript")).findAny();
		/*
		 * if(optional.isPresent()) { System.out.println(optional.get()); }
		 */
optional.ifPresent(System.out::println);
//Book book=optional.orElse(new Book(4,"JavaScript",300));
//System.out.println(book);

//optional.orElseThrow(RuntimeException::new);
    
 
if(optional.isEmpty())
{
	System.out.println("Not found");
	//System.out.println(optional.get());
}
	
	}
	
	
}
