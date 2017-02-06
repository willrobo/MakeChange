package MyProjects;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char array1[][] = { { '*', '*', '*' }, { '*', '*', '*' }, { '*', '*', '*' } };

		char choice;

		int row, column, turn;
		row = 1;
		column = 1;
		turn = 1;

		System.out.println("Choose X or O: ");
		choice = keyboard.next().charAt(0);

		if (choice == 'x' || choice == 'X') {
			turn = 0;
		} else if (choice == 'y' || choice == 'Y') {
			turn = 1;
		}

		for (int i = 0; i < 9; i++) {
			turn = turn + 1;
			if (turn % 2 == 0) {
				playerO(choice, row, column, array1);
			} else if (turn % 2 == 1) {
				playerx(choice, row, column, array1);
			}
		}
		
		System.out.println("Nice try, but you both suck at TicTacToe!!!");
	}

	public static void printchoice(char[][] array1) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j]);
			}
			System.out.println("");
		}

	}

	public static void playerx(char choice, int row, int column, char[][] array1) {
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Choose your row (1-3): ");
			row = keyboard.nextInt();
		} while (row >= 4 || row <= 0);

		do {
			System.out.println("Choose your column (1-3): ");
			column = keyboard.nextInt();
		} while (column >= 4 || column <= 0);

		while (array1[row - 1][column - 1] == 'X' || array1[row - 1][column - 1] == 'O') {
			System.out.print("Space is already taken!");
			System.out.println("Choose your row (1-3): ");
			row = keyboard.nextInt();

			System.out.println("Choose your column (1-3): ");
			column = keyboard.nextInt();

		}

		array1[row - 1][column - 1] = 'X';
		printchoice(array1);
		checkwinnerX(array1);

	}

	public static void playerO(char choice, int row, int column, char[][] array1) {
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Choose your row (1-3): ");
			row = keyboard.nextInt();
		} while (row >= 4 || row <= 0);

		do {
			System.out.println("Choose your column (1-3): ");
			column = keyboard.nextInt();
		} while (column >= 4 || column <= 0);

		while (array1[row - 1][column - 1] == 'X' || array1[row - 1][column - 1] == 'O') {
			System.out.print("Space is already taken!");
			System.out.println("Choose your row (1-3): ");
			row = keyboard.nextInt();

			System.out.println("Choose your column (1-3): ");
			column = keyboard.nextInt();

		}

		array1[row - 1][column - 1] = 'O';

		printchoice(array1);

		checkwinnerO(array1);

	}

	public static void checkwinnerX(char[][] array1) {
		if (array1[0][0] == 'X' && array1[0][1] == 'X' && array1[0][2] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[1][0] == 'X' && array1[1][1] == 'X' && array1[1][2] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[2][0] == 'X' && array1[2][1] == 'X' && array1[2][2] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][0] == 'X' && array1[1][0] == 'X' && array1[2][0] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][1] == 'X' && array1[1][1] == 'X' && array1[2][1] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][2] == 'X' && array1[1][2] == 'X' && array1[2][2] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[2][0] == 'X' && array1[1][1] == 'X' && array1[0][2] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][0] == 'X' && array1[1][1] == 'X' && array1[2][2] == 'X') {
			System.out.println("You win!");
			System.exit(0);
		}
	}

	public static void checkwinnerO(char[][] array1) {
		if (array1[0][0] == 'O' && array1[0][1] == 'O' && array1[0][2] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[1][0] == 'O' && array1[1][1] == 'O' && array1[1][2] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[2][0] == 'O' && array1[2][1] == 'O' && array1[2][2] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][0] == 'O' && array1[1][0] == 'O' && array1[2][0] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][1] == 'O' && array1[1][1] == 'O' && array1[2][1] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][2] == 'O' && array1[1][2] == 'O' && array1[2][2] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[2][0] == 'O' && array1[1][1] == 'O' && array1[0][2] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		} else if (array1[0][0] == 'O' && array1[1][1] == 'O' && array1[2][2] == 'O') {
			System.out.println("You win!");
			System.exit(0);
		}
	}

}
 