package com.ureca.day5;

import java.util.*;

// () -> {} 이게 람다


public class LambdaSort {
	public static void main(String[] args) {
	
		Book[] ba = {
			new Book("456", "자바", 3000),
			new Book("123", "파이썬", 2000),
			new Book("789", "알고", 4000)
		};
		
		System.out.println(Arrays.toString(ba));  
		
		// 이게 람다 활용한 방법(암기할 것)
		Arrays.sort(ba, (Book o1, Book o2) -> { return o1.title.compareTo(o2.title);});
		Arrays.sort(ba, (Book o1, Book o2) -> o1.title.compareTo(o2.title));    // return이랑 중괄호 없애도 가능
		
		/**
		 * () -> {}, 소괄호 -> 중괄호
		 */
		
		System.out.println(Arrays.toString(ba));
		System.out.println("--------------------");
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("3", "스프링", 3000));
		bl.add(new Book("2", "상속", 2000));
		bl.add(new Book("4", "인터페이스", 5000));
		bl.add(new Book("4", "인터페이스", 1000));
		System.out.println(bl);
		
		Arrays.sort(ba, Comparator.comparing(t->t.title)); // 이렇게도 가능~!!
		Arrays.sort(ba, Comparator.comparing(Book::getTitle)); // 이렇게도 가능~!!
		
		
		Collections.sort(bl, (Book o1, Book o2) -> { return o1.title.compareTo(o2.title);});
		Collections.sort(bl, (Book o1, Book o2) -> o1.title.compareTo(o2.title));
		
		System.out.println(bl);

	}

}
