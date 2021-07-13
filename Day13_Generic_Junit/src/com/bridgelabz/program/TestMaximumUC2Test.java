package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUC2Test {

	@Test
	public void test() {
		TestMaximumUC2 testMax = new TestMaximumUC2();
		float result = testMax.maximum(3.3f,2.2f,1.1f);
		assertEquals(3.3,result);
	}
	@Test
	public void test1() {
		TestMaximumUC2 testMax = new TestMaximumUC2();
		float result = testMax.maximum(2.2f,3.3f,1.1f);
		assertEquals(3.3,result);
	}
	@Test
	public void test2() {
		TestMaximumUC2 testMax = new TestMaximumUC2();
		float result = testMax.maximum(3.3f,2.2f,1.1f);
		assertEquals(3.3,result);
	}

}
