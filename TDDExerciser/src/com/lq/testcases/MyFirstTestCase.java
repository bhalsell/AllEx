package com.lq.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstTestCase {
	
	@Test
	public void test() {
		System.out.println("test'");
		ClassToTest ctt = new ClassToTest();
		assertEquals(ctt.methodToTest(), true);
		
	}

}
