package com.ureca.book.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ureca.book.dto.Book;

public class BookDaoImpl implements BookDao{
	
	private List<Book> ba;
	private static BookDao instance = new BookDaoImpl();
	
	private BookDaoImpl() {
		ba = new ArrayList<>();
		String sql = "select * from book";
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				
				Book temp = new Book();
				temp.setNum(rs.getString("num"));
				temp.setPrice(rs.getInt("price"));
				temp.setTitle(rs.getString("title"));
				ba.add(temp);
			}
		} catch (SQLException e) {
			System.out.println("예외 발생" + e);
		}
	}
	
	public static BookDao getInstance() {
		return instance;
	}
	
	
	
	@Override
	public int insert(Book b) {
		String sql = "insert into book values (?, ?, ?)";
		if (select(b.getNum()) != null) {
			
			try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
					PreparedStatement ps = con.prepareStatement(sql)) {
				ps.setString(1, b.getNum());   // num
				ps.setString(2, b.getTitle());	// title
				ps.setInt(3, b.getPrice());	// price
				
				int r = ps.executeUpdate();
				Book temp = new Book();
				temp.setNum(b.getNum());
				temp.setPrice(b.getPrice());
				temp.setTitle(b.getTitle());
				ba.add(temp);
				System.out.println("추가 완료");
			} catch (SQLException e) {
				System.out.println("예외 발생" + e);
			}
			return 1;
		} else {
			System.out.println("해당 책이 존재하지 않습니다.");
		}
		return 0;
	}

	@Override
	public int update(Book b) {
		Book t = select(b.getNum());
		if (t != null) {
			String sql = "update book set title=?, price=? where num=?";
			 
			 try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
					PreparedStatement ps = con.prepareStatement(sql)) {
				ps.setString(1, b.getNum());
				ps.setString(2, b.getTitle());
				ps.setInt(3, b.getPrice());
				 
				int r = ps.executeUpdate();
				ba.set(ba.indexOf(t), b);
				System.out.println("수정 완료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 1;
		} else {
			System.out.println("해당 책이 존재하지 않습니다.");
		}
		return 0;
		
	}

	@Override
	public int delete(String num) {
		
		Book t = select(num);
		if (t != null) {
			String sql = "delete from book where num=?";
			try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
					PreparedStatement ps = con.prepareStatement(sql)) {
				ps.setString(1, num);
				 
				 
				 int r = ps.executeUpdate();
				ba.remove(t);

				 System.out.println("삭제 완료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 1;
		} else {
			System.out.println("해당 책이 존재하지 않습니다.");
		}
		return 0;
		
	}

	@Override
	public Book select(String num) {
		
		String sql = "select * from book where num=?";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, num);

			try (ResultSet rs = ps.executeQuery()) {
				if(rs.next()) {
					Book t = new Book(num, rs.getString("title"), rs.getInt("price"));
					return t;
				 } else {
						System.out.println("해당 책이 존재하지 않습니다.");
					}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Book> selectAll() {
		return ba.subList(0, ba.size()); // 원본값을 못 바꾸게 이렇게 return하기
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(ba);
		return builder.toString();
	}



}
