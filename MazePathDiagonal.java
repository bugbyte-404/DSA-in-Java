package HackblockPractise;

import java.util.Scanner;

public class MazePathDiagonal {
	static Scanner scn = new Scanner(System.in);
	static int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side length of the square board");
		int n = scn.nextInt();
		printMazePath(1, 1, n, n, "");
		System.out.println("\n" + a);
	}
//	VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD 
//	11
	public static void printMazePath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			++a;
			System.out.print(ans + " ");
			return;

		} else if (cr > er || cc > ec)
			return;

		printMazePath(cr + 1, cc, er, ec, ans + "V");
		printMazePath(cr, cc + 1, er, ec, ans + "H");
		if(cr==cc)
		printMazePath(cr + 1, cc + 1, er, ec, ans + "D");
	}

}
