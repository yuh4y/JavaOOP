package MyPackage;

import java.util.Scanner;

public class J03006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int t = Integer.parseInt(scan.nextLine());
		while (t-->0) {
			String s = scan.nextLine();
			StringBuilder stri = new StringBuilder (s);
			if (checkReverse(stri) == true && checkevenNumber(s) == true) {
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
	static boolean checkevenNumber (String str) {
		for (int i=0; i<str.length();i++) {
			if ((str.charAt(i)-'0')%2 != 0)
				return false;
		}
		return true;
	}

}
