package HackblockPractise;

import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int n = scn.nextInt();

		int row = 1, nst = n, nsp = 2 * n - 1, cst = 1;

		while (row <= 2 * n + 1) {
			for (cst = n; cst >= nst; cst--)
				System.out.print(cst + " ");

			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");

			if (row == n + 1)
				cst = nst + 1;
			else
				cst = nst;

			for (; cst <= n; cst++)
				System.out.print(cst + " ");

			row++;
			System.out.println();
			if (row <= n + 1) {
				nst--;
				nsp -= 2;
			} else {
				nst++;
				nsp += 2;
			}

		}

	}

}
