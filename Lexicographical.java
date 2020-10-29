package HackblockPractise;

import java.util.Scanner;

public class Lexicographical {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the value of n");
		int n = scn.nextInt();
		lexicoCounting(0, n);

	}

	public static void lexicoCounting(int curr, int end) {

		if (curr > end) {
			return;
		}

		System.out.print(curr + " ");

		int i = 0;

		if (curr == 0)
			i = 1;

		while (i <= 9) {
			lexicoCounting(curr * 10 + i, end);
			i++;
		}

	}
}
