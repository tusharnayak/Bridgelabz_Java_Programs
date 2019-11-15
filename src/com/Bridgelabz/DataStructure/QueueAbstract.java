package com.Bridgelabz.DataStructure;

import java.util.Scanner;

public class QueueAbstract {
	public static void main(String[] args) {

		DSUtility u = new DSUtility();

		int x = 1;
		while (x > 0) {
			System.out.println("Welcome to XYZ bank");
			System.out.println("press 1 for deposit");
			System.out.println("press 2 for withdraw");
			System.out.println("press 3 for giving number of person");
			Scanner scan = new Scanner(System.in);
			System.out.println("give your input");
			int input = scan.nextInt();

			switch (input) {
			case 1:
				System.out.println("enter the amount");
				int amount = scan.nextInt();
				System.out.println("amount deposited successfully");
				System.out.println("--------THANKYOU VISIT AGAIN-------");
				u.dequeue();
				x--;
				break;
			case 2:
				System.out.println("enter the withdrawn amount");
				int amount1 = scan.nextInt();
				System.out.println("amount deposited successfully");
				System.out.println("--------THANKYOU VISIT AGAIN-------");
				u.dequeue();
				x--;
				break;
			case 3:
				System.out.println("enter the number of person in the queue");
				int person = scan.nextInt();
				x = person * x;
				for (int i = 0; i < person; i++) {
					u.dequeue();
				}
				System.out.println("You have entered " + person + " to the queue");
				break;
			}

		}
	}
}
