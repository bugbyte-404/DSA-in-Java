package HackblockPractise;

import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Take N as input. For a value of N=7, we wish to draw the following pattern :
		 * :
		 * 
		 * 1 2 1 1 2 3 2 1 1 2 3 4 3 2 1 1 2 3 4 3 2 1 1 2 3 2 1 1 2 1
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scn.nextInt();
		int row = 1, nsp1 = 2 * n - 2, nsp2 = -1, nst = 1, cst = 1, csp = 1;
		int k = (n) / 2 + 1;
		while (row <= 2*k-1) {

			for (csp = 1; csp <= nsp1; csp++)
				System.out.print("  ");

			if (row == 1 || row == 2 * k - 1)
				cst = nst - 1;
			else
				cst = nst;
			for (; cst >= 1; cst--)
				System.out.print(cst + " ");
//			if (row == n)
//				csp = 2;
//			else 
			csp = 1;
			for (; csp <= nsp2; csp++)
				System.out.print("  ");

			for (cst = 1; cst <= nst; cst++)
				System.out.print(cst + " ");

			row++;
			System.out.println();

			if (row <= k) {
				nsp1 -= 2;
				nst++;
				nsp2 += 2;
			} else {
				nsp1 += 2;
				nst--;
				nsp2 -= 2;
			}

		}

	}

}
