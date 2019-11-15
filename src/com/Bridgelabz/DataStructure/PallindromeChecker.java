package com.Bridgelabz.DataStructure;

import com.Bridgelabz.program.utility.InputScanner;

public class PallindromeChecker {
	public static void main(String[] args) {
		Deque d = new Deque();
		// Scanner scan=new Scanner(System.in);

		System.out.println("enter a word for checking pallindrome");
		String word = InputScanner.StringScanner();
		for (int i = 0; i < word.length(); i++) {
			d.addRear(word.charAt(i));
		}
		String s = "";
		for (int i = 0; i < word.length(); i++) {
			s += d.removeRear();
		}
		if (s.equals(word))
			System.out.println("Given string is a pallindrome");
		else
			System.out.println("Given string is not polindrome");

	}

}
