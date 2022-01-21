package DanhSachSinhVienFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner (new File ("SINHVIEN.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <SinhVien> danhsach = new ArrayList <>();
		while (t-->0) {
			danhsach.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(danhsach);
		for(SinhVien sv : danhsach) {
			System.out.println(sv);
		}
		sc.close();
	}

}
