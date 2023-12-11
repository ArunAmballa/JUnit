package com.arun.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() 
	{
		
		Calculator c=new Calculator();
		int result=c.divide(10,5);
		int expectedResult=2;
		assertEquals(expectedResult,result);
	}

}
