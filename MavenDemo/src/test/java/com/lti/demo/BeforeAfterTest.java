package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

Calculator c= new Calculator();
int sum;

    @BeforeAll
    public static void testdb() {
    	System.out.println("connected");
    }
    
    @BeforeEach
    public void entval() {
    	sum=500;
    	System.out.println("val added");
    }
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());
		sum=sum+1000;
		System.out.println(sum);
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40) );
		sum=sum+5000;
		System.out.println(sum);
	}
	
	@AfterEach
	public void endmsg() {
		System.out.println("yeheyyy!");
	}
	
	@AfterAll
	public static void end() {
		System.out.println("db closed");
	}

	
	
}
