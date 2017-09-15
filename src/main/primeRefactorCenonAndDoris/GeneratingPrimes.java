package primeRefactorCenonAndDoris;

public class GeneratingPrimes {

    public static int[] GeneratePrimeNumbers(int maxValue) {
        //maxValue =2
        if (maxValue >= 2) {
            int s = maxValue + 1; //s=3
            boolean[] f = new boolean[s]; //will create boolean array
            int i;

            for (i = 0; i < s; i++) f[i] = true;

            f[0] = f[1] = false;

            int j;


            for (i = 2; i < Math.sqrt(s) + 1; i++) {
                if (f[i]) {
                    for (j = 2 * i; j < s; j += i) f[j] = false;
                }
            }


            int count = 0;
            for (i = 0; i < s; i++) {
                if (f[i]) count++;
            }

            int[] primes = new int[count];
            for (i = 0, j = 0; i < s; i++) {
                if (f[i])
                    primes[j++] = i;
            }
            return primes;
        } else return new int[0];
    }
}


