package L12_Feb15;

import java.util.ArrayList;
import java.util.Scanner;

//import com.sun.tools.javac.code.Attribute.Array;

public class DifferentWaysToAddParenthesis {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string of numbers and operators");
		String str = scn.nextLine();
		System.out.println(differentwaysToAddParenthesis(str));
	}

	public static ArrayList<Integer> differentwaysToAddParenthesis(String ques) {
		ArrayList<Integer> mr = new ArrayList<>();

		if (ques.indexOf('*') == -1 && ques.indexOf('-') == -1 && ques.indexOf('+') == -1) {
			mr.add(Integer.parseInt(ques));
		//	return mr;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ch == '+' || ch == '*' || ch == '-') {
				String p1 = ques.substring(0, i);
				String p2 = ques.substring(i + 1);

				ArrayList<Integer> rr1 = differentwaysToAddParenthesis(p1);
				ArrayList<Integer> rr2 = differentwaysToAddParenthesis(p2);

				for (int val1 : rr1) {
					for (int val2 : rr2) {
						if (ch == '+')
							mr.add(val1 + val2);
						else if (ch == '-')
							mr.add(val1 - val2);
						else if (ch == '*')
							mr.add(val1 * val2);
					}

				}
			}
		}
		return mr;
	}

}
