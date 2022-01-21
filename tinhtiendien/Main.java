package tinhtiendien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fin = new File ("KHACHHANG.in");
		Scanner sc = new Scanner (fin);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList <KhachHang> dskhachhang = new ArrayList <>();
		for (int i=0; i<n; i++) {
			String hoten = sc.nextLine();
			String s[] = sc.nextLine().split("\\s+");
			dskhachhang.add(new KhachHang(i+1, hoten, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2])));
		}
		Collections.sort(dskhachhang);
		for (KhachHang kh : dskhachhang) {
			System.out.println(kh);
		}
		sc.close();
	}

}
