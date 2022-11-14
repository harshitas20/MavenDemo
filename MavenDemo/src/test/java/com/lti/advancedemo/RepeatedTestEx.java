package com.lti.advancedemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestEx {

	@DisplayName("Repeat he test for 5 times")
	@RepeatedTest(5)
	public void shouldRepeat() {
		int a=10, b=20;
		Assertions.assertEquals(200, (a*b), "should repeat test - passed");
	}

}
