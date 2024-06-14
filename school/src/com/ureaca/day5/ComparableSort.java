package com.ureaca.day5;

import java.util.*;

public class ComparableSort {

	public static void main(String[] args) {
		
		int[] ia = {123, 987, 456};
		System.out.println(ia);
		
		System.out.println(Arrays.toString(ia));
		
		
		// sorting
		Arrays.sort(ia);
		System.out.println(Arrays.toString(ia));
		System.out.println("--------------------");
		Book[] ba = {
			new Book("456", "자바", 3000),
			new Book("123", "파이썬", 2000),
			new Book("789", "알고", 4000)
		};
		
 
		System.err.println(Arrays.toString(ba));
		
		Arrays.sort(ba);   // Book 클래스에서 compareTo 메소드를 오버라이드해둬야 sorting을 할 수 있다!!
		/**
		 * 커스텀 객체인 Book에서 compareTo 오버라이딩 안하고 
		 * Arrays.sort 하면 에러 발생!
		 */
		System.out.println(Arrays.toString(ba));
		
		Arrays.sort(ba, Comparator.reverseOrder());
		/**
		 *  역순 정렬을 할거면 Book 클래스에서 손 댈 필요 없이 그냥 Comparator.reverseOrder() 로 역순으로 정렬하는 거야!
		 */
		System.out.println(Arrays.toString(ba));
		System.out.println("--------------------");
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("3", "스프링", 3000));
		bl.add(new Book("2", "상속", 2000));
		bl.add(new Book("4", "인터페이스", 4000));
		System.out.println(bl);
		Collections.sort(bl);
		System.out.println(bl);
		Collections.sort(bl,Comparator.reverseOrder());
		System.out.println(bl);
	}

}
