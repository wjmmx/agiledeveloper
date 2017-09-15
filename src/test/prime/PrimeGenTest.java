package prime;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PrimeGenTest {
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals(Arrays.asList(2,3,5),GeneratingPrimesDashItian.GeneratePrimeNumbers(5));
		assertEquals(Arrays.asList(),GeneratingPrimesDashItian.GeneratePrimeNumbers(1));
		assertEquals(Arrays.asList(2,3,5,7,11),GeneratingPrimesDashItian.GeneratePrimeNumbers(11));
	}

}
