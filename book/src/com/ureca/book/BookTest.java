package com.ureca.book;
import java.util.*;

import com.ureca.book.dao.BookDao;
import com.ureca.book.dao.BookDaoImpl;
import com.ureca.book.dao.BookDaoList;
import com.ureca.book.dto.Book;
public class BookTest {

	public static void main(String[] args) {
		//BookDao dao = BookDaoList.getInstance();

		BookDao dao = BookDaoImpl.getInstance();
		
		
		
		System.out.println("초기값");
		System.out.println(dao);
		
		System.out.println("");
		
		dao.select("102");
		System.out.println(dao.select("102"));
		System.out.println("");	
		dao.insert(new Book("105", "자바", 50000));
		System.out.println(dao);
		System.out.println("");

		for (Book t: dao.selectAll()) System.out.println(t);
		
		dao.update(new Book("105", "파이썬", 30000));
		System.out.println(dao);
//		
//		Book s1 = new Book();
//		s1 = b.select("0");
//		System.out.println(s1);
//		
//		b.delete("0");
//		System.out.println(b);
//		
//		List<Book> a = b.selectAll();
//		System.out.println(a);
	}

}
