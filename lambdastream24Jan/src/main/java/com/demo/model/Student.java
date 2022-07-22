package com.demo.model;

public class Student {
    private int roll;
    private String name;
    private int standard;
   	private Address address;
    private Result result;
	public int getRoll() {
		return roll;
	}
	
	
	public Student(int roll, String name, int standard,Address address, Result result) {
		super();
		this.roll = roll;
		this.name = name;
		this.standard=standard;
		this.address = address;
		this.result = result;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 public int getStandard() {
			return standard;
		}


		public void setStandard(int standard) {
			this.standard = standard;
		}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "\nroll=" + roll + "\nname=" + name + "\naddress:" + address + "\nresult:"+result;
	}
    
    
    
	   
}
