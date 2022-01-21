package MyPackage;

import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-->0) {
			long inputNumber = scan.nextInt();
			System.out.println(runcase(inputNumber));
		}
		scan.close();
	}
	static long runcase(long n) {
		long result=1;
		for (long i=2; i<=n; i++) {
			result = lcm(result, i);
		}
		return result;
	}
	static long GCD(long a, long b) {
		return a == 0 ? b : GCD(b%a, a);
	}
	static long lcm(long a, long b) {
		return (a*b)/GCD(a,b);
	}
}
