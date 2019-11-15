package com.Bridgelabz.Logical;

import java.util.Scanner;

public class Gambler {
	Scanner scan = new Scanner(System.in);
	String name;
	int stake;
	int goal;
	int numberOfTimes;
	int bet;

	void display()

	{
		System.out.println("enter your name");
		String name = scan.nextLine();
		System.out.println("hi " + name + " welcome to gambling game");
		stake();

	}

	void stake() {
		System.out.println("enter the stake you have");
		int stake = scan.nextInt();
		goal();
	}

	void goal() {
		System.out.println("enter your goal");
		int goal = scan.nextInt();
		numberOfTimes();
	}

	void numberOfTimes() {
		System.out.println("enter how many times you want to roll");
		int numberOfTimes = scan.nextInt();
		bet();
	}

	void bet()

	{

		bet = 1;
		game();
	}

	void game() {
		int randomNumber = (int) (Math.random() * 0.5);
		if (bet == randomNumber) {
			System.out.println("congrats you won" + bet);
			stake = stake + bet;
			System.out.println(stake);
			bet();
		} else {
			System.out.println("sorry you lost" + bet + "amount");
			stake = stake - bet;
			System.out.println(stake);
			if (stake == 0) {
				System.out.println("you have lose all your money");

			}
		}
	}

	public static void main(String args[]) {
		Gambler g = new Gambler();
		g.display();
		g.stake();
		g.goal();
		g.numberOfTimes();
		g.bet();
		g.game();
	}

}
