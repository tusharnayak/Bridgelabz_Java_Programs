package com.Bridgelabz.program;

import com.Bridgelabz.program.utility.InputScanner;
import com.Bridgelabz.program.utility.Util;

public class FlipCoins {
	public static void main(String[] args) {
		System.out.println("enter how many times you want to flip the coin");
		int num = InputScanner.intScanner();
		Util.coin(num);

	}

}
