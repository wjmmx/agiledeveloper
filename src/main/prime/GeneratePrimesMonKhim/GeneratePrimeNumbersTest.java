package com.oocl.tengkh.sw;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class GeneratePrimeNumbersTest {
	GeneratingPrimes generatePrimes = new GeneratingPrimes();

	@SuppressWarnings("static-access")
	@Test
	public void testPrimeNumbersZero() {
		// fail("Not yet implemented");

		assertEquals(null, generatePrimes.GeneratePrimeNumbers(0));

	}
	
	@Test
	public void testPrimeNumbersTwo() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2), generatePrimes.GeneratePrimeNumbers(2));

	}
	
	@Test
	public void testPrimeNumbersThree() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3), generatePrimes.GeneratePrimeNumbers(3));

	}
	
	@Test
	public void testPrimeNumbersFour() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3), generatePrimes.GeneratePrimeNumbers(4));

	}
	
	@Test
	public void testPrimeNumbersFive() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3,5), generatePrimes.GeneratePrimeNumbers(5));

	}
	
	@Test
	public void testPrimeNumbersSix() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3,5), generatePrimes.GeneratePrimeNumbers(6));

	}
	
	@Test
	public void testPrimeNumbersSeven() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3,5,7), generatePrimes.GeneratePrimeNumbers(7));

	}
	
	@Test
	public void testPrimeNumbersEight() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3,5,7), generatePrimes.GeneratePrimeNumbers(8));

	}
	
	@Test
	public void testPrimeNumbersNine() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3,5,7), generatePrimes.GeneratePrimeNumbers(9));

	}
	
	@Test
	public void testPrimeNumbersTen() {
		// fail("Not yet implemented");

		assertEquals(Arrays.asList(2,3,5,7), generatePrimes.GeneratePrimeNumbers(10));

	}

}
