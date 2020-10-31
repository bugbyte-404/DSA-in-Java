

import java.util.ArrayList;
import java.util.Scanner;

public class CoinTossRecursive {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of tosses");
		int n = scn.nextInt();
		ArrayList<String> ans = coinToss(n);
		System.out.println(ans);
		System.out.println("Total cases: " + ans.size());
	}

	public static ArrayList<String> coinToss(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rrh = coinToss(n - 1);
		// ArrayList<String> rrt=coinToss(n-1);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rrh) {
			mr.add("H" + val);
			mr.add("T" + val);
		}
		return mr;
	}

}
