package com.ureca.day4;

public class EqualsTest {

	public static void main(String[] args) {
		String s1 = new String("이승훈");
		String s2 = new String("이승훈");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("");
		
		Car c1 = new Car("차", 2024);
		Car c2 = new Car("차", 2024);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));    // False, 왜? c1, 과 c2는 다른 객체니까
		
		System.out.println("");
		
		
		
	}

}