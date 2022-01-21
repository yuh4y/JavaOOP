package PhanSo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		long tu1 = scan.nextLong();
		long mau1 = scan.nextLong();
		long tu2 = scan.nextLong();
		long mau2 = scan.nextLong();
		PhanSo p1 = new PhanSo(tu1, mau1);
		PhanSo p2 = new PhanSo(tu2, mau2);
		PhanSo kq = p1.result(p2);
 		System.out.println(kq);
		scan.close();
	}
}
