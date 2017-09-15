package com.oocl.tengkh.sw;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratingPrimes {

	public static void main(String[] args) {
		GeneratePrimeNumbers(11);
	}

	public static ArrayList<Integer> GeneratePrimeNumbers(int maxValue) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		if (maxValue != 1 && maxValue != 0) {
			for (int x = 2; x <= maxValue; x++) {
				boolean flag = true;
				for (int y = 2; y <= x - 1; y++) {
					if (x % y == 0) {
						flag = false;
					}
				}
				if (flag)
					arrList.add(x);

			}
			return arrList;
		} else
			return null;
	}
}
