package com.ureca.day4;

public class RecordTest {
	record Member(String id, String name, int age) {
		
	}
	public static void main(String[] args) {
		Member m1 = new Member("winter", "눈송이", 25);
		System.out.println(m1.id() + " " + m1.name() + " " + m1.age());
		System.out.println(m1.toString());
		
		Member m2 = new Member("winter2", "눈송이2", 25);
		System.out.println(m2.id() + m2.name() + m2.age());
		System.out.println(m2.toString());
		
		System.out.println(m1.hashCode() + " " + m2.hashCode());
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		
		
	}

}
