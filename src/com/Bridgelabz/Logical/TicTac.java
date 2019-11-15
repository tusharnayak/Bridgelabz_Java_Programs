package com.Bridgelabz.Logical;

import java.util.Scanner;

public class TicTac {
	char board[][] = new char[3][3];

	// Display function//
	public static void display(char board[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	// REPLACE FUNCTION//
	public static void replace(char board[][], char find, char replace) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == find) {
					board[i][j] = replace;
					return;
				}
			}
		}
	}

	// CHECK FOR WINNER FIUNCTIN//
	public boolean checkForWinner() {
		return (CheckForRow() || CheckForColumn() || CheckForDiagonal());
	}

	// CHECK FOR ROW FUNCTION//
	public boolean CheckForRow() {
		for (int i = 0; i < 3; i++) {
			if (check(board[i][0], board[i][1], board[i][2]) == true) {
				return true;
			}
		}
		return false;
	}

	// CHECK FOR COLUMN FUNCTION//
	public boolean CheckForColumn() {
		for (int i = 0; i < 3; i++) {
			if (check(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;
	}

	// CHECK FOR DIAGONAL FUNCTION//
	public boolean CheckForDiagonal() {
		return ((check(board[0][0], board[1][1], board[2][2]) == true)
				|| (check(board[1][1], board[2][0], board[0][2]) == true));
	}

	// CHECK FUNCTIN //

	public boolean check(char c1, char c2, char c3) {
		return ((c1 == c2) && (c2 == c3));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first player name:--> ");
		String Player1 = sc.nextLine();

		System.out.println("Enter Second player name:--> ");
		String Player2 = sc.nextLine();

		// TAKE PLAYER SYMBOL//

		System.out.println("Enter first player symbol (X OR O):--> ");
		char PlayerSymbol_1 = sc.nextLine().charAt(0);

		System.out.println("Enter first player symbol (X OR O):--> ");
		char PlayerSymbol_2 = sc.nextLine().charAt(0);

		while (PlayerSymbol_1 != 'x' && PlayerSymbol_1 != 'X' && PlayerSymbol_1 != 'o' && PlayerSymbol_1 != 'O') {
			System.out.println("Invalid input, Please enter correct marker symbol !!");
			PlayerSymbol_1 = sc.nextLine().charAt(0);
		}

		// WHEN PLAYER 1 SELECT SYMBOL THEN WE ASSOCIATE REMANNING SYMOL TO PLAYER 2 //
		if (PlayerSymbol_1 == 'x' || PlayerSymbol_1 == 'X') {
			PlayerSymbol_2 = 'o';
		} else {
			PlayerSymbol_2 = 'x';
		}
		// To access board data member Firstly create the object of class//
		TicTac game = new TicTac();
		// 1>. Display pattern
		// Initialize pattern or board
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// character.forDigit() return the char representation of the specified digit in
				// the specified index //
				game.board[i][j] = Character.forDigit(counter++, 10);
			}
		}
		display(game.board);
		// TAKE USER CHOICE //

		for (int i = 0; i < 4; i++) {
			System.out.print(Player1 + " Turn :");
			char choice = sc.next().charAt(0);
			// HOW WE REPLACE THE USER /PLAYER WITH PLAYER SELECTED SYMBOL //
			replace(game.board, choice, PlayerSymbol_1);
			display(game.board);
			System.out.println(Player2 + "Turn: ");
			choice = sc.next().charAt(0);
			replace(game.board, choice, PlayerSymbol_2);
			display(game.board);

			// upper loop run 8 times, but there are 9 option//
			System.out.println(Player1 + "Turn: ");
			choice = sc.next().charAt(0);
			replace(game.board, choice, PlayerSymbol_1);
			display(game.board);
			// check fort win or draw//
			if (game.checkForWinner())
				System.out.println("we won the match");
			else
				System.out.println("math is draw ");

		}
	}

}
