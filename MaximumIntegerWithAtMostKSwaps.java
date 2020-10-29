package HackblockPractise;

import java.util.Scanner;

public class MaximumIntegerWithAtMostKSwaps {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the integer");
		int n = scn.nextInt();
		System.out.println("Enter the number of swaps");
		int k = scn.nextInt();
		String s = n + "";
		int arr[] = new int[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (s.charAt(i)) - 48;

		}

		for (int i = 0; i < k; i++) {
			flipAndCreateMax(arr, i);
		}

		int ans = 0;
		for (int val : arr) {
			ans = ans * 10 + val;
		}
		System.out.println(ans);
	}

	public static void flipAndCreateMax(int arr[], int i) {
		int temp = 0, pos = 0;
		int max = arr[i];
		for (int j = i + 1; j < arr.length; j++) {
			if (max < arr[j]) {
				max = arr[j];
				pos = j;
			}
		}
		temp = arr[i];
		arr[i] = arr[pos];
		arr[pos] = temp;

	}
}
