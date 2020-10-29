package HackblockPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxFrequencyCharacter {
	static Scanner scn = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Character> charlist = new ArrayList<Character>();

	public static void main(String[] args) {
		System.out.println();
		// TODO Auto-generated method stub
		String str = scn.nextLine();

		work(str);

	}

	public static void work(String str) {
		String copy = "";
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++)
			ch[i] = str.charAt(i);

		sort(ch, 0, str.length() - 1);

		for (int i = 0; i < str.length(); i++)
			System.out.print(ch[i]);
		System.out.println();

		for (int i = 0; i < str.length(); i++)
			copy = copy + ch[i];

		findmax(copy);
	}

	static int partition(char arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		char temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	static void sort(char arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static void findmax(String str) {
		int i = 0, j = 0;
		for (i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			for (j = i; j < str.length(); j++) {

				if (ch == str.charAt(j))// aaabbcc
					++count;
				else {// System.out.println(count);
					break;
				}
			}
			list.add(count);
			charlist.add(ch);
			i = j - 1;
		}
		 System.out.println(list);
		 System.out.println(charlist);
		int max = 0, pos = 0;
		for (i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
				pos = i;
			}
		}
		System.out.println(charlist.get(pos));

	}
//	public static void compress(String str) {
//		String copy = "";
//		int count = 0, i = 0, j = 0;
//		char ch = ' ';
//		for (i = 0; i < str.length(); i++) {
//			ch = str.charAt(i);
//			for (j = i; j < str.length(); j++) {
//				if (ch == str.charAt(j))
//					++count;
//				else
//					break;
//
//			}
//			i = j - 1;
//			//abc abc abc abc abc abc abc abc abc abc abc a
//			copy = copy + ch + count;
//			count = 0;
//		}
//	//yahan se lekar
//		int max = 0, no = 0, pos = -1;
//		for (i = 0; i < copy.length(); i++) {
//			char chr = copy.charAt(i);
//			if (chr >= '0' && chr <= '9') {
//				no = (int) (chr) - 48;
//				if (max < no) {
//					max = no;
//					pos = i;
//				}
//			}
//		}
//		System.out.println(copy.charAt(pos - 1));
//    // yahan tak ki
//	}

}
