package L12_Feb15;

import java.util.Scanner;

public class PalindromicPartitions {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		String str = scn.nextLine();
		palinPar(str, "");
	}
static int a=0;
	public static void palinPar(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(++a+". "+ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);
			if (isPalindrome(part)) {
				palinPar(roq, ans + part + " ");

			}
		}
	}

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
