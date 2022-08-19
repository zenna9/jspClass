package org.comstudy21.myapp.ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) //이름 규칙을 다르ㅔ 설정해줄수도있음
class SimpleCalculatorTest {
//	테스트를 위한 변수 삽입
	static SimpleCalculator calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//얘랑 밑 둘중에 하나에 생성을 해줌..?
		calc = new SimpleCalculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("더하기 기능 테스트")
	void testAdd() {
		assertEquals(3, calc.add(1, 2));
	}

	@Test
	@Disabled
	@DisplayName("빼기 기능 테슷")
	void test_sub() {
	}

	@Test
	void test_mul() {
	}

	@Test
	@DisplayName("나누기 기능 테슽")
	void test_div() {
	}

}
