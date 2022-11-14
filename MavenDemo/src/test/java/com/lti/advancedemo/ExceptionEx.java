package com.lti.advancedemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExceptionEx {

	@Test
    void testExpection() {

       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("abcd");
        });
    }
	
	  @Test
      void testException1() {



         Calculator c= new Calculator();
          
          final Exception e = assertThrows(ArithmeticException.class, () -> {
              c.searchEmpId(0);
        
        });
          
          
        Assertions.assertEquals("You enetered zero",e.getMessage());
      }
}
