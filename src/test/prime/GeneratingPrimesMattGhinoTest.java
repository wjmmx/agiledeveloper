package prime;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oocl.group1.GeneratingPrimes;

public class GeneratingPrimesMattGhinoTest {
	
	@Test
	public void generatePrimeNumbersForNumberOne() {			
		  assertArrayEquals(new int[0] , GeneratingPrimes.GeneratePrimeNumbers(1));
	}

	@Test
	public void generatePrimeNumbersForNumberFour() {			
		  assertArrayEquals(new int[] {2,3}, GeneratingPrimes.GeneratePrimeNumbers(4));
	}
	
	@Test
	public void generatePrimeNumbersForNumberTen() {			
		  assertArrayEquals(new int[] {2,3,5,7}, GeneratingPrimes.GeneratePrimeNumbers(10));
	}
	@Test
	public void generatePrimeNumbersForNumberTwentyFive() {			
		  assertArrayEquals(new int[] {2,3,5,7,11,13,17,19,23}, GeneratingPrimes.GeneratePrimeNumbers(25));
	}
	@Test
	public void generatePrimeNumbersForNumberThirty() {			
		  assertArrayEquals(new int[] {2,3,5,7,11,13,17,19,23,29}, GeneratingPrimes.GeneratePrimeNumbers(30));
	}

}