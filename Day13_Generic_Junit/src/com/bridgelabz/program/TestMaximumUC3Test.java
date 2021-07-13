package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUC3Test {

	@Test
	public void test() {
		TestMaximumUC3 testMax = new TestMaximumUC3();
		String result = testMax.maximum("Name","Deepak","Kumar");
		assertEquals("Name",result);
	}
	@Test
	public void test1() {
		TestMaximumUC3 testMax = new TestMaximumUC3();
		String result = testMax.maximum("Deepak","Name","Kumar");
		assertEquals("Name",result);
	}
	@Test
	public void test2() {
		TestMaximumUC3 testMax = new TestMaximumUC3();
		String result = testMax.maximum("Deepak","Kumar","Name");
		assertEquals("Name",result);
	}

}
