package com.Bridgelabz.Algorithm;

import com.Bridgelabz.program.utility.InputScanner;

public class CustomizedMessege {
	private static final String STR1 = "Hello <<name>>";
	private static final String STR2 = "We have your full as <<full name>>";
	private static final String STR3 = "your contact number is 91-xxxxxxxxxx";
	private static final String STR4 = "please letus know for any clarification,thank you Bridgelabz <<01/01/2019>>";

	public static void main(String[] args) {
		System.out.println("Enter first your name");
		String firstName = InputScanner.StringScanner();
		System.out.println("enter your last name");
		String lastName = InputScanner.StringScanner();
		String str7 = firstName + lastName;
		System.out.println("enter your phone number");
		String mobileNumber = InputScanner.StringScanner();
//		LocalDate localDate = LocalDate.now();

		replaceWord(firstName, str7, mobileNumber);
	}

	private static void replaceWord(String str5, String str7, String str8) {

		System.out.println(STR1.replaceAll("<<name>>", str5));
		System.out.println(STR2.replaceAll("<<full name>>", str7));
		System.out.println(STR3.replaceAll("91-xxxxxxxxxx", str8));
		System.out.println(STR4.replaceAll("<<01/01/2019>>", "01/11/2019"));
	}

}
