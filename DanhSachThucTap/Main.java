package DanhSachThucTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <SinhVien> danhsach = new ArrayList <>();
		for(int index=0; index<t; index++) {
			danhsach.add(new SinhVien(index+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
		}
		Collections.sort(danhsach);
		int n = Integer.parseInt(sc.nextLine());
		while (n-->0) {
			String str = sc.nextLine();
			for (SinhVien sv : danhsach) {
				if(str.equals(sv.getDoanhnghiep()))
					System.out.println(sv);
			}
		}
		sc.close();
	}

}
