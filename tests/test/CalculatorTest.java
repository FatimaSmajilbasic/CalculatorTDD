package test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import calculator.Calculator;

public class CalculatorTest {

	Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void shouldAddWhenPassTwoNumbers() {
		double result = calculator.addition(1, 2);
		assertEquals(3,result,0);
	}
	
	@Test
	public void shouldSubtractWhenPassTwoNumbers() {
		double result = calculator.subtraction(2, 2);
		assertEquals(0, result, 0);
	}
	
	@Test
	public void shouldMultiplyWhenPassTwoNumbers() {
		double result = calculator.multiplication(1, 2);
		assertEquals(2,result,0);
	}
	
	@Test
	public void shouldDivideWhenPassTwoNumbers() {
		double result = calculator.division(2, 2);
		assertEquals(1,result,0);
	}

}

