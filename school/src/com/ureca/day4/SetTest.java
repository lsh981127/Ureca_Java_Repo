package com.ureca.day4;
import java.util.*;
public class SetTest {

	public static void main(String[] args) {
		Set<String> s = null;
		// 비순서
		s = new HashSet<>();
		s.add("이승훈");
		s.add("M2");
		s.add("M3");
		System.out.println(s);
		s.add("이승훈");
		System.out.println(s);
		
		// 저장한 순서대로
		System.out.println("---LinkedHashSet--------");
		s = new LinkedHashSet<>();
		s.add("이승훈");
		s.add("M2");
		s.add("M3");
		System.out.println(s);
		s.add("이승훈");
		System.out.println(s);
		
		
		
		// 오름차순 정렬
		System.out.println("---TreeSet--------");
		s = new TreeSet<>();
		s.add("이승훈");
		s.add("M2");
		s.add("M3");
		System.out.println(s);
		s.add("이승훈");
		System.out.println(s);
		System.out.println("-----출력-----");
		for(String t:s) System.out.println(t);
		
		
		
	}

}
