package com.ureca.school;

public non-sealed class Employee extends Person{
	private String name;
	private int age;
	private char dept;
	
	public Employee(String name, int age, char dept) {
		super(name, age);
		setDept(dept);
	}
	
	public Employee() {
		this("기본", 20, 'a');
	}
	
	public char getDept() {
		return dept;
	}
	public void setDept(char dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + getDept();
	}
	

	public void printAll() {
		super.printAll();
		
	}
	
	
	

}