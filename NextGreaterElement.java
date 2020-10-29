package HackblockPractise;

import java.util.Scanner;

public class NextGreaterElement {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			System.out.println("t= " + t);
			int n = scn.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);
			System.out.println("t= " + t);
			t--;
			System.out.println("t= " + t);
		}

	}

	// Function to print Next Greater Element for each element of the array
//	Sample Input
//	3 11 13 21
//	2
//	4
//	11 13 21 3
//	5
//	11 9 13 21 3
//	Sample Output
//	11,13
//	13,21
//	21,-1
//	3,-1
//	11,13
//	9,13
//	13,21
//	21,-1
//	3,-1
	public static void nextLarger(int[] arr) {

// Write Code here
		int curr = 0, result = -1;
		for (int i = 0; i < arr.length; i++) {
			curr = arr[i];
			result = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > curr) {
					result = arr[j];
					break;
				}
			}
			System.out.println(curr + "," + result);
		}
	}

}
