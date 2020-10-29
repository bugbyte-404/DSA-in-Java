package HackblockPractise;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Source");
		int src = scn.nextInt();
		System.out.println("Enter Destination");
		int des = scn.nextInt();
		System.out.println("Enter the number in source format");
		int n = scn.nextInt();

		int dec = todecimal(n, src);
		int ans = decimalto(dec, des);
		System.out.println(ans);
	}

	public static int todecimal(int n, int src) {
		int c = -1, rm = 0, sum = 0;
		for (int r = n; r > 0; r /= 10) {
			rm = r % 10;
			sum = sum + (int) (rm * (Math.pow(src, ++c)));
		}
		return sum;
	}

	public static int reverse(int n) {
		int rev = 0;
		for (int r = n; r > 0; r /= 10) {
			rev = rev * 10 + r % 10;
		}
		return rev;
	}

	public static int decimalto(int n, int des) {
		int rm = 0, rev = 0;
		for (int r = n; r > 0; r /= des) {
			rm = r % des;
			rev = rev * 10 + rm;
		}
		rev = reverse(rev);
		return rev;
	}
}
