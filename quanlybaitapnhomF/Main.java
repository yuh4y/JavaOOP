package quanlybaitapnhomF;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File finsv = new File ("SINHVIEN.in");
		File finbt = new File ("BAITAP.in");
		File finnhom = new File ("NHOM.in");
		// nhap du lieu sinh vien
		Scanner scsv = new Scanner (finsv);
		ArrayList <SinhVien> dssinhvien = new ArrayList <>();
		int n = Integer.parseInt(scsv.nextLine());
		while (n-->0) {
			dssinhvien.add(new SinhVien (scsv.nextLine(), scsv.nextLine(), scsv.nextLine()));
		}
		scsv.close();
		
		// nhap du lieu bai tap nhom
		Scanner scbt = new Scanner (finbt);
		int t = Integer.parseInt(scbt.nextLine());
		ArrayList <BaiTap> dsbaitap = new ArrayList <>();
		for (int i=0; i< t;i++) {
			dsbaitap.add(new BaiTap (i+1, scbt.nextLine()));
		}
		scbt.close();
		
		// nhap du lieu nhom
//		int k = Integer.parseInt(sc.nextLine());
		Scanner scn = new Scanner (finnhom);
		ArrayList <Nhom> dsnhom = new ArrayList <>();
		while (scn.hasNextLine()) {
			String s[] = scn.nextLine().split("\\s+");
			dsnhom.add(new Nhom (timSV(dssinhvien, s[0]), timBT(dsbaitap, Integer.parseInt(s[1]))));
		}
		Collections.sort(dsnhom);
		for(Nhom sv : dsnhom) {
			System.out.println(sv);
		}
	}
	private static SinhVien timSV(ArrayList <SinhVien> dssv, String masinhvien) {
		for (SinhVien sv : dssv) {
			if (masinhvien.equals(sv.getMa())) 
				return sv;
		}
		return null;
	}
	private static BaiTap timBT(ArrayList <BaiTap> dsbt, int sttbt) {
		for (BaiTap bt : dsbt) {
			if (sttbt == bt.getStt())
				return bt;
		}
		return null;
	}

}
