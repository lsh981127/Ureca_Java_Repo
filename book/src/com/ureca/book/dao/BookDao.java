package com.ureca.book.dao;

import java.util.*;

import com.ureca.book.dto.Book;

public interface BookDao {
	int insert(Book b);
	int update(Book b);
	int delete(String num);
	Book select(String num);
	List<Book> selectAll();
	
}

// BookDaoList.java arraylist 로 만들고
