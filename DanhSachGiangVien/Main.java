package DanhSachGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <GiangVien> dsgv = new ArrayList <>();
		for(int i=0; i<t; i++) {
			dsgv.add( new GiangVien(i+1,sc.nextLine(),sc.nextLine()));
		}
		int Q = Integer.parseInt(sc.nextLine());
		while (Q-->0) {
			String tukhoa = sc.nextLine();
			System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tukhoa + ":");
			for (GiangVien giangVien : dsgv) {
				String str = giangVien.getTen().toLowerCase();
				if (str.contains(tukhoa.toLowerCase()))
					System.out.println(giangVien);
			}
		}
		sc.close();
	}

}
