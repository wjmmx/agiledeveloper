package primeRefactorCenonAndDorisTest;

import junit.framework.Assert;
import org.junit.Test;
import primeRefactorCenonAndDoris.GeneratingPrimes;

/**
 * Created by PLANACE on 9/15/2017.
 */
public class GeneratingPrimesTest {
    @Test
    public void oneHasNoPrimeFactors(){
        int value = 1;
        GeneratingPrimes generator = new GeneratingPrimes();
        int[] result = generator.GeneratePrimeNumbers(value);
        Assert.assertEquals(0,result.length);
    }

    @Test
    public void twoHasOnePrimeFactor(){
        int value = 2;
        GeneratingPrimes generator = new GeneratingPrimes();
        int[] result = generator.GeneratePrimeNumbers(value);
        Assert.assertEquals(1,result.length);
        Assert.assertEquals(2,result[0]);
    }
}
