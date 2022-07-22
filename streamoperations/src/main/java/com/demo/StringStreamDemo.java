package com.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStreamDemo {

	public static void main(String[] args) {
	
		String names[]= {"Ram","Ajay","Zuben","Ayub"};
		Stream<String> strStream=Arrays.stream(names);
		//System.out.println(strStream.count());
        //strStream.filter(str->str.startsWith("A")).forEach(System.out::println);
	    strStream.sorted().forEach(System.out::println);
	}

}
   