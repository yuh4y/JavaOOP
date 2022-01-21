package MyPackage;

import java.util.Scanner;

public class J03007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int t = Integer.parseInt(scan.nextLine());
		while (t-->0) {
			String s = scan.nextLine();
			StringBuilder stri = new StringBuilder (s);
			if (checkReverse(stri) == true && checkchiahet(s) == true && checkdaucuoi(s) == true) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
		scan.close();
	}
	static boolean checkReverse(StringBuilder str) {
		StringBuilder tmp = str;
		tmp.reverse();
		if (tmp.equals(str))
			return true;
		else return false;
	}
	static boolean checkdaucuoi (String str) {
		if (str.charAt(0)-'0' == 8 && str.charAt(str.length()-1)-'0' == 8) 
			return true;
		return false;
	}
	static boolean checkchiahet (String str) {
		int sum=0;
		for (int i=0; i<str.length();i++) {
			sum += (str.charAt(i)-'0');
		}
		if (sum % 10 == 0)
			return true;
		else return false;
	}

}
