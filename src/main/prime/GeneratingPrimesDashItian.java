package prime;

import java.util.ArrayList;

public class GeneratingPrimesDashItian {
	public static ArrayList<Integer> GeneratePrimeNumbers(int maxValue) {
    	ArrayList<Integer> primes = new ArrayList<Integer>();
    	int size = maxValue + 1;
        for (int i = 2; i < size; i++) {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }
    public static boolean isPrime(int i) {
		int j, isPrimeNum=1;
		for(j=2; j<=i/2; j++){
	        if(i%j==0){
	            isPrimeNum = 0;
	            break;
	        }
		}
		return isPrimeNum==1 ? true : false;
	}
}
