package com.oocl.tengkh.sw;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class GeneratePrimeNumbersTest {
	GeneratingPrimes generatePrimes = new GeneratingPrimes();

	@SuppressWarnings("static-access")
	@Test
	public void testPrimeNumbersZero() {
		assertEquals(null, generatePrimes.GeneratePrimeNumbers(0));
	}
	
	@Test
	public void testPrimeNumbersOne() {
		assertEquals(null, generatePrimes.GeneratePrimeNumbers(1));
	}

	@Test
	public void testPrimeNumbersTwo() {
		assertEquals(Arrays.asList(2), generatePrimes.GeneratePrimeNumbers(2));
	}

	@Test
	public void testPrimeNumbersThree() {
		assertEquals(Arrays.asList(2, 3), generatePrimes.GeneratePrimeNumbers(3));
	}

	@Test
	public void testPrimeNumbersFour() {
		assertEquals(Arrays.asList(2, 3), generatePrimes.GeneratePrimeNumbers(4));
	}

	@Test
	public void testPrimeNumbersFive() {
		assertEquals(Arrays.asList(2, 3, 5), generatePrimes.GeneratePrimeNumbers(5));
	}

	@Test
	public void testPrimeNumbersSix() {
		assertEquals(Arrays.asList(2, 3, 5), generatePrimes.GeneratePrimeNumbers(6));
	}

	@Test
	public void testPrimeNumbersSeven() {
		assertEquals(Arrays.asList(2, 3, 5, 7), generatePrimes.GeneratePrimeNumbers(7));
	}

	@Test
	public void testPrimeNumbersEight() {
		assertEquals(Arrays.asList(2, 3, 5, 7), generatePrimes.GeneratePrimeNumbers(8));

	}

	@Test
	public void testPrimeNumbersNine() {

		assertEquals(Arrays.asList(2, 3, 5, 7), generatePrimes.GeneratePrimeNumbers(9));

	}

	@Test
	public void testPrimeNumbersTen() {

		assertEquals(Arrays.asList(2, 3, 5, 7), generatePrimes.GeneratePrimeNumbers(10));

	}

	@Test
	public void testPrimeNumbersEleven() {

		assertEquals(Arrays.asList(2, 3, 5, 7, 11), generatePrimes.GeneratePrimeNumbers(11));

	}

}
