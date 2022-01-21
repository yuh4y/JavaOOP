package MyPackage;

import java.util.Scanner;

public class testProject {
	static long mod = (long) (1e9 + 7);
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		while (true) {
			long base = scan.nextLong();
			long exponent = scan.nextLong();
			if (base==0 && exponent==0) {
				break;
			}
			else {
				System.out.println(runCase(base, exponent));
			}
		}
		scan.close();
	}
	static long runCase(long a, long b) {
		if (b==0)
			return 1;
		else if (b==1)
			return a;
		else {
			long temp = runCase(a,b/2)%mod;
			return (b%2==1) ? (((temp*temp)%mod *a)%mod) : (temp*temp)%mod;
		}
	}
}
