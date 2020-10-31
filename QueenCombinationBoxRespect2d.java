package L12_Feb15;

import java.util.Scanner;

public class QueenCombinationBoxRespect2d {
	static Scanner scn = new Scanner(System.in);
	static int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the size of board");
//		int n = scn.nextInt();
		QCBR(new boolean[2][3], 0, 0, 2, 0, "");
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

		board[row][col] = true;
		QCBR(board, row, col + 1, tq, qpsf + 1, ans + "b" + row + "-" + col + " ");
		board[row][col] = false;

		QCBR(board, row, col + 1, tq, qpsf, ans);
	}

}
