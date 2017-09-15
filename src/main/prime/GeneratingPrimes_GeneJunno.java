package com.oocl.kadange.sw;

import java.util.ArrayList;
import java.util.HashMap;

public class GeneratingPrimes_GeneJunno {

    public static void main(String[] args) {
    	System.out.println(GeneratePrimeNumbersRefactored(12));
    }
	
	public static ArrayList<Integer> GeneratePrimeNumbersRefactored(int maxValue) {
		ArrayList<Integer> prime = new ArrayList<Integer>();
		HashMap<Integer, Boolean> inList = new HashMap<Integer, Boolean>();
		
		for(int i=2; i<=maxValue; i++) {
			if(inList.get(i) == null) {
				prime.add(i);
			}
			for(int x = i<<1; x<=maxValue; x+=i) {
				inList.put(x, true);
			}
		}
		return prime;
    }
}


