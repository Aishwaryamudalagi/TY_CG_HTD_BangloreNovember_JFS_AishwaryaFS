package com.capgemini.junit.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void test() {
		Calculator c = new Calculator();
		int i = c.add(10, 5);
		assertEquals(15,i);
	}
	@Test
	void testAddForNegative() {
		Calculator c = new Calculator();
		int k = c.add(-2, 5);
		assertEquals(3,k);
	}
	
	@Test
	void testMul()
	{
		Calculator c = new Calculator();
		int p = c.mul(2, 5);
		assertEquals(10,p);
	}
	
	@Test
	void testdiv()
	{
		Calculator c = new Calculator();
		
		assertThrows(ArithmeticException.class,
				() -> 
					
				c.div(10,0)
				);
		
	}
	
	@Test
	void testFindLength()
	{

		Calculator c = new Calculator();
		int res = c.findLength("Aishu");
		assertEquals(5,res);	
	}
	
	@Test
	void testFindLengthForNull() {
		Calculator c1 = new Calculator();
		assertThrows(NullPointerException.class, ()->c1.findLength(null));
	}

}
