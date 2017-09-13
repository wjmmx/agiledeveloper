package prime;

import org.junit.Assert;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {
    @Test
    public void oneHasNotPrimeFactors() {
        Assert.assertEquals(asList(), PrimeFactor.computeFactorsFor(1));
    }

    @Test
    public void twoHasOnlyItselfAsPrimeFactors() {
        assertEquals(asList(2), PrimeFactor.computeFactorsFor(2));
    }

    @Test
    public void threeHasOnlyItselfAsPrimeFactors() {
        assertEquals(asList(3), PrimeFactor.computeFactorsFor(3));
    }

    @Test
    public void fourHasTwoTimesTwoAsPrimeFactors() {
        assertEquals(asList(2, 2), PrimeFactor.computeFactorsFor(4));
    }

    @Test
    public void fiveHasOnlyItselfAsPrimeFactors() {

        assertEquals(asList(5), PrimeFactor.computeFactorsFor(5));
    }

    @Test
    public void sixHasTwoAndThreeAsPrimeFactors() {
        assertEquals(asList(2,3), PrimeFactor.computeFactorsFor(6));
    }

    @Test
    public void eightHasThreeTimesTwoAsPrimeFactors() {
        assertEquals(asList(2,2,2), PrimeFactor.computeFactorsFor(8));
    }

    @Test
    public void nightHasTwoTimesThreeAsPrimeFactors() {
        assertEquals(asList(3,3), PrimeFactor.computeFactorsFor(9));
    }

    @Test
    public void tenHasTwoAndFiveAsPrimeFactors() {
        assertEquals(asList(2,5), PrimeFactor.computeFactorsFor(10));
    }
}
