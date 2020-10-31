package L6_Jan18;

import java.util.Scanner;

public class MatrixMultiplication {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = takeInput();
		int a = arr1.length;
		int b = arr1[0].length;
		System.out.println("Enter number of coloumns of the second array");
		int c = scn.nextInt();
		int arr2[][] = new int[b][c];
		arr2 = takeInput2(b, c);
		int pro[][] = new int[a][c];
		pro = multiply(arr1, arr2);
		dis(pro);
	}

	public static int[][] takeInput() {
		System.out.println("Enter the number of rows of the  first array");
		int m = scn.nextInt();
		System.out.println("Enter the number of coloumns of the first array");
		int n = scn.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Start entering the array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				arr[i][j] = scn.nextInt();
		}
		return arr;
	}

	public static int[][] takeInput2(int r, int c) {
//		System.out.println("Enter the number of rows of the  first array");
//		int m = scn.nextInt();
//	System.out.println("Enter the number of coloumns of the second array");
//		int n = scn.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("Start entering the array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				arr[i][j] = scn.nextInt();
		}
		return arr;
	}

	public static int[][] multiply(int arr1[][], int arr2[][]) {

		int a = arr1.length;
		int b = arr1[0].length;
		int c = arr2[0].length;
		int pro[][] = new int[a][c];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < c; j++) {
				pro[i][j] = product(arr1, arr2, i, j, b);
			}

		}
		return pro;
	}

	public static int product(int arr1[][], int arr2[][], int i, int j, int com) {
		int sum = 0;
		for (int count = 0; count < com; count++) {
			sum += arr1[i][count] * arr2[count][j];
		}
		return sum;
	}

	public static void dis(int arr[][]) {
		for (int val[] : arr) {
			for (int val1 : val) {
				System.out.print(val1 + " ");
			}
			System.out.println();
		}
	}

}
