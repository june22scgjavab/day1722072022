package com.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Parallel Stream

public class BookMain {

	public static void main(String[] args) {
		
		     List<Book> bookList=Arrays.asList(new Book[] {
		    		 new Book(1,"Java",500),
		    		 new Book(2,"Html",100),
		    		 new Book(3,"Asp.net",100), 
		     });
		     
		   Stream<Book>   bookStream=bookList.stream();
          /* bookStream.map(Book::getTitle).forEach(System.out::println);*/
	
		/*
		 * List<String>
		 * bookLists=bookStream.map(Book::getTitle).collect(Collectors.toList());
		 * bookLists.forEach(System.out::println);
		 */
		/*
		 * LinkedList<String>
		 * bookLists2=bookStream.map(Book::getTitle).collect(Collectors.toCollection(
		 * LinkedList::new)); bookLists2.forEach(System.out::println);
		 */
	
	Map<Integer,String> mapData=bookStream.collect(Collectors.toMap(Book::getId, Book::getTitle));
    mapData.forEach((key,value)->System.out.println(key+"\t"+value));
	
	
	}


	
}
