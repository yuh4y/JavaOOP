package QuanLyBaiTapNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String[] str = sc.nextLine().split(" ");
		int sosv = Integer.parseInt(str[0]);
		int sonhom = Integer.parseInt(str[1]);
		ArrayList <SinhVien> danhsach = new ArrayList <>();
		while (sosv-->0) {
			danhsach.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine())));
		}
		ArrayList<Object> detai = new ArrayList <>();
		while (sonhom-->0) {
			detai.add(sc.nextLine());
		}
//		int truyvan = Integer.parseInt(sc.nextLine());
//		while(truyvan-->0) {
//			int sttdetai = Integer.parseInt(sc.nextLine());
//			System.out.printf("DANH SACH NHOM %d:\n", sttdetai);
//			for(SinhVien sv : danhsach) {
//				if(sv.getStt()==sttdetai) {
//					System.out.println(sv);
//				}
//			}
//			System.out.printf("Bai tap dang ky: %s\n", detai.get(sttdetai-1));
//		}
		Collections.sort(danhsach);
		for (SinhVien sv : danhsach) {
			System.out.print(sv+" ");
			System.out.println(detai.get(sv.getStt()-1));
		}
		sc.close();
	}

}
