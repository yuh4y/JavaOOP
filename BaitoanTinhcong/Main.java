package BaitoanTinhcong;

import java.util.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = Integer.parseInt(scan.nextLine());
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		for (int i=0; i<n; i++) {
			NhanVien nv = new NhanVien(i+1, scan.nextLine(), Integer.parseInt(scan.nextLine()),Integer.parseInt(scan.nextLine()),scan.nextLine());
			ds.add(nv);
		}
		Collections.sort(ds);
		for (NhanVien nv : ds ) {
			System.out.println(nv);
		}
		scan.close();
	}
}
