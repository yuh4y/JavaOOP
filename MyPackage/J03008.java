package MyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class J03008 {
	static Scanner scan = new Scanner (System.in);
	static int [] isPrime = new int[10];
	public static void main(String[] args) {
		laPrime();
		int t = Integer.parseInt(scan.nextLine());
		while (t-->0) {
			runcase();
			
		}
		scan.close();
	}
	/*static boolean checkReverse(String str) {
		for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
		return true;
	}*/
	static void laPrime () {
		Arrays.fill(isPrime, 1);
		isPrime[0] = 0;
		isPrime[1] = 0;
		for (int i=2; i*i<10; i++) {
			if(isPrime[i] ==  1) {
				for (int j=i*i; j<10; j+=i) {
					isPrime[j] = 0;
				}
			}
		}
	}
	static void runcase() {
		String s = scan.nextLine();
		for (int i=0; i<s.length();i++) {
			if(isPrime[s.charAt(i)-'0'] == 0) {
				System.out.println("NO");
				return;
			}
		}
		for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                System.out.println("NO");
                return;
            }
        }
		System.out.println("YES");
	}
	/*static boolean checkPrime(String str) {
		for (int i=0; i<str.length();i++) {
			if(isPrime[str.charAt(i)-'0'] == 0)
				return false;
		}
		return true;
	}*/

}
