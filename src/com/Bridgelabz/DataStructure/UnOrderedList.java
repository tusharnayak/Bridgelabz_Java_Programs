package com.Bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {
		DSUtility<String> list = new DSUtility<String>();
		FileReader fr = new FileReader("E:\\BridgeLabz\\BridgeLabz\\tusha.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		String s = "";
		String[] array;
		while ((str = br.readLine()) != null) {
			// System.out.print(str+" ");
			s += str;
		}
		// System.out.println(s);
		// list.display();

		array = s.split(" ");
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		list.display();

		System.out.println();
		System.out.println("enter the word you want to search from the list");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		list.search(s1);
		System.out.println(s1);
		boolean bool = list.search(s1);
		if (bool) {
			list.remove(s1);
		} else {
			list.add(s1);
		}
		String m = "";
		for (int i = 0; i <= list.size1(); i++) {
			m += list.indexOf(i);
			m += " ";
		}
		list.display();
		BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\BridgeLabz\\BridgeLabz\\tusha.txt"));
		writer.write(m + " ");
		writer.close();

	}
}