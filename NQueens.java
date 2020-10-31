package L13_Feb16;

import java.util.Scanner;

public class NQueens {
	static int a = 0;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QCBR(new boolean[8][8], 0, 0, 8, 0, "");
	}

	public static void QCBR(boolean board[][], int row, int col, int tq, int qpsf, String ans) {

		if (tq == qpsf) {
			++a;
			System.out.println(a + ". " + ans);
			return;
		}

		if (col == board[0].length) {
			col = 0;
			row++;
		}
		if (row == board.length)
			return;

		// place
		if (IsItSafe(board, row, col)) {
			board[row][col] = true;
			QCBR(board, row, col + 1, tq, qpsf + 1, ans +"[" +row + "-" + col + "] ");
			board[row][col] = false;
		}
		// not place
		QCBR(board, row, col + 1, tq, qpsf, ans);
	}

	public static boolean IsItSafe(boolean board[][], int row, int col) {
		int r = row - 1;
		int c = col;
		// vertical

		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}
		// horizontal
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;
			c--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}

		return true;
	}
}
