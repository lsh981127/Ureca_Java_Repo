package com.ureca.book.dao;

import java.sql.*;
import java.util.*;

import com.ureca.book.dto.Book;
import com.ureca.book.util.DBUtil;

public class BookDaoImpl2 implements BookDao {
	
	private static BookDao instance =  new BookDaoImpl2();
	
	private BookDaoImpl2() {}
	
	public static BookDao getInstance() {
		return instance;
	}

	private DBUtil util = DBUtil.getInstance();
	
	@Override
	public Book select(String num) throws SQLException {
		Book b = null;
		String sql = "select * from book where num=?";
		try (Connection con =util.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, num);
			try (ResultSet rs = ps.executeQuery()) {
				if(rs.next()) {
					b= new Book(rs.getString("num"),rs.getString("title"),rs.getInt("price"));
				 }
			}
		}
		return b;
	}

	
	@Override
	public int insert(Book b) throws SQLException {
		String sql = "insert into book values (?, ?, ?)";
	
		try (Connection con = util.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, b.getNum());   // num
			ps.setString(2, b.getTitle());	// title
			ps.setInt(3, b.getPrice());	// price
			
			return ps.executeUpdate();
		}
	}

	@Override
	public int update(Book b) throws SQLException {
		String sql = "update book set title=?, price=? where num=?";
	
		try (Connection con = util.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, b.getTitle());	// title
			ps.setInt(2, b.getPrice());	// price
			ps.setString(3, b.getNum());   // num

			return ps.executeUpdate();
		}
	}

	@Override
	public int delete(String num) throws SQLException {
		String sql = "delete from book where num=?";
		try (Connection con = util.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, num);
			return ps.executeUpdate();
		}
	}

	

	@Override
	public List<Book> selectAll() throws SQLException {
		List<Book> bs = new ArrayList<>();
		String sql = "select * from book";
		try (Connection con =util.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			try (ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					bs.add(new Book(rs.getString("num"),rs.getString("title"),rs.getInt("price")));
				 }
			}
		}
		return bs;
	}
	
	
}
