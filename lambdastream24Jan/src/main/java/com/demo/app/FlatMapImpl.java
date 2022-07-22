package com.demo.app;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapImpl {

	public static void main(String[] args) {
		
		Integer[] array1= {1,2,3,4,5};
		Integer[] array2= {6,7,8,9,10};
		Stream<Integer[]> streamArray=Stream.of(array1,array2);
		IntSummaryStatistics data=streamArray.flatMap(Arrays::stream).collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println(data.getAverage());
        System.out.println(data.getCount());
        System.out.println(data.getMax());
        System.out.println(data.getMin());
		
        
        
	}

}
