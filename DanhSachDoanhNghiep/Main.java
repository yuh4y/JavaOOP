package DanhSachDoanhNghiep;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new File ("DN.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <DoanhNghiep> danhsach = new ArrayList<>();
		while (t-->0) {
			danhsach.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(danhsach);
		for (DoanhNghiep sv : danhsach) {
			System.out.println(sv);
		}
	}

}