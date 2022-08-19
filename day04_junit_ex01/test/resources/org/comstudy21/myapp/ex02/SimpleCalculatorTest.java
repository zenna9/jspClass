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

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) //�̸� ��Ģ�� �ٸ��� �������ټ�������
class SimpleCalculatorTest {
//	�׽�Ʈ�� ���� ���� ����
	static SimpleCalculator calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//��� �� ���߿� �ϳ��� ������ ����..?
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
	@DisplayName("���ϱ� ��� �׽�Ʈ")
	void testAdd() {
		assertEquals(3, calc.add(1, 2));
	}

	@Test
	@Disabled
	@DisplayName("���� ��� �׽�")
	void test_sub() {
	}

	@Test
	void test_mul() {
	}

	@Test
	@DisplayName("������ ��� �ך�")
	void test_div() {
	}

}
