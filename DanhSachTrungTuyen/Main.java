package DanhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File ("THISINH.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <ThiSinh> danhsach = new ArrayList<>();
		while(t-->0) {
			danhsach.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
		}
		int chitieu = Integer.parseInt(sc.nextLine());
		Collections.sort(danhsach);
		double diemchuan=0;
		for(ThiSinh ts : danhsach) {
			diemchuan = ts.getDiemxettuyen();
			chitieu--;
			if(chitieu==0)
				break;
		}
		System.out.println(diemchuan);
		for(ThiSinh ts : danhsach) {
			if(ts.getDiemxettuyen()>=diemchuan)
				System.out.println(ts + " TRUNG TUYEN");
			else
				System.out.println(ts + " TRUOT");
		}
		sc.close();
	}
/*
C:\java\JavaProjectPTIT\src\test.txt
THISINH.in
 */
}
