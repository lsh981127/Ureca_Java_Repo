package com.ureca.day5;

import java.util.*;



public class AnonymousSort {

	public static void main(String[] args) {

		
		// 익명 클래스 활용법
		/**
		 * 익명 클래스를 쓰는 이유
		 * => 딱 1번만 쓰고 버리기 위해서
		 */
//		  Comparator pc = new  Comparator<Book> (){
//			  @Override 
//			  public int compare(Book o1, Book o2) { 
//				  return o1.title.compareTo(o2.title); 
//				  } 
//		  };
		 
		
		class PriceComparator implements Comparator<Book>{
			@Override
			public int compare(Book o1, Book o2) {
				return Integer.compare(o1.price, o2.price);
			}
		}
	
		Book[] ba = {
			new Book("456", "자바", 3000),
			new Book("123", "파이썬", 2000),
			new Book("789", "알고", 4000)
		};
		
		
		System.out.println(Arrays.toString(ba));
//		Arrays.sort(ba, tc);
		
		Arrays.sort(ba, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.title.compareTo(o2.title);
			}
			
		});
		System.out.println(Arrays.toString(ba));
		
		
		System.out.println("--------------------");
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("3", "스프링", 3000));
		bl.add(new Book("2", "상속", 2000));
		bl.add(new Book("4", "인터페이스", 5000));
		bl.add(new Book("4", "인터페이스", 1000));
		
		System.out.println(bl);
//		Collections.sort(bl, pc);
		Collections.sort(bl,new  Comparator<Book> (){			// 이렇게도 익명 클래스를 활용할 수 있다.
			  @Override 
			  public int compare(Book o1, Book o2) { 
				  return o1.title.compareTo(o2.title); 
				  } 
		  });
		
		System.out.println(bl);
		
//		Collections.sort(bl,tpc);
		System.out.println(bl);
		
	}

}
