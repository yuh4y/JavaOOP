package DanhSachSinhVienFile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner scanner = new Scanner (new File ("SV.in"));
		Scanner sc = scanner;
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <SinhVien> danhsach = new ArrayList <>();
		for(int i=0; i<t; i++) {
			danhsach.add(new SinhVien(i+1, sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
		}
//		Collections.sort(danhsach);
		for(SinhVien sv : danhsach) {
			System.out.println(sv);
		}
		sc.close();
	}

}
/*
C:\java\JavaProjectPTIT\src\test.txt
*/