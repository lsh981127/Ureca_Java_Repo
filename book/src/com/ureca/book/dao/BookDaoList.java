package com.ureca.book.dao;

import java.util.ArrayList;
import java.util.List;

import com.ureca.book.dto.Book;

public class BookDaoList implements BookDao {
	
	private List<Book> ba;
	
	
	private static BookDao instance = new BookDaoList();
	private BookDaoList() {
		ba = new ArrayList<>();
		ba.add(new Book("101", "자바", 40000));
		ba.add(new Book("102", "자바1", 30000));
		ba.add(new Book("103", "자바2", 20000));
	}
	
	public static BookDao getInstance() {
		return instance;
	}
	
	@Override
	public int insert(Book b) {
		if (select(b.getNum()) != null) {
			this.ba.add(b);
			return 1;
		}
		return 0;
	}

	@Override
	public int update(Book b) {
		// 내 방식의 코드
//		int len = ba.size();
//		String bnum = b.getNum();
//		for(int i = 0; i < len; i++) {
//			Book temp = ba.get(i);
//			if (temp.getNum().equals(bnum)) {
//				temp.setPrice(b.getPrice());
//				temp.setTitle(b.getTitle());
//			}	
//		}
//		return 0;
		Book t = select(b.getNum());
		if (t != null) {
			ba.set(ba.indexOf(t), b);
			return 1;
		}
		return 0;
		
	}

	@Override
	public int delete(String num) {
		// 삭제를 remove 시키면, 현재 리스트에 영향을 주기 때문에
		// 다른 방법으로 삭제를 해야한다.
		
		Book t = select(num);
		if (t != null) {
			ba.remove(t);
			return 1;
		}
		return 0;
		
	}

	@Override
	public Book select(String num) {
		for(Book b: ba) {
			if(b.getNum().equals(num)){
				return b;
			}
		}
		return null;
	}

	@Override
	public List<Book> selectAll() {
//		return this.ba;
		return ba.subList(0, ba.size()); // 원본값을 못 바꾸게 이렇게 return하기
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(ba);
		return builder.toString();
	}
	
	
	
	// book을 arraylist로 하는 것
	
	
}
