package L13_Feb16;

public class BlockedMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//BlockedMaze(, row, col, ans, visited);
		char board[][] = { { 'o', 'x', 'o', 'o' }, { 'o', 'o', 'o', 'o' }, { 'o', 'x', 'o', 'o' },
				{ 'o', 'o', 'x', 'o' } };
		BlockedMaze(board, 0, 0, "", new boolean[board.length][board[0].length]);
	}

	public static void BlockedMaze(char board[][], int row, int col, String ans, boolean visited[][]) {

		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] || board[row][col] == 'x')
			return;

		if (row == board.length-1 && col == board[0].length-1) {
			System.out.println(ans);
			return;
		}

		visited[row][col] = true;
		BlockedMaze(board, row - 1, col, ans + "T", visited);
		BlockedMaze(board, row, col - 1, ans + "L", visited);
		BlockedMaze(board, row + 1, col, ans + "D", visited);
		BlockedMaze(board, row, col + 1, ans + "R", visited);
		visited[row][col] = false;

	}
}
