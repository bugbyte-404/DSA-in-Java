package L12_Feb15;

import java.util.Scanner;

public class QueenCombinationBoxRespect {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of board");
		int n = scn.nextInt();
		QCBR(new boolean[n], 0, 2, 0, "");
	}

	public static void QCBR(boolean board[], int col, int tq, int qpsf, String ans) {

		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		if (col == board.length)
			return;

		board[col] = true;
		QCBR(board, col + 1, tq, qpsf + 1, ans + "b" + col + " ");
		board[col] = false;

		QCBR(board, col + 1, tq, qpsf, ans);
	}

}
