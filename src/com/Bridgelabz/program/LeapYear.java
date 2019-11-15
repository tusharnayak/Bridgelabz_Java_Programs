package com.Bridgelabz.program;

import com.Bridgelabz.program.utility.InputScanner;
import com.Bridgelabz.program.utility.Util;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("enter a year ");
		int year = InputScanner.intScanner();
		Util.leapYear(year);
	}
}
