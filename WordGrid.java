package L13_Feb16;

public class WordGrid {

	public static void main(String[] args) {
		System.out.println();
		// TODO Auto-generated method stub
		char board[][] = { { 'a', 'b', 'c', 'e' }, { 's', 'f', 'c', 's' }, { 'a', 'd', 'a', 'e' } };
		String word = "sea";
		WordSearch(board, 0, 0, 0, "", new boolean[board.length][board[0].length], word);
	}

	public static void WordSearch(char board[][], int row, int col, int idx, String ans, boolean visited[][], String word) {

		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col])
			return;

//		if (row == board.length-1 && col == board[0].length-1) {
//			System.out.println(ans);
//			return;
//		}
		if (word.charAt(idx) != board[row][col])
			return;

		if (idx == word.length() - 1) {
			System.out.println("Found");
			return;
		}

		visited[row][col] = true;
		WordSearch(board, row - 1, col, idx + 1, ans + "T", visited, word);
		WordSearch(board, row, col - 1, idx + 1, ans + "L", visited, word);
		WordSearch(board, row + 1, col, idx + 1, ans + "D", visited, word);
		WordSearch(board, row, col + 1, idx + 1, ans + "R", visited, word);
		visited[row][col] = false;

	}
}
