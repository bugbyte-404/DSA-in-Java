package HackblockPractise;

import java.util.Scanner;

public class AntiClockwiseSpiral {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = takeInput();
		spiralclock(arr);
	}

	public static int[][] takeInput() {
		int arr[][];
		int m = scn.nextInt();
		int n = scn.nextInt();

		arr = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = scn.nextInt();

		return arr;
	}

	public static void spiralclock(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;

		int count = 0, i = 0, j = 0;
		int total = m * n;
		int minrow = 0, mincol = 0, maxrow = m - 1, maxcol = n - 1;

		while (count < total) {
			for (i=minrow; i <= maxrow; i++) {

				if (count < total) {
					++count;
					System.out.print(arr[i][mincol] + ", ");
				}
			}

			mincol++;
			// j--;

			for (j = mincol; j <= maxcol; j++) {

				if (count < total) {
					++count;

					System.out.print(arr[maxrow][j] + ", ");
				}
			}
			maxrow--;
			// i--;

			for (i = maxrow; i >= minrow; i--) {

				if (count < total) {
					++count;

					System.out.print(arr[i][maxcol] + ", ");
				}
			}
			maxcol--;
			// j++;

			for (j = maxcol; j >= mincol; j--) {

				if (count < total) {
					++count;

					System.out.print(arr[minrow][j] + ", ");
				}
			}
			minrow++;
			// i++;
		}
		System.out.println("END");

	}

}
