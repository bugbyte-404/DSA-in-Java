package L5_Jan12;

import java.util.Scanner;

public class ArrayOperations {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		display(arr);
		int max = max(arr);
		System.out.println("The largest element is " + max);
		System.out.println("Enter element to be searched");
		int ele = scn.nextInt();
		int pos = linearSearch(arr, ele);
		System.out.println("The element " + ele + " is present at location " + (pos + 1));

	}

	public static int[] takeInput() {
		System.out.println("Size?");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;

	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int max(int arr[]) {
		int m = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m)
				m = arr[i];
		}
		return m;

	}

	public static int linearSearch(int arr[], int item) {
		int a = 0, pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				a = 1;
				pos = i;
				break;
			}
		}
		if (a == 1)
			return pos;
		else
			return -2;
	}
}
