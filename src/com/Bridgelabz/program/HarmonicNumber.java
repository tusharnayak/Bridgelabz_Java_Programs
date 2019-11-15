package com.Bridgelabz.program;

import com.Bridgelabz.program.utility.InputScanner;
import com.Bridgelabz.program.utility.Util;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("enter a N-value");
		double N = InputScanner.doubleScanner();
		Util.harmonic(N);

	}

}
