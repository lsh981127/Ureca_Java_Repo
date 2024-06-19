package com.ureca.book.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import com.ureca.book.dao.BookDao;
import com.ureca.book.dao.BookDaoList;

@DisplayName("JUnit5 확인")
class BookDaoTest {
	static BookDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = BookDaoList.getInstance();
		System.out.println("@BeforeAll 생성자 init()");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("  @BeforeEach 매번 @Test 이전에 실행");
	}

	@Test
	@DisplayName("생성 확인")
	@Disabled
	void testGetInstance() {
//		fail("Not yet implemented");
		System.out.println("  Book Dao 확인 : " + dao);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		dao = null;
		System.out.println("@After All 소멸자 destroy()");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("  @AfterEach 매번 @Test 이후에 실행");
	}
	
}
