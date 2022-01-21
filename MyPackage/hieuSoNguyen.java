package MyPackage;

import java.util.Scanner;

public class hieuSoNguyen {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String a = new String (scan.nextLine());
		String b = new String (scan.nextLine());
		String res = "";
		int temp=0;
		while(a.length()<b.length()) a = "0" + a;
		while(a.length()>b.length()) b = "0" + b;
		
		
		scan.close();
	}

}
