package com.Bridgelabz.program;

import com.Bridgelabz.program.utility.InputScanner;
import com.Bridgelabz.program.utility.Util;

public class Factors {
	public static void main(String[] args) {
		System.out.println("enter a number");
		int num = InputScanner.intScanner();
		Util.factor(num);

	}
}
