package L13_Feb16;

public class NQueenAliter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueen2(new boolean[4][4], 0, "");
	}

	static int count = 0;

	public static void NQueen2(boolean board[][], int row, String ans) {
		if (row == board.length) {
			System.out.println((++count) + ". " + ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (IsItSafe(board, row, col)) {
				board[row][col] = true;

				NQueen2(board, row + 1, ans + "[" + row + "-" + col + "] ");

				board[row][col] = false;
			}

		}

	}

	public static void KQueen(boolean board[][], int row, String ans, int tq, int qpsf) {
		if (row == board.length) {
			System.out.println((++count) + ". " + ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (IsItSafe(board, row, col)) {
				board[row][col] = true;

				KQueen(board, row + 1, ans + "[" + row + "-" + col + "] ", tq + 1, qpsf);

				board[row][col] = false;
			}

		}
		KQueen(board, row + 1, ans, tq, qpsf);

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
