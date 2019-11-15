package com.Bridgelabz.functional;

import com.Bridgelabz.program.utility.InputScanner;
import com.Bridgelabz.program.utility.Util;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("enter the a value");
		double a = InputScanner.doubleScanner();
		System.out.println("enter the b value");
		double b = InputScanner.doubleScanner();
		System.out.println("enter the c value");
		double c = InputScanner.doubleScanner();

		Util.quadraticMethod(a, b, c);
	}
}
