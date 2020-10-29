package HackblockPractise;

//import java.util.ArrayList;
import java.util.Scanner;

public class Sudoku {
	static Scanner scn = new Scanner(System.in);
	static int ec = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the value of n");
//		int n = scn.nextInt();
////		if (n % 3 != 0)
////			System.out.println("Sorry Sudoku grid can't be created");
////		else {
////			arr = new int[n][n];
//		int grid[][] = new int[n][n];
////			System.out.println("Start entering the sudoku grid");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++)
//				grid[i][j] = scn.nextInt();
//
//		}
		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		for (int find = grid[0].length - 1; find >= 0; find--)
			if (grid[grid.length - 1][find] == 0) {
				ec = find + 1;
				break;
			}
		SudokuSolver(grid, 0, 0, "");

	}

	static int a = -1;

	public static void SudokuSolver(int grid[][], int row, int col, String ans) {
		if (row == grid.length - 1 && col == ec) {
//			System.out.println(ans);
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					if (grid[i][j] == 0)
						System.out.print(ans.charAt(++a) + " ");
					else
						System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}

		if (col >= grid[0].length) {
			col = 0;
			row = row + 1;
		}
		if (row >= grid[0].length || col >= grid[0].length)
			return;

		if (grid[row][col] == 0) {
			for (int nos = 1; nos <= grid.length; nos++) {
				if (isSafe(grid, row, col, nos)) {

					grid[row][col] = nos;
					SudokuSolver(grid, row, col + 1, ans + nos + " ");

				}
			}
			grid[row][col] = 0;

		} else
			SudokuSolver(grid, row, col + 1, ans);

	}

	public static boolean isSafe(int grid[][], int row, int col, int value) {

		int n = grid.length, sr = 0, sc = 0;

		for (int r = 0; r < grid.length; r++) {
			if (grid[r][col] == value)
				return false;

		}
		for (int c = 0; c < grid[0].length; c++) {
			if (grid[row][c] == value)
				return false;
		}

		if (row >= n / 3 + 3)
			sr = n / 3 + 3;
		else if (row >= n / 3)
			sr = n / 3;
		else
			sr = 0;

		if (col >= n / 3 + 3)
			sc = n / 3 + 3;
		else if (col >= n / 3)
			sc = n / 3;
		else
			sc = 0;

		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++)
				if (grid[i][j] == value)
					return false;
		}

		return true;

	}

}