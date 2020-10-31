
import java.util.Scanner;

public class ExitPoint {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method tub
		System.out.println();
		// int arr[][]=new int[3][3];
		// int arr[][] = { { 0, 1, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 1, 0, 0
		// } };
		int arr[][] = takeInput();
//		int m = arr.length;
//		int n = arr[0].length;
		System.out.println("inputting done");
		work(arr);
	}

	public static int[][] takeInput() {
		System.out.println("Enter the number of rows");
		int m = scn.nextInt();
		System.out.println("Enter the number of coloumns");
		int n = scn.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Start entering the array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				arr[i][j] = scn.nextInt();
		}
		return arr;
	}

	public static void work(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;

		int row = -1, col = 0, check = 0, i = 0, c = -1, r = 0;
		while (r < m && c < n) {
			// System.out.println(r + "-------" + c + " check= " + check);
//			if(check==1)
//				break;
			// check = 0;
			System.out.println(r + " " + c);
			if (check != 0 && col == 1) {
				check = 0;
				while (r < m && c < n) {
					++r;
					if (((r < m && r >= 0 && c < n && c >= 0) && arr[r][c] == 1)) {
						row = 1;
						check = 1;

						break;
					}
//					++r;
				}
			}

			if (check != 0 && row == 1) {
				check = 0;
				while (r < m && c < n) {
					--c;
					if (c < 0)
						break;
					if ((r < m && r >= 0 && c < n && c >= 0) && arr[r][c] == 1) {
						col = -1;
						check = 1;

						break;
					}
				}
			}

			if (check != 0 && col == -1) {
				check = 0;

				while (r < m && c < n) {
					--r;
					if (r < 0)
						break;
					if (((r < m && r >= 0 && c < n && c >= 0) && arr[r][c] == 1)) {
						row = -1;
						check = 1;

						break;
					}
				}
			}

			if (check != 0 && row == -1) {
				check = 0;
				while (r < m && c < n) {
					++c;
					if (((r < m && r >= 0 && c < n && c >= 0) && arr[r][c] == 1)) {
						col = 1;
						check = 1;

						break;
					}
				}
			}

			if (i == 0 && row == -1) {
				check = 0;
				++i;

				while (r < m && c < n) {
					++c;
					if (arr[r][c] == 1) {
						col = 1;
						check = 1;

						break;
					}
				}
			}
		}
		if (r == m)
			System.out.println(r - 1 + " , " + c + "  1st waala");
		else if (c == n)
			System.out.println(r + " , " + (c - 1) + "  2nd waala");

		// else
		System.out.println(r + "LAST STAGE OF CODE r= " + r + "   c= " + c);

	}
}
