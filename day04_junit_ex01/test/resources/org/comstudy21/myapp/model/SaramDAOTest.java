package org.comstudy21.myapp.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.comstudy21.myweb.model.SaramDAO;
import org.comstudy21.myweb.model.SaramDTO;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SaramDAOTest {
	static SaramDAO dao;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dao= new SaramDAO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	void testSelectOne() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByName() {
		SaramDTO dto = new SaramDTO(0, "HONG", "", "");
		dao.findByName(dto);
		List<SaramDTO> list = dao.findByName(dto);
		assertNotNull(list);
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testInsert() {
		fail("Not yet implemented");
	}

}
