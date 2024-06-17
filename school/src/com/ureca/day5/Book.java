package com.ureca.day5;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	String isbn;
	String title;
	int price;
	
	// 레퍼런스 데이터 타입은 다 compareTo가 있음 => 그냥 다 비교? 가 가능해짐.

	public Book(String isbn, String title, int price) {
		setIsbn(isbn);
		setTitle(title);
		setPrice(price);
	}
	
	public Book() {}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getIsbn()+ "/" + getTitle() + "/" + getPrice();
	}

	@Override
	public int compareTo(Book o) {
		// this. 을 생략해도 괜찮다.
		return isbn.compareTo(o.isbn);
//		return -Integer.compare(price, o.price); 
		
		/**
		 * 기본 데이터 타입은 .compare를 써서 비교, 정렬
		 * 
		 * return Integer.compare(price, o.price);   // 오름차순
		 * return Integer.compare(o.price, price);   // 내림차순
		 * return -Integer.compare(price, o.price);   // 내림차순
		 * 
		 * 
		 */
		
		
		/**
		 * 레퍼런스 타입(참조 타입) 비교, 정렬은 .compareTo를 사용
		 * 
		 * 오름차순
		 * return this.isbn.compareTo(o.isbn);
		 * 
		 * 내림차순 
		 * return o.isbn.compareTo(this.isbn);
		 * return -this.isbn.compareTo(o.isbn);
		 * 그냥 o, this 순서를 바꾸거나 그냥 - 를 붙혀주면 돼.
		 */
		
		 
		 	
		
		
		
	}
	
	
}
