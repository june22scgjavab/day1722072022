package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberDemo {

	public static void main(String[] args) {
	    int numbers[]= {1,2,3,4,5,6};
        IntStream numberStream=Arrays.stream(numbers);
        //System.out.println(numberStream.sum());
       //System.out.println(numberStream.count());
       //System.out.println(numberStream.filter(n->n%2==0).sum());
	   //System.out.println(numberStream.filter(n->n%2==0).count());
	   //numberStream.filter(n->n%2==0).forEach(n->System.out.println(n));
	   //System.out.println(numberStream.filter(n->(n>2 && n%2==0)).sum());
	   
	   List<Integer> numberList=Arrays.asList(new Integer[]{1,2,3,4,5});
       Stream<Integer> numberStreamList=numberList.stream();
       //System.out.println(numberStreamList.count());
	   numberStreamList.filter(n->n%2==0).forEach(n->System.out.println(n));
       
	}

}
