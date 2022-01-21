package DanhSachSinhVien;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fin = new File ("C:\\java\\JavaProjectPTIT\\src\\test.txt");
		Scanner sc = new Scanner (fin);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <SinhVien> danhsach = new ArrayList<>();
		while (t-->0) {
			danhsach.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(danhsach);
		for (SinhVien sv : danhsach) {
			System.out.println(sv);
		}
		sc.close();
	}

}
