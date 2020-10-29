package HackblockPractise;

import java.util.Scanner;

public class LargestSubArrayWithZeroAndOne {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		// TODO Auto-generated method stub
		int tt = scn.nextInt();
		for (int h = 1; h <= tt; h++) {
			int arr[] = takeInput();
			int t = -1;
			int s = arr.length * (arr.length + 1) / 2;
			int sindex[] = new int[s];
			int eindex[] = new int[s];
			int result[] = new int[s];
			for (int si = 0; si < arr.length; si++) {
				for (int ei = si; ei < arr.length; ei++) {
					int temp[] = new int[ei - si + 1];
					int a = -1;
					for (int k = si; k <= ei; k++) {
						temp[++a] = arr[k];
					}
					// dis(temp);
					int nozo = work(temp);
					if (nozo == -1)
						continue;
					else {
						++t;
						result[t] = nozo;
						//// System.out.println("Result done");dis(result);
						sindex[t] = si;
						// System.out.println("sindex done");dis(sindex);
						eindex[t] = ei;
						// System.out.println("Eindex done");dis(eindex);

					}
				}
			}
			int index = IndexCorrespondingToMaxValue(result);
			if (allzero(result) == false)
				System.out.println(sindex[index] + " " + eindex[index]);
			else
				System.out.println("None");
		}
	}

	public static int IndexCorrespondingToMaxValue(int arr[]) {
		int max = arr[0], pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				pos = i;
			}
		}
		return pos;
	}

	public static void dis(int arr[]) {
		for (int val : arr)
			System.out.print(val + " ");
		System.out.println();
	}

	public static int work(int arr[]) {

		int one = 0, zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				++one;
			else if (arr[i] == 0)
				++zero;
		}
		if (one == zero)
			return one;
		else
			return -1;
	}

	public static int[] takeInput() {
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static boolean allzero(int arr[]) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				++a;
		}
		if (a == 0)
			return true;
		else
			return false;
	}
}
