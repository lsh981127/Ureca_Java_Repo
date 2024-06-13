package com.ureca.school;

public non-sealed class Teacher extends Person{
	private String name;
	private int age;
	private String subj;
	
	public Teacher(String name, int age, String subj) {
		super(name, age);
		setSubj(subj);
	}
	
	public Teacher() {
		this("기본", 99, "자바");
	}
	

	public String getSubj() {
		return subj;
	}

	public void setSubj(String subj) {
		this.subj = subj;
	}
	
	@Override
	public String toString() {
		return super.toString() + getSubj();
	}
	
	

	public void printAll() {
		super.printAll();
		
	}
	
	
	
	
}
