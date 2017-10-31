package org.pepito.factorial2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	private Factorial factorial;

	@Before
	public void init() {
		factorial = new Factorial();
	}

	@Test
	public void shouldFactorialZerofReturnOne() {
		long result = factorial.compute(0);
		long expectedValue = 1;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialOnefReturnOne() {
		long result = factorial.compute(1);
		long expectedValue = 1;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialTwofReturnTwo() {
		long result = factorial.compute(2);
		long expectedValue = 2;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialThreefReturnSix() {
		long result = factorial.compute(3);
		long expectedValue = 6;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialFivefRetur120() {
		long result = factorial.compute(5);
		long expectedValue = 120;

		assertEquals(expectedValue, result);
	}
}
