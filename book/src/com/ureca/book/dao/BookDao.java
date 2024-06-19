package com.ureca.book.dao;

import java.sql.SQLException;
import java.util.*;

import com.ureca.book.dto.Book;

public interface BookDao {
	int insert(Book b) throws SQLException;
	int update(Book b)throws SQLException;
	int delete(String num) throws SQLException;
	Book select(String num) throws SQLException;
	List<Book> selectAll()throws SQLException; 
	
}

// BookDaoList.java arraylist 로 만들고
