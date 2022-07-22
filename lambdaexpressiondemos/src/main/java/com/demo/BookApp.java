package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookApp {

	public static void main(String[] args) {
		
		List<Book> bookList=new ArrayList<>();
		bookList.add(new Book(1,"HTML5",200f));
		bookList.add(new Book(2,"Java",700f));
		bookList.add(new Book(3,"JavaScript",300f));
		bookList.add(new Book(4,"Asp.net",800f));
        System.out.println("<----------Before Sorting---------->");
        for(Book book : bookList)
        {
        	System.out.println(book);
        }
      //  System.out.println("<----Using anonymous class to sort----------->");
		/*
		 * Collections.sort(bookList, new Comparator<Book>() {
		 * 
		 * @Override public int compare(Book arg0, Book arg1) { return
		 * (arg0.getPrice()>arg1.getPrice()?1:-1); }
		 * 
		 * 
		 * });
		 */
      // System.out.println("<----Using Lambda expression for sorting----------->");
      // Collections.sort(bookList,(book1,book2)->book1.getPrice()>book2.getPrice()?1:-1);
              
		/*
		 * for(Book book : bookList) { System.out.println(book); }
		 */
       //bookList.forEach(book->System.out.println(book)); 
       //  Classname::methodName
       
       //bookList.forEach(System.out::println);
		System.out.println("<----------------sorting-----------------------------");
        Collections.sort(bookList,Comparator.comparing(Book::getTitle));
        bookList.forEach(System.out::println);
	}

}




