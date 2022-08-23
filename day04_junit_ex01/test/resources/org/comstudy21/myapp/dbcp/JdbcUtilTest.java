package org.comstudy21.myapp.dbcp;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.function.Supplier;

import org.comstudy21.myweb.dbcp.JdbcUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JdbcUtilTest {
	Connection conn = null;

	@Disabled
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Disabled
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Disabled
	@BeforeEach
	void setUp() throws Exception {
		conn = JdbcUtil.getConnection();
	}

	@Disabled
	@AfterEach
	void tearDown() throws Exception {
		JdbcUtil.close(conn);
	}

	@Test
	@DisplayName("connection 객체 생성 Test")
	void testGetConnection() {
		assertNotNull(conn, "conn은 null이 아니어야 합니다!");
	}

	@Test
	@Disabled
	void testCloseConnection() {
		assertEquals(1, JdbcUtil.close(conn));
	}

}
