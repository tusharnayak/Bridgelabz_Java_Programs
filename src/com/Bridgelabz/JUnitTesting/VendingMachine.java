package com.Bridgelabz.JUnitTesting;

public class VendingMachine {
	public static int countNotes(int count, int amount) {
		int[] notes = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int i = 0;

		// while(amount!=0)
		if (amount >= notes[i]) {
			count = amount / notes[i];
			amount = amount % notes[i];
			count++;
		}
		return count;
	}

	public static int listRupeesNotes(int count, int amount, int notes[]) {
		int[] notes1 = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int i = 0;
		String s = "";
		if (amount >= notes[i]) {
			count = amount / notes[i];
			amount = amount % notes[i];
			count++;

		}
		return notes[i];

	}

}
