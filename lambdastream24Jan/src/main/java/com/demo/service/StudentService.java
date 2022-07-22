package com.demo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.model.Address;
import com.demo.model.Result;
import com.demo.model.Student;
import com.demo.repo.StudentRepo;

import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

// Display the student Details where the names are starting with A

public class StudentService {

	private StudentRepo studentRepo = new StudentRepo();

	// Display the student Details where the names are starting with A
	public void displayNamesStartingWithA() {
		studentRepo.getAllStudents().stream().filter(student -> student.getName().startsWith("A"))
				.forEach(System.out::println);
	}

	// Display starting with the string passed from user
	public void displayNamesStartingWith(String start) {
		studentRepo.getAllStudents().stream().filter(student -> student.getName().startsWith(start))
				.forEach(System.out::println);
	}

	// Display starting with the character and the length
	public void displayNamesStartingWithAndLength(String start, int length) {
		studentRepo.getAllStudents().stream().filter(student -> student.getName().startsWith(start))
				.filter(student -> student.getName().length() > length).forEach(System.out::println);
	}

	// Display the count the people from Chennai
	public long displayCountStudentFromChennai() {
		return studentRepo.getAllStudents().stream().filter(student -> student.getAddress().getCity().equals("Chennai"))
				.count();
	}

	// Display the data sorted on student's name
	public void sortedOnNameReverseOrder() {
		studentRepo.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed())
				.forEach(System.out::println);

	}

	// Display the data sorted on city and then sort on name

	public void sortedOnCityName() {
		studentRepo.getAllStudents().stream().sorted(Comparator.comparing((Student stu) -> stu.getAddress().getCity())
				.thenComparing((Student stu2) -> stu2.getName())).forEach(System.out::println);

	}

	// Return a map with roll and name
	public void rollName() {
		Map<Integer, String> studentDetailsMap = studentRepo.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getRoll, Student::getName));
		System.out.println(studentDetailsMap);
	}

	// Getting a list
	public List<Student> studentNames() {
		List<Student> studentNames = studentRepo.getAllStudents().stream()
				.filter(student -> student.getName().startsWith("A")).collect(Collectors.toList());
		return studentNames;
	}

	// Getting the data as ArrayList

	public List<Student> studentNamesArrayList() {
		ArrayList<Student> studentNames = studentRepo.getAllStudents().stream()
				.filter(student -> student.getName().startsWith("A")).collect(Collectors.toCollection(ArrayList::new));
		return studentNames;
	}

	// Search for an id if the id isPresent display the details for the student
	// findAny non-Deterministic in nature
	// findFirst is having is deterministic
	// stream / parallerStreeam
	// Name ----> Abhay,Jagan,Julie,Rakesh
	// studentRepo.getAllStudents().parallelStream().filter(stud->stud.getName().startsWith("J")).findFirst()
	// Jagan
	// studentRepo.getAllStudents().parallelStream().filter(stud->stud.getName().startsWith("J")).findAny()
	// Jagan or Julie

	public void searchStudent(int roll) {
		// Optional<Student>
		// student=studentRepo.getAllStudents().stream().filter(stud->stud.getRoll()==roll).findAny();
		Optional<Student> student = studentRepo.getAllStudents().stream().filter(stud -> stud.getRoll() == roll)
				.findFirst();
		/*
		 * if(student.isPresent()) { System.out.println(student.get()); } else {
		 * System.out.println("Not Found"); }
		 */
		if (student.isEmpty()) {
			System.out.println("Empty");
		}

	}

	public void searchStudent2(int roll) {
		// Optional<Student>
		// student=studentRepo.getAllStudents().stream().filter(stud->stud.getRoll()==roll).findAny();
		Optional<Student> student = studentRepo.getAllStudents().stream().filter(stud -> stud.getRoll() == roll)
				.findFirst();
		student.ifPresent(System.out::println);

	}

	public void searchStudent3(int roll) {
		// Optional<Student>
		// student=studentRepo.getAllStudents().stream().filter(stud->stud.getRoll()==roll).findAny();
		Optional<Student> studentOptional = studentRepo.getAllStudents().stream().filter(stud -> stud.getRoll() == roll)
				.findFirst();
		// student.ifPresent(System.out::println);
		Student student = studentOptional
				.orElse(new Student(100, "Diptish", 12, new Address(888, "Kolkata"), new Result(90, "A")));
		System.out.println(student);
	}

	public void searchStudent4(int roll) {
		// Optional<Student>
		// student=studentRepo.getAllStudents().stream().filter(stud->stud.getRoll()==roll).findAny();
		Optional<Student> studentOptional = studentRepo.getAllStudents().stream().filter(stud -> stud.getRoll() == roll)
				.findFirst();
		// student.ifPresent(System.out::println);
		Student student = studentOptional.orElseThrow(RuntimeException::new);

	}

	// allMatch,noneMatch,anyMatch------> boolean
	// allMatch for Chennai -----> All the students Chennai

	// Check if someone we have atleast on student from Chennai
	public void atleastOneFromChennai() {
		boolean foundOne = studentRepo.getAllStudents().stream()
				.anyMatch(stud -> stud.getAddress().getCity().equals("Chennai"));
		System.out.println(foundOne);
		foundOne = studentRepo.getAllStudents().stream()
				.noneMatch(stud -> stud.getAddress().getCity().equals("Bangalore"));
		System.out.println(foundOne);
	}

	// display all the roll numbers
	
	public void allTheRolls()
	{
           studentRepo.getAllStudents().stream().mapToInt(Student::getStandard).forEach(System.out::println);		
	}
	
//display all the average score
	
	public void allTheAverageScore()
	{
		studentRepo.getAllStudents().stream().mapToDouble(student->student.getResult().getAvg()).forEach(System.out::println);
	}
	
	// 
	public List<String> allNames()
	{
		//return studentRepo.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
		return studentRepo.getAllStudents().stream().map(Student::getName).distinct().collect(Collectors.toList());
	}

	//grouping Collectors.groupingBy
	// Map, will be there  for grouping
	
	// Grouping on standard and displaying all the student details
	
	public Map<Integer,List<Student>> groupingStudentsBasedOnStandard()
	{
	 return studentRepo.getAllStudents().stream().collect(Collectors.groupingBy(Student::getStandard));
	}
	
	// Grouping on city and displaying all the student details
	public Map<String,List<Student>> groupingStudentBasedOnCity()
	{
		return studentRepo.getAllStudents().stream().
		collect(Collectors.groupingBy(stud->stud.getAddress().getCity()));	
	}
	
	//Grouping on city and displaying all the student names
	public Map<String,List<String>> groupingStudentBasedOnCityShowingName()
	{
		return studentRepo.getAllStudents().stream().collect(Collectors.
		groupingBy(stud->stud.getAddress().getCity(),Collectors.mapping(Student::getName,Collectors.toList())));	
	}
	
	//Grouping and Joining
	//Grouping on city and dusplaying all the student names but separated with comma
	
	public Map<String,String> getStudentsNameByCitySeparatedByComma()
	{
	return studentRepo.getAllStudents().stream().
	collect(Collectors.groupingBy(stud->stud.getAddress().getCity(),Collectors.mapping(Student::getName,Collectors.joining(":"))));	
	}
	
	// Grouping and filters 

	// I want to see people who are from Chennai
	public Map<String,List<Student>> groupingStudentBasedOnCityChennai()
	{
		return studentRepo.getAllStudents().stream().filter(student->student.getAddress().getCity().equalsIgnoreCase("chennai")).
		collect(Collectors.groupingBy(stud->stud.getAddress().getCity()));	
	}

	// Grouping and counting , count the number of students citywise
	public LinkedHashMap<String,Long> getStudentCountFromCities()
	{
		return studentRepo.getAllStudents().stream().
		collect(Collectors.groupingBy(student->student.getAddress().getCity(),LinkedHashMap::new,Collectors.counting()));
	}
	
	// Grouping with city as key and average of the average
	public Map<String,Double> getAverageCityWiseForTheScore()
	{
		return studentRepo.getAllStudents().stream().
				collect(Collectors.groupingBy(student->student.getAddress().getCity(),
				Collectors.averagingDouble(st->st.getResult().getAvg())));
	}
	// Grouping with standard and display the students with highest avg
	
	public void getHighestMarksStudents()
	{
		Map<Integer,Student> topStudents=studentRepo.getAllStudents().
		stream().collect(Collectors.groupingBy(Student::getStandard,
		collectingAndThen(Collectors.maxBy(comparingDouble(s->s.getResult().getAvg())),Optional::get)));
		System.out.println(topStudents);
	}
	
}





