package com.Bridgelabz.Algorithm;

import com.Bridgelabz.program.utility.InputScanner;
import com.Bridgelabz.program.utility.Util;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("enter the 1st String");
		String s1 = InputScanner.StringScanner();
		System.out.println("enter the 2nd string");
		String s2 = InputScanner.StringScanner();
		Util.anagramProgram(s1, s2);
	}
}
