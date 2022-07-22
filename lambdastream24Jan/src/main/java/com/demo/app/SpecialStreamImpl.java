package com.demo.app;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

import com.demo.repo.StudentRepo;

//Infinite methods
public class SpecialStreamImpl {

	public static void main(String[] args) {
		
       //Stream.iterate(100,n->n+2).limit(5).forEach(System.out::println);
		  
		 // Stream.generate(Math::random).limit(5).forEach(System.out::println);
		  StudentRepo repo=new StudentRepo(); 
		  DoubleSummaryStatistics summary=repo.getAllStudents().stream().mapToDouble(stu->stu.getResult().
		  getAvg()).summaryStatistics(); System.out.println(summary.getSum());
		 
	}

}
   