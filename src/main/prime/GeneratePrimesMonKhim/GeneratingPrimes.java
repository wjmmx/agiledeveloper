package com.oocl.tengkh.sw;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratingPrimes {

	public static void main(String[] args) {
		GeneratePrimeNumbers(2);
	}

	public static ArrayList<Integer> GeneratePrimeNumbers(int maxValue) {


		ArrayList<Integer> arrList = new ArrayList<Integer>();
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
		System.out.println(arrList);
		return arrList;
	}
}
