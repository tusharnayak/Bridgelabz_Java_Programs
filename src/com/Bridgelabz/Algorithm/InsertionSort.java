package com.Bridgelabz.Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.Bridgelabz.program.utility.Util;

public class InsertionSort {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\BridgeLabz\\BridgeLabz\\insertion.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		String s1 = null;
		while ((str = br.readLine()) != null) {
			s1 = str;
		}
		String arr[] = s1.split(",");
		System.out.println(Arrays.toString(arr));

		Util.insSort(arr);
		br.close();
	}
}
