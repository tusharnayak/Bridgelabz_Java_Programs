package com.Bridgelabz.functional;

import com.Bridgelabz.program.utility.Util;

public class WindChill {
	public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		Util.wind(v, t);
	}
}
