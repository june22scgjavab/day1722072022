package com.demo.repo;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Address;
import com.demo.model.Result;
import com.demo.model.Student;

public class StudentRepo {

	    private List<Student> studentList=new ArrayList<>();
	    
	    public StudentRepo()
	    {
	    	studentList.add(new Student(1,"Ram",1,new Address(111,"Delhi"),new Result(80,"A")));
	    	studentList.add(new Student(1,"Akash",1,new Address(222,"Chennai"),new Result(56,"C")));
	    	studentList.add(new Student(2,"Radha",1,new Address(555,"Chennai"),new Result(60,"B")));
	    	studentList.add(new Student(1,"Satish",1,new Address(666,"Mumbai"),new Result(90,"A")));
	    	studentList.add(new Student(2,"Sumita",1,new Address(222,"Mumbai"),new Result(45,"C")));
	    	studentList.add(new Student(1,"Sumita",2,new Address(1,"Mumbai"),new Result(80,"A")));
	    	studentList.add(new Student(1,"Mohan",1,new Address(777,"Kolkata"),new Result(50,"C")));
	    	studentList.add(new Student(2,"Subhasish",1,new Address(222,"Kolkata"),new Result(50,"C")));
	    	studentList.add(new Student(1,"Deepa",2,new Address(70,"Kolkata"),new Result(70,"A")));
	    	studentList.add(new Student(2,"Rohit",2,new Address(701,"Kolkata"),new Result(70,"A")));
	    	studentList.add(new Student(1,"Alok",1,new Address(888,"Kanpur"),new Result(90,"A")));
	    	studentList.add(new Student(2,"Jyotsna",1,new Address(888,"Kanpur"),new Result(90,"A")));
	    	studentList.add(new Student(1,"Ahmed",2,new Address(888,"Kanpur"),new Result(90,"A")));
	    	studentList.add(new Student(2,"John",2,new Address(888,"Kanpur"),new Result(90,"A")));
	    	studentList.add(new Student(1,"Sunita",3,new Address(888,"Kanpur"),new Result(90,"A")));
	    	studentList.add(new Student(2,"gurdeep",3,new Address(888,"Kanpur"),new Result(90,"A")));
	    	studentList.add(new Student(2,"Rohit",1,new Address(222,"Delhi"),new Result(80,"A")));
	    	studentList.add(new Student(3,"Reema",1,new Address(12,"Delhi"),new Result(65,"B")));
	    	studentList.add(new Student(2,"Sumita",2,new Address(2,"Mumbai"),new Result(65,"B")));
	    	studentList.add(new Student(3,"Sumita",2,new Address(211,"Mumbai"),new Result(65,"B")));
	    }
	
	   public List<Student> getAllStudents()
	   {
		   return studentList;
	   }
	    
	    
	    
}
