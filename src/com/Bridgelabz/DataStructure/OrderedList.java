package com.Bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OrderedList {
	private static final String PATH = "E:\\BridgeLabz\\BridgeLabz\\new.txt";

	public static void main(String[] args) throws IOException {
		DSUtility<Integer> u = new DSUtility<Integer>();
		FileReader fr = new FileReader(PATH);
		BufferedReader br = new BufferedReader(fr);
		String str;
		String s = "";
		while ((str = br.readLine()) != null) {
			s = str;
		}

		String[] arr = s.split(" ");// to split the string array

		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(Arrays.toString(arr2));
		u.bubbleSort(arr2);// to arrange the data in ascending order

		for (int i : arr2) { // for adding the element to the linkedList
			u.insert(i);
		}
		System.out.println();
		u.display();

		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number you want to search");
		int num = scan.nextInt();
		u.search1(num);
		boolean bool = u.search1(num);
		if (bool) {
			u.remove1(num);
		} else {
			u.add1(num);
		}
		String m = "";
		for (int i = 0; i <= u.size1(); i++) {
			String x = Integer.toString(u.indexOfint(i));
			m += x;
			m += " ";
		}
		u.display();
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
		writer.write(m + " ");
		writer.close();

	}
}
