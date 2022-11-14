package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c= new Calculator();
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40) );
	}
	
	@Test
	public void testAssertFalse(){
		Assertions.assertFalse("harshita".length()==10);
		Assertions.assertTrue("harshita".length()==8);
	}


}
