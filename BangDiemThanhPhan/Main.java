package BangDiemThanhPhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList <SinhVien> danhsachsv = new ArrayList <>();
		int t = Integer.parseInt(sc.nextLine());
		for (int i=0; i<t; i++) {
			danhsachsv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		Collections.sort(danhsachsv);
		for (int i=0; i<danhsachsv.size(); i++) {
			System.out.println((i+1) + " " + danhsachsv.get(i));
		}
	}
	
}
