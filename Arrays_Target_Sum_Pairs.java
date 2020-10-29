package HackblockPractise;

import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
	static Scanner scn = new Scanner(System.in);
	static int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int temp[] = new int[fact(arr.length)];
		int k = -1;
		int val = scn.nextInt(), ans = 0;

		if (arr.length > 0 && arr.length < 1000) {
			for (int i = 0; i < arr.length; i++) {
				ans = sumExceptthis(arr, arr[i], val, i);
				if (ans != -1) {
					temp[++k] = (int) Math.min(arr[i], ans);
					temp[++k] = (int) Math.max(arr[i], ans);
				}

				// System.out.println((int) Math.min(arr[i], ans) + " and " +
				// (int)Math.max(arr[i], ans));
				// System.out.println(arr[i] + " and " + ans);
//				else
//					System.out.println("sorry");

			}
			// display(temp);
			work(temp);
		}
	}

	public static void work(int arr[]) {
		int i = 0;
		for (i = 1; i < arr.length; i++) {
			if (arr[i] == arr[0])
				break;
		}
//		System.out.println("\nabsc\n");
//		display(arr, i);
//		System.out.println("\nabsfdfdsfdsfdc\n");
		for (int j = 0; j < i; j += 2) {
			System.out.print((int) Math.min(arr[j], arr[j + 1]) + " and " + (int) Math.max(arr[j], arr[j + 1]));
			System.out.println();

		}
	}

	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		return fact;
	}

	public static void display(int arr[], int n) {
		for (int i = 0; i <= n; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] takeInput() {
		System.out.println("Size?");
		int n = scn.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static int sumExceptthis(int arr[], int n, int val, int pos) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n && a == 0) {
				++a;
				continue;
			} else {
				if (arr[i] + n == val && i != pos)
					return arr[i];
			}
		}
		return -1;
	}

}
