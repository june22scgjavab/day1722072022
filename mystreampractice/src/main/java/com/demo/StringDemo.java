package com.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringDemo {

	public static void main(String[] args) {
		String str[]= {"Ram","Abhi","Shayam","Zuben","Azan"};
        Stream<String> strStream=Arrays.stream(str);
       //System.out.println(strStream.count());
       //strStream.filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
       //strStream.sorted().forEach(s->System.out.println(s));
	   //strStream.sorted((s1,s2)->s2.compareTo(s1)).forEach(s->System.out.println(s));
	}

}
