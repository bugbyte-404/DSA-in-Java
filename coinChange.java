package L12_Feb15;

import java.util.Scanner;

//import jdk.vm.ci.meta.Assumptions.ConcreteMethod;

public class coinChange {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinChanges(new int[] { 2, 3, 5, 6 }, 0, 10, "");
		System.out.println(count);
	}

	static int count = 0, a = 0;

	public static void coinChanges(int denom[], int idx, int amount, String ans) {
		++count;
		if (amount == 0) {
			System.out.println(++a + ". " + ans);
			return;
		}
		if (idx == denom.length || amount < 0)
			return;
		coinChanges(denom, idx + 1, amount, ans);
		coinChanges(denom, idx, amount - denom[idx], ans + denom[idx] + " ");
	}

}
