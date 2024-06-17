package com.ureca.day5;

import java.util.*;

class TitleComparator implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.title.compareTo(o2.title);
	}
}

class PriceComparator implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return Integer.compare(o1.price, o2.price);
	}
}

class TitlePriceComparator implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.title.equals(o2.title) ? Integer.compare(o1.price, o2.price): o1.title.compareTo(o2.title);
	}
}


public class ComparatorSort {

	public static void main(String[] args) {
		Comparator tc = new TitleComparator();
		Comparator pc = new PriceComparator();
		Comparator tpc = new TitlePriceComparator();
		/*
		 * int[] ia = {123, 987, 456}; System.out.println(Arrays.toString(ia));
		 * Arrays.sort(ia);
		 * 
		 * System.out.println(Arrays.toString(ia));
		 * System.out.println("--------------------");
		 */
		Book[] ba = {
			new Book("456", "자바", 3000),
			new Book("123", "파이썬", 2000),
			new Book("789", "알고", 4000)
		};
		
		
		System.out.println(Arrays.toString(ba));
		Arrays.sort(ba, tc);
		System.out.println(Arrays.toString(ba));
		
		System.out.println("--------------------");
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("3", "스프링", 3000));
		bl.add(new Book("2", "상속", 2000));
		bl.add(new Book("4", "인터페이스", 5000));
		bl.add(new Book("4", "인터페이스", 1000));
		
		System.out.println(bl);
		Collections.sort(bl,pc);
		System.out.println(bl);
		
		Collections.sort(bl,tpc);
		System.out.println(bl);
		
	}

}
