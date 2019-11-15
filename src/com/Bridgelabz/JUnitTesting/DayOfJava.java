package com.Bridgelabz.JUnitTesting;

public class DayOfJava {
	public static void main(String[] args) {
		Utility u = new Utility();
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		u.dayOfWeek(m, d, y);

	}

}
