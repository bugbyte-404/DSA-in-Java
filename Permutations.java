

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = scn.nextLine();
		ArrayList<String> ans = getascii(str);
		System.out.println(ans);
		System.out.println(ans.size());

	}

	public static ArrayList<String> getascii(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getascii(ros);
		ArrayList<String> mr = new ArrayList<String>();

		for (String val : rr) {
			for(int i=0;i<=val.length();i++)
			{
				mr.add(val.substring(0,i)+ch+val.substring(i));
			}
		}
		return mr;
	}

}
