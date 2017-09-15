package com.oocl.tengkh.sw;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratingPrimes {

	public static ArrayList<Integer> GeneratePrimeNumbers(int maxValue) {

		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		if (maxValue >= 2) {
			int size = maxValue + 1;
			int i;
			ArrayList<Boolean> flag = new ArrayList<Boolean>(size);
			for (i = 0; i < size; i++) {
				flag.add(true);
			}
			flag.set(0, false);
			flag.set(1, false);

			int j;
			for (i = 2; i < Math.sqrt(size) + 1; i++) {
				if (flag.get(i)) {
					for (j = 2 * i; j < size; j += i) {
						flag.set(j, false);
					}
				}
			}

			int count = 0;
			for (i = 0; i < size; i++) {
				if (flag.get(i))
					count++;
			}

			for (i = 0, j = 0; i < size; i++) {
				if (flag.get(i))
					primeNumbers.add(i);
			}
			return primeNumbers;
		} else
			return null;
	}
}
