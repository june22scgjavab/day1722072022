package com.demo.app;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.demo.model.Student;
import com.demo.service.StudentService;

public class StudentApp {

	
	
public static void main(String args[])
{
	StudentService service=new StudentService();
	//service.displayNamesStartingWithA();
	//service.displayNamesStartingWith("R");
	//service.displayNamesStartingWithAndLength("R",3);
    //System.out.println(service.displayCountStudentFromChennai());
     //service.sortedOnNameReverseOrder();
    // service.rollName();
    //service.sortedOnCityName();
	//service.searchStudent2(1);
	//  System.out.println(service.studentNames());
	//service.searchStudent4(90);
	//service.atleastOneFromChennai();
    //Map<Integer,List<Student>> map=  service.getStudentsByStandard();
    //map.forEach((key,value)->System.out.println(key+"\n"+value));
		/*
		 * Map<String,List<Student>> map= service.getStudentsByCityFromChennai();
		 * map.forEach((key,value)->System.out.println("\n"+key+"\n\n"+value));
		 */
		/*
		 * Map<String,Long> studentCount=service.getStudentCountFromCities();
		 * studentCount.forEach((key,value)->System.out.println(key+"\t"+value));
		 */
	
		/*
		 * Map<String,Double> studentAverage=service.getAverageCityWise();
		 * studentAverage.forEach((key,value)->System.out.println(key+"\t"+value));
		 */
		/*
		 * Map<String,Optional<Student>>
		 * studentHighestAverage=service.getMaxAverageOfStudentCityWise();
		 * studentHighestAverage.forEach((key,value)->System.out.println(key+"\t"+value)
		 * );
		 */

       // service.getStudentsNameforEach(arg0)ByCity().forEach((key,value)->System.out.println(key+"\t"+value));
   
	   //   service.getStudentsNameByCitySeparatedByComma().forEach((key,value)->System.out.println(key+"\t"+value));

      //   service.getStudentsByCityScoredMoreThan80().forEach((key,value)->System.out.println(key+"\t"+value));  
     
	 //    service.getStudentsNameSortedByCitySeparatedByComma().forEach((key,value)->System.out.println(key+"\t"+value)); 

      // service.getStudentsByCitySortedReverse().forEach((key,value)->System.out.println(key+"\t"+value));
	
	//service.getHighestRoll();
     //service.getHighestMarks();
	
	// 27-Jan-2020
	// All the rolls
	//service.allTheRolls();
	
	//service.allTheAverageScore();
	//System.out.println(service.allNames());
	//System.out.println(service.groupingStudentsBasedOnStandard());
	//System.out.println(service.groupingStudentBasedOnCity());
	// System.out.println(service.groupingStudentBasedOnCityShowingName());
	//System.out.println(service.getStudentsNameByCitySeparatedByComma());
	//System.out.println(service.groupingStudentBasedOnCityChennai());
    // System.out.println(service.getStudentCountFromCities());
    // System.out.println(service.getAverageCityWiseForTheScore());
    service.getHighestMarksStudents();
}
}     
