package com.Bridgelabz.Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;

import com.Bridgelabz.program.utility.Util;

public class BinarySearch {
	public static void main(String[] args) throws Exception {
\\
		FileReader fr = new FileReader("E:\\BridgeLabz\\BridgeLabz\\bridgelabz1.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		String s = null;
		while ((str = br.readLine()) != null) {
			s = str;
		}
		String arr[] = s.split(",");
		Util.bSearch(arr);
		br.close();
	}

}
