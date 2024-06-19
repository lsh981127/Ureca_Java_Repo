package com.ureca.book.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.*;


import com.ureca.book.dao.BookDao;
import com.ureca.book.dao.BookDaoList;
import com.ureca.book.dto.Book;


@DisplayName("BookDaoList 확인")
class BookDaoListTest {
	static BookDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = BookDaoList.getInstance();
		System.out.println("@BeforeAll init()");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		dao = null;
		System.out.println("@After 끝");
	}

	@Test
//	@Disabled
	@DisplayName("Insert")
	void testInsert() throws SQLException {
		Book b = new Book("5", "JUnit test", 10);
		assertEquals(dao.insert(b), 1);

		
	}

	@Test
//	@Disabled
	@DisplayName("Update")
	void testUpdate() throws SQLException {
		Book b = new Book("5", "JUnit test", 100);
		assertEquals(dao.update(b), 1);
	}

	

	@Test
//	@Disabled
	@DisplayName("Select")
	void testSelect() throws SQLException {
		Book b = dao.select("101");
		assertEquals(dao.select("101"), b);
	}

	@Test
	@DisplayName("SelectAll")
//	@Disabled
	void testSelectAll() throws SQLException {
		List<Book> bs = dao.selectAll();
		assertEquals(bs.size(), 3);
		assertEquals(bs.get(0).getTitle(), "자바");

	}
	
	@Test
//	@Disabled
	@DisplayName("Delete")
	void testDelete() throws SQLException {
		Book b = dao.select("103");
		assertNotNull(b);
		assertEquals(dao.delete("103"), 1);
		
		Book del = dao.select("103");
		assertNull(del);
		
	}
	

	@Test
	@Disabled
	void testToString() {
		fail("Not yet implemented");
	}

}
