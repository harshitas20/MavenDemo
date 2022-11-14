package com.lti.advancedemo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterisedTest {
	
	@ParameterizedTest
	@ValueSource(ints= {2,8,10,4,24})
	void test_intArray(int arg) {
		System.out.println("args: "+arg);
		Assertions.assertTrue(arg%2==0);
	}
	
	public void checkForArray() {
		Integer intArray[]= {2,3,7,10};
		List<Integer> numbers=Arrays.asList(intArray);
		Assertions.assertAll(()->assertEquals(2,numbers.get(0)));
	}

}
