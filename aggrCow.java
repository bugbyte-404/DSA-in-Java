package HackblockPractise;

import java.util.Arrays;
import java.util.Scanner;

public class aggrCow {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println();
		// System.out.println("Enter the number of stalls");
		int n = scn.nextInt();
		// System.out.println("Enter the number of cows");
		int m = scn.nextInt();
		int stall[] = takeInput(n);
		Arrays.sort(stall);
		work(stall, n, m);
	}

	public static int[] takeInput(int n) {

		int arr[] = new int[n];
		// System.out.println("Enter the elements of array");
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;

	}

	public static void work(int stall[], int n, int m) {

		int lo = 0, hi = stall[n - 1] - stall[0], mid = 0;
		boolean flag = false;

		while (lo <= hi) {
			mid = (lo + hi) / 2;

			flag = canwekeep(stall, mid, m);

			if (flag) {
				lo = mid + 1;

			} else
				hi = mid - 1;
		}
		System.out.println("The minimum distance is " + mid);

	}

	public static boolean canwekeep(int stall[], int mid, int m) {

		int i = 0, count = 1, j = 0;

		for (j = 1; j < stall.length; j++) {
			if (stall[j] - stall[i] >= mid) {
				i = j;
				++count;
			}
		}

		if (count >= m)
			return true;
		else
			return false;

	}
}
