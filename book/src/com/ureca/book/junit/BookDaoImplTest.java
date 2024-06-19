package com.ureca.book.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.*;

import com.ureca.book.dao.*;
import com.ureca.book.dto.Book;

@DisplayName("BookDaoImpl 시작")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookDaoImplTest {
	
	private static BookDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = BookDaoImpl2.getInstance();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		dao = null;
	}

	@Test
//	@Disabled
	@Order(1)
	@DisplayName("Select 시작")
	void testSelect() throws SQLException {
		Book b = dao.select("102");
		assertEquals(b.getTitle(), "Java1");
		assertEquals(b.getPrice(), 100);
	}

	@Test
//	@Disabled
	@Order(2)
	@DisplayName("Insert 시작")
	void testInsert() throws SQLException   {
		Book b= new Book("5", "JUnit Test", 5);
		assertEquals(dao.insert(b), 1);
		
		Book selected = dao.select("5");
		assertEquals(selected.getTitle(), b.getTitle());
		assertEquals(selected.getPrice(), b.getPrice());
		
	}

	@Test
//	@Disabled
	@Order(3)
	@DisplayName("Update 시작")
	void testUpdate() throws SQLException {
		Book b= new Book("5", "JUnit Test1", 5);
		assertEquals(dao.update(b), 1);
		
		Book selected = dao.select("5");
		assertEquals(selected.getTitle(), b.getTitle());
		assertEquals(selected.getPrice(), b.getPrice());
	}

	@Test
	@Disabled
	@Order(4)
	@DisplayName("Delete 시작")
	void testDelete() throws SQLException {
		Book b =  dao.select("5");
		assertNotNull(b);
		assertEquals(dao.delete("5"), 1);
		Book deleted = dao.select("104");
		assertNull(deleted);
	}

	@Test
//	@Disabled
	@Order(5)
	@DisplayName("SelectAll 시작")
	void testSelectAll() throws SQLException {
		List<Book> bs = dao.selectAll();
		assertEquals(bs.size(), 3);
		assertEquals(bs.get(0).getTitle(), "Java1");
		
	}

}
