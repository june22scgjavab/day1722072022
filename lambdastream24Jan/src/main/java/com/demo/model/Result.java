package com.demo.model;

public class Result {

	  private float avg;
	  private String grade;
	  
	public Result(float avg, String grade) {
		super();
		this.avg = avg;
		this.grade = grade;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "\navg=" + avg + "\ngrade=" + grade;
	}
	  
	  
	
}
