package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamDemo {

	public static void main(String[] args) {
		   
		List<Student> studentList=Arrays.asList(new Student[] {
				new Student(1,"John",45),
				new Student(2,"Rakesh",70),
				new Student(3,"Geeta",80)
		});
	Stream<Student>  studentStream=studentList.stream();
	studentStream.filter(student->student.getMarks()>=70).sorted((student1,student2)->student1.getMarks()>student2.getMarks()?1:-1).forEach(System.out::println);
	}

}
