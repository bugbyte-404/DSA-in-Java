package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicatesInArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number of test cases");
		int t = scn.nextInt();
		for (int j = 1; j <= t; j++) {
			System.out.println("enter the length of the array");
			int n = scn.nextInt();
			int arr[] = new int[n];
			System.out.println("Start filling the array");
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();

			}
			System.out.println(duplicates(arr, n));
			
		}
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

//		map.put(arr[0], false);
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], true);
			else
				map.put(arr[i], false);

		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		int minnter = Integer.MIN_VALUE;
		for (int val : map.keySet()) {

			if (map.get(val)) {
				al.add(val);

			}
		}
		Collections.sort(al);
		if(al.size()==0)
			al.add(-1);
		return al;

	}

}
