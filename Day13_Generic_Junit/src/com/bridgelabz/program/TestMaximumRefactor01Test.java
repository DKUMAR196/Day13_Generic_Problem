package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumRefactor01Test {

	@Test
	public void test() {
		TestMaximumRefactor01 testMax = new TestMaximumRefactor01();
		int result = testMax.maximum(3,2,1);
		assertEquals(3,result);
	}
	@Test
	public void test1() {
		TestMaximumRefactor01 testMax = new TestMaximumRefactor01();
		float result = testMax.maximum(3.3f,2.2f,1.1f);
		assertEquals(3.3,result);
	}
	@Test
	public void test2() {
		TestMaximumRefactor01 testMax = new TestMaximumRefactor01();
		String result = testMax.maximum("Name","Deepak","Kumar");
		assertEquals("Name",result);
	}

}
