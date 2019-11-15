package com.Bridgelabz.program.utility;

import java.util.Scanner;

public class InputScanner {
	private final static Scanner sc = new Scanner(System.in);

	public static int intScanner() {
		return sc.nextInt();
	}

	public static boolean booleanScanner() {
		return sc.nextBoolean();
	}

	public static float floatScanner() {
		return sc.nextFloat();

	}

	public static double doubleScanner() {
		return sc.nextDouble();
	}

	public static String StringScanner() {
		return sc.nextLine();
	}
}
