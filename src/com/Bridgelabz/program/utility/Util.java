/*@author:Tushar Ranjan Nayak
@created:25th oct 2019
############################################*/

package com.Bridgelabz.program.utility;

import java.util.Arrays;
import java.util.Scanner;

/*for checking leap year
-------------------------*/

public class Util {
	public static void leapYear(int year) {
		if (countDigit(year) == 4) {
			if (findLeapYear(year)) {
				System.out.println("year is leap year");
			} else {
				System.out.println("year is not a leap year");
			}
		} else {
			System.out.println("invalid year you have provide");
		}
	}

	private static boolean findLeapYear(int year) {
		boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ? true : false;
		return isLeap;
	}

	private static int countDigit(int year) {
		int count = 0;
		while (year > 0) {
			count++;
			year /= 10;
		}
		return count;
	}

	/*
	 * find out the factors of a number
	 */
	public static int factor(int num) {
		if (num % 2 == 0) {
			System.out.print(2 + " ");
			num = num / 2;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {

			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
		return num;
	}

	/*
	 * Harmonic Number -----------------
	 */
	public static void harmonic(double N) {
		double harmonicValue = 1.0;
		for (int i = 2; i < N; i++) {
			harmonicValue = harmonicValue + (1.0 / i);
		}
		System.out.println(harmonicValue);
		// return harmonicValue;
	}

	/*
	 * flip coins -----------
	 */
	public static void coin(int x) {
		int countHead = 0;
		int countTail = 0;
		double percentHead = 0;
		double percentTail = 0;
		for (int i = 1; i <= x; i++) {
			if (Math.random() < 0.5) {
				System.out.println("head");
				countHead++;
			}

			else {
				System.out.println("Tail");
				countTail++;
			}
			percentHead = countHead / x * 10;
			percentTail = countTail / x * 10;

		}
		System.out.println("total head=" + countHead);
		System.out.println("total tails=" + countTail);
//	
//	System.out.println("head percentage="+percentHead+"%");
//	System.out.println("tail percentage="+percentTail+"%");
	}

	public static double distance(double x, double y) {

		// double res;

		double res = Math.sqrt((x * x) + (y * y));
		System.out.println(res);
		return res;
	}

	/*
	 * QUADRATIC -----------
	 */
	public static void quadraticMethod(double a, double b, double c) {
		double delta = (b * b) - 4 * a * c;
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println(root1 + " " + root2);
		} else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-delta) / 2 * a;
			System.out.println("real part=" + real + "imaginary=" + imaginary);
		}
	}

	/*
	 * SUM OF THREE NUMBER TO BE ZERO --------------------------------
	 */
	public static void triple(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println("found 3 element whose sum is 0");
						System.out.print(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}

	/*
	 * WIND CHILL -----------
	 */
	public static void wind(double v, double t) {
		if (t < 50 && v < 120 && v > 3) {
			double a = (0.4275 * t) - 35.75;
			double b = 0.16;
			double w = 35.74 + (0.6215 * t) + (a) * Math.pow(v, b);
			System.out.println(w);
		} else {
			System.out.println("the value is out of range");
		}
	}

	/*
	 * ANAGRAM ----------
	 */
	public static void anagramProgram(String s1, String s2) {
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		if (s1.length() == s2.length()) {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			s1 = new String(ch1);
			s2 = new String(ch2);
			if (s1.equals(s2)) {
				System.out.println("anagram");
			} else {
				System.out.println("not a anagram");
			}
		} else {
			System.out.println("not a anagram");
		}
	}

	/*
	 * BINARYSEARCH -------------
	 */

	public static void bSearch(String arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the word");
		String word = scan.nextLine();
		int lo = 0;
		int hi = len - 1;
		int mi = 0;
		while (lo <= hi) {
			mi = (lo + hi) / 2;
			if (arr[mi].equals(word)) {
				System.out.println("the word present in " + mi + " index number");
				break;
			} else if ((arr[mi].compareTo(word)) < 0) {
				lo = mi + 1;
			} else {
				hi = mi + 1;
			}

		}

	}

	/*
	 * BUBBLE SORT -------------
	 */
	public static void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * ARRAY PRIME NUMBER -------------------
	 */
	public static void primeNum() {
		int sum = 0;
		String primeNumbers = "";
		for (int i = 1; i < 1000; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("primeNumbers are:");
		System.out.println(primeNumbers);
	}

	/*
	 * INSERTION SORT ---------------
	 */
	public static void insSort(String arr[]) {
		for (int i = 1; i < arr.length - 1; i++) {
			String item = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j].compareTo(item) < 0) {
					arr[j + 1] = arr[j];
				}
				arr[j + 1] = item;
			}

			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * FIND NUMBER ------------
	 */
	public static void findNum() {

		int input = 0;// guess is equal to half the highest number
		int guess = 50; // low is equal to the lowest
		int low = 1;// high is equal to the highest number

		int high = 101;
		int tries = 1;

		while (input != 2) {
			System.out.println("Is your number " + guess + "?");
			System.out.println("1: No, my number is lower");
			System.out.println("2: Yes, that is my number");
			System.out.println("3: No, my number is higher");
			System.out.println();

			input = InputScanner.intScanner();

			if (input == 1) {
				high = guess;
				guess = low + (guess - low) / 2;
				tries++;

			} else if (input == 3) {
				low = guess;
				guess = guess + (high - guess) / 2;
				tries++;
			}
		}
		System.out.println("Your number is " + guess + "!");

		if (tries == 1) {

			System.out.println("It took 1 try to guess " + guess);

		} else {

			System.out.println("It took " + tries + " guesses to get " + guess);
		}
	}
}
