package HackblockPractise;

import java.util.Scanner;

public class BoardPath {
	static Scanner scn = new Scanner(System.in);
	static int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side of the square board");
		int end = scn.nextInt();
		System.out.println("Enter the number of faces on the dice");
		int m = scn.nextInt();
		printBoardPath(0, end, m, "");
		System.out.println("\n" + a);
	}

	public static void printBoardPath(int curr, int end, int m, String ans) {

		if (curr == end) {
			++a;
			System.out.print(ans + " ");
			return;
		}

		for (int dice = 1; dice <= m && curr + dice <= end; dice++) {
			printBoardPath(curr + dice, end, m, ans + dice);
		}

	}
}
