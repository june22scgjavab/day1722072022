package com.demo.app;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

import com.demo.repo.StudentRepo;

public class ReducingImpl {

	public static void main(String[] args) {
		
		OptionalInt sum=Arrays.stream(new int[] {3,4,5,6}).reduce((add,num)->add+num);
        System.out.println(sum.getAsInt());
        StudentRepo repo=new StudentRepo();
        
        Optional<String> optString=repo.getAllStudents().stream().map(s->s.getName()).reduce((cnt,str)->cnt+","+str);
        System.out.println(optString.get());
        
        
	}

}
