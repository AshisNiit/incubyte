package com.incubyte.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
	
	@Test
	void addTest() throws Exception {
		
		Assertions.assertEquals(Calculator.add(""), 0);
		
		Assertions.assertEquals(Calculator.add("1"), 1);
		
		Assertions.assertEquals(Calculator.add("1,5"), 6);
		
		Assertions.assertEquals(Calculator.add("//;\\n1;2"), 3);
		
		String msg = null;
		try {
			Calculator.add("1,-5");
			
		} catch(Exception ex) {
			msg = ex.getMessage();
		}
		
		Assertions.assertEquals(msg, "negative numbers not allowed -5");
	}

}
